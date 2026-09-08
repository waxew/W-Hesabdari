package com.hesabdari.accounting_engine.financial_reports.balance_sheet

/**
 * Maps accounting domain data into BalanceSheetState.
 */
object BalanceSheetMapper {

    fun map(
        assets: Double,
        liabilities: Double,
        equity: Double
    ): BalanceSheetState {
        return BalanceSheetState(
            assets = assets,
            liabilities = liabilities,
            equity = equity,
            isBalanced = assets == (liabilities + equity)
        )
    }
}
