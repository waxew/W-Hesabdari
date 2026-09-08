package com.hesabdari.accounting_engine.financial_reports.cash_flow

/** پیاده‌سازی اولیه گزارش جریان نقدی. */
class CashFlowRepositoryImpl : CashFlowRepository {
    override suspend fun getCashFlowReport(
        startDate: Long,
        endDate: Long
    ): Result<CashFlowState> = Result.success(
        CashFlowState(
            isLoading = false,
            operatingCashFlow = 0.0,
            investingCashFlow = 0.0,
            financingCashFlow = 0.0,
            netCashChange = 0.0,
            errorMessage = null
        )
    )
}
