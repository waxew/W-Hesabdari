package com.hesabdari.accounting_engine.financial_reports.cash_flow

interface CashFlowRepository {
    suspend fun getCashFlowReport(
        startDate: Long,
        endDate: Long
    ): Result<CashFlowState>
}
