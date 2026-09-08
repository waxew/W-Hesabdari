package com.hesabdari.accounting_engine.presentation

class AccountingDashboardUseCase(
    private val repository: AccountingDashboardRepository
) {
    suspend fun loadDashboard(): AccountingState = AccountingState(
        isLoading = false,
        totalIncome = repository.getTotalIncome().toLong(),
        totalExpense = repository.getTotalExpense().toLong(),
        balance = repository.getBalance().toLong(),
        transactionCount = repository.getTransactionCount()
    )
}
