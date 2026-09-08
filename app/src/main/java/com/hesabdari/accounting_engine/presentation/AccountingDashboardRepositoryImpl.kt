package com.hesabdari.accounting_engine.presentation

import com.hesabdari.accounting_engine.data.AccountingRepository

class AccountingDashboardRepositoryImpl(
    private val accountingRepository: AccountingRepository
) : AccountingDashboardRepository {

    override suspend fun getDashboardData(): AccountingState {
        return AccountingState(
            totalIncome = 0.0,
            totalExpense = 0.0,
            balance = 0.0,
            transactionCount = 0,
            isLoading = false
        )
    }
}
