package com.hesabdari.accounting_engine.data

import com.hesabdari.accounting_engine.domain.LedgerAccount

/** Converts accounting domain objects to persistence objects. */
object AccountingMapper {
    fun map(account: LedgerAccount): LedgerAccountEntity = LedgerAccountEntity(
        id = account.id.toLongOrNull() ?: 0L,
        code = account.code,
        name = account.name,
        balance = account.balance
    )
}
