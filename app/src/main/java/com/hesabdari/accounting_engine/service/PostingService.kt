package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.JournalEntry
import com.hesabdari.accounting_engine.domain.Transaction

/**
 * Service responsible for converting financial events into accounting entries.
 */
class PostingService {

    fun createJournalEntries(transaction: Transaction): List<JournalEntry> {
        if (transaction.amount <= 0.0) return emptyList()

        return listOf(
            JournalEntry(
                id = 0L,
                transactionId = transaction.id,
                accountId = 1L,
                debit = transaction.amount,
                credit = 0.0
            ),
            JournalEntry(
                id = 0L,
                transactionId = transaction.id,
                accountId = 2L,
                debit = 0.0,
                credit = transaction.amount
            )
        )
    }
}
