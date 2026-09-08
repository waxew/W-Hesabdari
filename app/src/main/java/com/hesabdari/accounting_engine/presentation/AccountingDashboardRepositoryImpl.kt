package com.hesabdari.accounting_engine.presentation

import com.hesabdari.accounting_engine.data.AccountingRepository

class AccountingDashboardRepositoryImpl(
    private val accountingRepository: AccountingRepository
) : AccountingDashboardRepository {
    override suspend fun getTotalIncome(): Double = 0.0
    override suspend fun getTotalExpense(): Double = 0.0
    override suspend fun getBalance(): Double = 0.0
    override suspend fun getTransactionCount(): Int = 0
}
