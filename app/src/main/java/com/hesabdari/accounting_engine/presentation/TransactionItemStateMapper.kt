package com.hesabdari.accounting_engine.presentation

import com.hesabdari.accounting_engine.domain.Transaction

object TransactionItemStateMapper {
    fun map(transaction: Transaction): TransactionItemState = TransactionItemState(
        id = transaction.id.toString(),
        title = transaction.referenceId,
        amount = transaction.amount,
        type = transaction.status.name,
        date = ""
    )
}
