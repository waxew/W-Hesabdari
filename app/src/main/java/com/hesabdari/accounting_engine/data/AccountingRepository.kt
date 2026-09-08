package com.hesabdari.accounting_engine.data

interface AccountingRepository {
    fun createTransaction(entity: TransactionEntity)
    fun createJournalEntry(entity: JournalEntryEntity)
    fun updateLedgerAccount(entity: LedgerAccountEntity)
}
