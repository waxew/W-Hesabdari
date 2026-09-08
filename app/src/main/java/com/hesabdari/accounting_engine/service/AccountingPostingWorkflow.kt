package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.Transaction

/**
 * Coordinates the complete accounting posting workflow.
 * This layer only orchestrates accounting services and does not contain
 * business-profile specific rules.
 */
class AccountingPostingWorkflow(
    private val postingService: PostingService,
    private val journalPostingService: JournalPostingService,
    private val ledgerUpdateService: LedgerUpdateService
) {

    fun post(transaction: Transaction) {
        postingService.createTransaction(transaction)
        journalPostingService.createEntries(transaction)
        ledgerUpdateService.update(transaction)
    }
}
