package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.JournalEntry

/**
 * Creates debit and credit entries from a transaction.
 * Internal accounting identifiers use Long to match the domain model.
 */
class JournalPostingService {

    fun createJournalEntries(
        transactionId: Long,
        debitAccountId: Long,
        creditAccountId: Long,
        amount: Double
    ): List<JournalEntry> = listOf(
        JournalEntry(
            id = 0L,
            transactionId = transactionId,
            accountId = debitAccountId,
            debit = amount,
            credit = 0.0
        ),
        JournalEntry(
            id = 0L,
            transactionId = transactionId,
            accountId = creditAccountId,
            debit = 0.0,
            credit = amount
        )
    )
}
