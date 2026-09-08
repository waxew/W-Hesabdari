package com.hesabdari.accounting_engine.domain

/**
 * Represents a financial transaction created from business events.
 */
data class Transaction(
    val id: Long,
    val referenceId: String,
    val amount: Double,
    val status: TransactionStatus
)

enum class TransactionStatus {
    DRAFT,
    POSTED,
    CANCELLED
}
