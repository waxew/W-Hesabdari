package com.hesabdari.accounting_engine.financial_reports.cash_flow

/**
 * Implementation layer for cash flow report data access.
 *
 * This class connects financial report calculations with accounting core data.
 */
class CashFlowRepositoryImpl : CashFlowRepository {

    override suspend fun getCashFlowReport(): CashFlowState {
        return CashFlowState(
            isLoading = false,
            operatingCashFlow = 0.0,
            investingCashFlow = 0.0,
            financingCashFlow = 0.0,
            netCashChange = 0.0,
            errorMessage = null
        )
    }
}
