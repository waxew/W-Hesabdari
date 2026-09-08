package com.hesabdari.accounting_engine.financial_reports.balance_sheet

/** پیاده‌سازی اولیه ترازنامه. */
class BalanceSheetRepositoryImpl : BalanceSheetRepository {
    override suspend fun getBalanceSheet(
        startDate: String,
        endDate: String
    ): BalanceSheetState = BalanceSheetState(
        isLoading = false,
        assets = 0.0,
        liabilities = 0.0,
        equity = 0.0,
        isBalanced = true,
        errorMessage = null
    )
}
