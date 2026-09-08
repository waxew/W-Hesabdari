package com.hesabdari.accounting_engine.data

class AccountingRepositoryImpl(
    private val dao: AccountingDao
) : AccountingRepository {
    override fun createTransaction(entity: TransactionEntity) {
        dao.saveTransaction(entity)
    }

    override fun createJournalEntry(entity: JournalEntryEntity) {
        dao.saveJournalEntry(entity)
    }

    override fun updateLedgerAccount(entity: LedgerAccountEntity) {
        dao.saveLedgerAccount(entity)
    }
}
