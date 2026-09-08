package com.hesabdari.accounting_engine.data

import com.hesabdari.accounting_engine.domain.Transaction

class AccountingRepositoryImpl(
    private val dao: AccountingDao
) : AccountingRepository {

    override suspend fun saveTransaction(transaction: Transaction) {
        dao.insertTransaction(transaction)
    }
}
