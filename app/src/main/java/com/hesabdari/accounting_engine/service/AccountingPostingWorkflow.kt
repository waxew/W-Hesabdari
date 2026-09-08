package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.Transaction

/** Orchestrates the accounting posting pipeline. */
class AccountingPostingWorkflow(
    private val postingService: PostingService
) {

    fun post(transaction: Transaction): PostingResult {
        val entries = postingService.createJournalEntries(transaction)

        return PostingResult(
            transactionId = transaction.id,
            entriesCount = entries.size,
            success = true
        )
    }
}

data class PostingResult(
    val transactionId: Long,
    val entriesCount: Int,
    val success: Boolean
)
