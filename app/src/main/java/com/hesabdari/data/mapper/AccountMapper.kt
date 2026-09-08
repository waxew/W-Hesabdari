/*
================================================
نام فایل:
AccountMapper.kt

وظیفه:
تبدیل اطلاعات بین AccountEntity و مدل Domain.

ارتباط:
Database Layer <-> Domain Layer

نکات توسعه:
تغییرات دیتابیس نباید مستقیم به Core Domain منتقل شوند.
================================================
*/

package com.hesabdari.data.mapper

import com.hesabdari.data.database.entity.AccountEntity
import com.hesabdari.domain.account.Account

object AccountMapper {

    fun toDomain(entity: AccountEntity): Account {
        return Account(
            id = entity.id,
            code = entity.code,
            name = entity.name,
            type = entity.type
        )
    }

    fun toEntity(domain: Account): AccountEntity {
        return AccountEntity(
            id = domain.id,
            code = domain.code,
            name = domain.name,
            type = domain.type
        )
    }
}
