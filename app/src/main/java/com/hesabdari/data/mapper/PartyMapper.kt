/*
================================================
نام فایل:
PartyMapper.kt

وظیفه:
تبدیل اطلاعات اشخاص بین Database و Domain.

ارتباط:
PartyEntity <-> Party

نکات توسعه:
مشتری و تامین‌کننده به صورت نقش‌های Party مدیریت می‌شوند.
================================================
*/

package com.hesabdari.data.mapper

import com.hesabdari.data.database.entity.PartyEntity
import com.hesabdari.domain.party.Party

object PartyMapper {

    fun toDomain(entity: PartyEntity): Party {
        return Party(
            id = entity.id,
            name = entity.name,
            phone = entity.phone,
            role = entity.role
        )
    }

    fun toEntity(domain: Party): PartyEntity {
        return PartyEntity(
            id = domain.id,
            name = domain.name,
            phone = domain.phone,
            role = domain.role
        )
    }
}
