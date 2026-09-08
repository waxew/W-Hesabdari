package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.JournalEntry

class JournalPostingService {
    fun createJournalEntries(
        transactionId: String,
        debitAccountId: String,
        creditAccountId: String,
        amount: Double
    ): List<JournalEntry> = listOf(
        JournalEntry(
            id = 0L,
            transactionId = transactionId.toLongOrNull() ?: 0L,
            accountId = debitAccountId.toLongOrNull() ?: 0L,
            debit = amount,
            credit = 0.0
        ),
        JournalEntry(
            id = 0L,
            transactionId = transactionId.toLongOrNull() ?: 0L,
            accountId = creditAccountId.toLongOrNull() ?: 0L,
            debit = 0.0,
            credit = amount
        )
    )
}
