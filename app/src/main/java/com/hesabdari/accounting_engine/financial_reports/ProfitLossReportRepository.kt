package com.hesabdari.accounting_engine.financial_reports

interface ProfitLossReportRepository {
    suspend fun getReport(
        startDate: String,
        endDate: String
    ): ProfitLossReportState
}
