package com.hesabdari.accounting_engine.domain

/**
 * Represents debit and credit posting entries.
 */
data class JournalEntry(
    val id: Long,
    val transactionId: Long,
    val accountId: Long,
    val debit: Double,
    val credit: Double
)
