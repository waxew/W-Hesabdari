package com.hesabdari.accounting_engine.presentation

class TransactionDetailRepositoryImpl(
    private val accountingRepository: AccountingRepository
) : TransactionDetailRepository {

    override suspend fun getTransactionDetail(transactionId: String): TransactionDetailState {
        val transaction = accountingRepository.getTransaction(transactionId)

        return TransactionDetailState(
            isLoading = false,
            transactionId = transactionId,
            reference = transaction.reference,
            amount = transaction.amount,
            status = transaction.status,
            debitAccount = transaction.debitAccount,
            creditAccount = transaction.creditAccount,
            errorMessage = null
        )
    }
}
