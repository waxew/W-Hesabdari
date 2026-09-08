package com.hesabdari.accounting_engine.accounting_dashboard

/**
 * State model for Accounting Dashboard.
 * Aggregates financial summaries from reporting modules.
 */
data class DashboardState(
    val isLoading: Boolean = false,
    val netProfit: Double = 0.0,
    val cashBalance: Double = 0.0,
    val totalAssets: Double = 0.0,
    val totalLiabilities: Double = 0.0,
    val financialStatus: String = "",
    val errorMessage: String? = null
)
