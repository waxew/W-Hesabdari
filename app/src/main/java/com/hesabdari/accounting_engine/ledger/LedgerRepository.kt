package com.hesabdari.accounting_engine.ledger

interface LedgerRepository {
    suspend fun getLedger(accountId: String): LedgerState
}
