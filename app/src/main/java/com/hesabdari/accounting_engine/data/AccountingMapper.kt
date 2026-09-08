package com.hesabdari.accounting_engine.data

import com.hesabdari.accounting_engine.domain.LedgerAccount
import com.hesabdari.accounting_engine.domain.Transaction

/**
 * Converts accounting domain objects to persistence objects.
 */
object AccountingMapper {

    fun map(account: LedgerAccount): LedgerAccountEntity {
        return LedgerAccountEntity(
            id = account.id,
            code = account.code,
            name = account.name,
            balance = account.balance
        )
    }
}
