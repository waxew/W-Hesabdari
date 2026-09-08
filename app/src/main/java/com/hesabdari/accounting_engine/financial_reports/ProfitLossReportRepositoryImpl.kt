package com.hesabdari.accounting_engine.financial_reports

/**
 * Implementation layer for Profit and Loss report data access.
 *
 * Connects report calculation logic with accounting core data sources.
 */
class ProfitLossReportRepositoryImpl : ProfitLossReportRepository {

    override suspend fun getReport(
        startDate: Long,
        endDate: Long
    ): ProfitLossReportState {
        return ProfitLossReportState(
            isLoading = false,
            startDate = startDate,
            endDate = endDate
        )
    }
}
