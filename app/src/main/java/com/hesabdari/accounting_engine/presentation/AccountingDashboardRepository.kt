package com.hesabdari.accounting_engine.presentation

interface AccountingDashboardRepository {

    suspend fun getTotalIncome(): Double

    suspend fun getTotalExpense(): Double

    suspend fun getBalance(): Double

    suspend fun getTransactionCount(): Int
}
