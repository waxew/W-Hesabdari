package com.hesabdari.accounting_engine.financial_reports

/**
 * UI state for Profit and Loss report.
 */
data class ProfitLossReportState(
    val isLoading: Boolean = false,
    val revenue: Double = 0.0,
    val expense: Double = 0.0,
    val grossProfit: Double = 0.0,
    val netProfit: Double = 0.0,
    val errorMessage: String? = null
)
