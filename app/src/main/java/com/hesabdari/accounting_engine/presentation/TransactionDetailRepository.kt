package com.hesabdari.accounting_engine.presentation

/**
 * Repository contract for loading accounting transaction details.
 */
interface TransactionDetailRepository {
    suspend fun getTransactionDetail(transactionId: String): TransactionDetailState
}
