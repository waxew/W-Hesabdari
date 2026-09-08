package com.hesabdari.accounting_engine.financial_reports.balance_sheet

interface BalanceSheetRepository {
    suspend fun getBalanceSheet(startDate: String, endDate: String): BalanceSheetState
}
