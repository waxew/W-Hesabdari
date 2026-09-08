package com.hesabdari.accounting_engine.presentation

interface TransactionHistoryRepository {
    suspend fun getTransactions(): List<TransactionItemState>
}
