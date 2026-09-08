package com.hesabdari.accounting_engine.presentation

/**
 * UI state for transaction detail screen.
 */
data class TransactionDetailState(
    val isLoading: Boolean = false,
    val transactionId: String = "",
    val reference: String = "",
    val amount: Double = 0.0,
    val status: String = "",
    val debitAccount: String = "",
    val creditAccount: String = "",
    val errorMessage: String? = null
)
