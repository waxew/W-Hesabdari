package com.hesabdari.accounting_engine.financial_reports.balance_sheet

/**
 * Implementation layer for Balance Sheet data retrieval.
 *
 * This class connects Balance Sheet calculations with accounting data sources.
 * Actual database integration will be connected through Accounting Core repositories.
 */
class BalanceSheetRepositoryImpl : BalanceSheetRepository {

    override suspend fun getBalanceSheet(): BalanceSheetState {
        return BalanceSheetState(
            isLoading = false,
            assets = 0.0,
            liabilities = 0.0,
            equity = 0.0,
            isBalanced = true,
            errorMessage = null
        )
    }
}
