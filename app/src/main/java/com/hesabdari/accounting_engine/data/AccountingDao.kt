package com.hesabdari.accounting_engine.data

interface AccountingDao {
    fun saveTransaction(entity: TransactionEntity)
    fun saveJournalEntry(entity: JournalEntryEntity)
    fun saveLedgerAccount(entity: LedgerAccountEntity)
}
