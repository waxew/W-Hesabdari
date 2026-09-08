package com.hesabdari.accounting_engine.presentation

import com.hesabdari.accounting_engine.data.AccountingRepository

class TransactionDetailRepositoryImpl(
    private val accountingRepository: AccountingRepository
) : TransactionDetailRepository {
    override suspend fun getTransactionDetail(transactionId: String): TransactionDetailState =
        TransactionDetailState(
            isLoading = false,
            transactionId = transactionId,
            errorMessage = null
        )
}
