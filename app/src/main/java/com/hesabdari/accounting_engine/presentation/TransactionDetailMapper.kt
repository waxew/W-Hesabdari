package com.hesabdari.accounting_engine.presentation

/**
 * Maps accounting domain data into UI state models.
 * Keeps presentation layer independent from accounting core models.
 */
object TransactionDetailMapper {

    fun map(
        transactionId: String,
        reference: String,
        amount: Double,
        status: String,
        debitAccount: String,
        creditAccount: String
    ): TransactionDetailState {
        return TransactionDetailState(
            isLoading = false,
            transactionId = transactionId,
            reference = reference,
            amount = amount,
            status = status,
            debitAccount = debitAccount,
            creditAccount = creditAccount,
            errorMessage = null
        )
    }
}
