package com.hesabdari.accounting_engine.financial_reports

/** پیاده‌سازی اولیه گزارش سود و زیان. */
class ProfitLossReportRepositoryImpl : ProfitLossReportRepository {
    override suspend fun getReport(
        startDate: String,
        endDate: String
    ): ProfitLossReportState = ProfitLossReportState(isLoading = false)
}
