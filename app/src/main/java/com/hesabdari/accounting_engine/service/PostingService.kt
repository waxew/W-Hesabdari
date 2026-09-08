package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.JournalEntry
import com.hesabdari.accounting_engine.domain.Transaction

/**
 * Service responsible for converting financial events into accounting entries.
 */
class PostingService {

    fun createJournalEntries(transaction: Transaction): List<JournalEntry> {
        return emptyList()
    }
}
