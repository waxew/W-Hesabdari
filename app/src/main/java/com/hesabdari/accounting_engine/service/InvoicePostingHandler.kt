package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.AccountingUseCase
import com.hesabdari.accounting_engine.domain.Transaction

/**
 * Connects confirmed invoices to the accounting posting workflow.
 * Business-specific rules should be provided through configuration.
 */
class InvoicePostingHandler(
    private val accountingUseCase: AccountingUseCase
) {

    fun postConfirmedInvoice(
        invoiceId: String,
        amount: Double
    ): Transaction {
        return accountingUseCase.createTransaction(
            referenceId = invoiceId,
            amount = amount
        )
    }
}
