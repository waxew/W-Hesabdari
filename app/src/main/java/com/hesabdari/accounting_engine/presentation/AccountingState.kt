package com.hesabdari.accounting_engine.presentation

/**
 * UI state container for accounting dashboard.
 */
data class AccountingState(
    val totalIncome: Long = 0,
    val totalExpense: Long = 0,
    val balance: Long = 0,
    val transactionCount: Int = 0,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
