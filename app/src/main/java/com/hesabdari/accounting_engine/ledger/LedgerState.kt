package com.hesabdari.accounting_engine.ledger

/**
 * UI state for ledger detail screen.
 */
data class LedgerState(
    val isLoading: Boolean = false,
    val accountId: String = "",
    val accountName: String = "",
    val openingBalance: Double = 0.0,
    val debitTotal: Double = 0.0,
    val creditTotal: Double = 0.0,
    val closingBalance: Double = 0.0,
    val errorMessage: String? = null
)
