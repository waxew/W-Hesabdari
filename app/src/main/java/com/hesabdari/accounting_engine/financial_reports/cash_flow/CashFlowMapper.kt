package com.hesabdari.accounting_engine.financial_reports.cash_flow

/**
 * Maps accounting domain data into CashFlowState.
 */
class CashFlowMapper {

    fun map(
        operatingCashFlow: Double,
        investingCashFlow: Double,
        financingCashFlow: Double
    ): CashFlowState {
        return CashFlowState(
            operatingCashFlow = operatingCashFlow,
            investingCashFlow = investingCashFlow,
            financingCashFlow = financingCashFlow,
            netCashChange = operatingCashFlow + investingCashFlow + financingCashFlow
        )
    }
}
