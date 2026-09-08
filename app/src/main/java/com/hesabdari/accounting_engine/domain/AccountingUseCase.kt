package com.hesabdari.accounting_engine.domain

/** Domain service for basic accounting transaction creation. */
class AccountingUseCase {
    fun createTransaction(amount: Double, referenceId: String): Transaction = Transaction(
        id = 0L,
        referenceId = referenceId,
        amount = amount,
        status = TransactionStatus.DRAFT
    )
}
