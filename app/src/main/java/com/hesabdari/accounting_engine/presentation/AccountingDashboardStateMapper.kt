package com.hesabdari.accounting_engine.presentation

/**
 * Maps accounting domain data into dashboard presentation state.
 * Keeps UI independent from accounting data models.
 */
class AccountingDashboardStateMapper {
    fun map(
        income: Long,
        expense: Long,
        balance: Long,
        transactionCount: Int
    ): AccountingState {
        return AccountingState(
            totalIncome = income,
            totalExpense = expense,
            balance = balance,
            transactionCount = transactionCount
        )
    }
}
