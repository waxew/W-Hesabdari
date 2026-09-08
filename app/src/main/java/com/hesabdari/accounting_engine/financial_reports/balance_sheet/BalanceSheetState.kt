package com.hesabdari.accounting_engine.financial_reports.balance_sheet

/**
 * UI state for Balance Sheet report.
 */
data class BalanceSheetState(
    val isLoading: Boolean = false,
    val assets: Double = 0.0,
    val liabilities: Double = 0.0,
    val equity: Double = 0.0,
    val isBalanced: Boolean = true,
    val errorMessage: String? = null
)
