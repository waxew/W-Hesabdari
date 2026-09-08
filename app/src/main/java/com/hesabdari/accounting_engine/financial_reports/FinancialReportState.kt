package com.hesabdari.accounting_engine.financial_reports

/**
 * State model for financial reports UI.
 */
data class FinancialReportState(
    val isLoading: Boolean = false,
    val startDate: String? = null,
    val endDate: String? = null,
    val totalIncome: Double = 0.0,
    val totalExpense: Double = 0.0,
    val netProfit: Double = 0.0,
    val errorMessage: String? = null
)
