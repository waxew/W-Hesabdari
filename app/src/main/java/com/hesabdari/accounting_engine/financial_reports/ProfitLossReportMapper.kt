package com.hesabdari.accounting_engine.financial_reports

object ProfitLossReportMapper {

    fun calculateNetProfit(
        revenue: Double,
        expense: Double
    ): Double {
        return revenue - expense
    }

    fun map(
        revenue: Double,
        expense: Double
    ): ProfitLossReportState {
        return ProfitLossReportState(
            isLoading = false,
            revenue = revenue,
            expense = expense,
            grossProfit = revenue - expense,
            netProfit = revenue - expense,
            errorMessage = null
        )
    }
}
