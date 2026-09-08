package com.hesabdari.accounting_engine.domain

/**
 * Defines a generic accounting posting rule.
 * Does not contain business-specific logic.
 */
data class PostingRule(
    val id: String,
    val name: String,
    val debitAccountId: String,
    val creditAccountId: String
)
