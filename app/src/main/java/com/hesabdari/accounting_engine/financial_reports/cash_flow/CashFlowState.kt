package com.hesabdari.accounting_engine.financial_reports.cash_flow

/**
 * UI state for cash flow financial report.
 */
data class CashFlowState(
    val isLoading: Boolean = false,
    val operatingCashFlow: Double = 0.0,
    val investingCashFlow: Double = 0.0,
    val financingCashFlow: Double = 0.0,
    val netCashChange: Double = 0.0,
    val errorMessage: String? = null
)
