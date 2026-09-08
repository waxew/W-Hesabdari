package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.JournalEntry

class JournalPostingService {

    fun createJournalEntries(
        transactionId: String,
        debitAccountId: String,
        creditAccountId: String,
        amount: Double
    ): List<JournalEntry> {
        return listOf(
            JournalEntry(
                transactionId = transactionId,
                accountId = debitAccountId,
                debit = amount,
                credit = 0.0
            ),
            JournalEntry(
                transactionId = transactionId,
                accountId = creditAccountId,
                debit = 0.0,
                credit = amount
            )
        )
    }
}
