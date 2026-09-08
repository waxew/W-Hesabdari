package com.hesabdari.accounting_engine.data

/**
 * Persistence model for general ledger accounts.
 */
data class LedgerAccountEntity(
    val id: Long,
    val code: String,
    val name: String,
    val balance: Double
)
