/*
================================================
نام فایل:
PartyDao.kt

وظیفه:
مدیریت دسترسی دیتابیس اشخاص سیستم.

ارتباط:
PartyEntity -> DAO -> Repository

نکات توسعه:
Customer و Supplier به صورت Role در معماری بالاتر مدیریت خواهند شد.
================================================
*/

package com.hesabdari.data.database.dao

import com.hesabdari.data.database.entity.PartyEntity

interface PartyDao {

    suspend fun insert(party: PartyEntity)

    suspend fun getById(id: Long): PartyEntity?
}
