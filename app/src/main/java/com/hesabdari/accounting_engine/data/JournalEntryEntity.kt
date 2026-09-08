package com.hesabdari.accounting_engine.data

/**
 * Database representation of debit and credit journal entry.
 */
data class JournalEntryEntity(
    val id: Long,
    val transactionId: Long,
    val accountId: Long,
    val debit: Double,
    val credit: Double
)
