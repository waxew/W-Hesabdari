package com.hesabdari.accounting_engine.domain

/**
 * General ledger account model.
 * Independent from business profile configuration.
 */
data class LedgerAccount(
    val id: String,
    val code: String,
    val name: String,
    val balance: Double
)
