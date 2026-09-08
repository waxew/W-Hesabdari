package com.hesabdari.accounting_engine.data

/**
 * Database representation of financial transaction.
 */
data class TransactionEntity(
    val id: Long,
    val referenceId: String,
    val amount: Double,
    val status: String
)
