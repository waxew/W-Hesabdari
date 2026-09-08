package com.hesabdari.accounting_engine.presentation

import com.hesabdari.accounting_engine.domain.AccountingUseCase

class AccountingDashboardUseCase(
    private val accountingUseCase: AccountingUseCase
) {

    suspend fun loadDashboard(): AccountingState {
        return AccountingState(
            isLoading = false,
            totalIncome = 0.0,
            totalExpense = 0.0,
            balance = 0.0,
            transactionCount = 0
        )
    }
}
