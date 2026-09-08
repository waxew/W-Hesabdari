package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.Transaction

/** Orchestrates the accounting posting pipeline. */
class AccountingPostingWorkflow(
    private val postingService: PostingService,
    private val journalPostingService: JournalPostingService,
    private val ledgerUpdateService: LedgerUpdateService
) {
    fun post(transaction: Transaction) {
        // Transaction validation and journal generation are handled by services.
        // Keep workflow independent from business profiles.
        postingService.createJournalEntries(transaction)
    }
}
