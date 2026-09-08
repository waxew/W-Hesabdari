package com.hesabdari.accounting_engine.service

import com.hesabdari.accounting_engine.domain.LedgerAccount

class LedgerUpdateService {

    fun applyEntry(
        account: LedgerAccount,
        debit: Double,
        credit: Double
    ): LedgerAccount {
        return account.copy(
            balance = account.balance + debit - credit
        )
    }
}
