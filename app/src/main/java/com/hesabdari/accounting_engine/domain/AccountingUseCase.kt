package com.hesabdari.accounting_engine.domain

/**
 * Domain contract for accounting operations.
 * This layer contains accounting rules only and has no dependency on UI or database.
 */
class AccountingUseCase {

    fun createTransaction(amount: Double, referenceId: String): Transaction {
        return Transaction(
            id = 0L,
            referenceId = referenceId,
            amount = amount,
            status = "DRAFT"
        )
    }
}
