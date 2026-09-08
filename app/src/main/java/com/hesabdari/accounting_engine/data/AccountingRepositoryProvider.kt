package com.hesabdari.accounting_engine.data

class AccountingRepositoryProvider {
    fun create(dao: AccountingDao): AccountingRepository {
        return AccountingRepositoryImpl(dao)
    }
}
