/*
================================================
نام فایل:
AccountDao.kt

وظیفه:
تعریف دسترسی دیتابیس برای حساب های مالی.

ارتباط:
Entity Layer <- DAO <- Repository

نکات توسعه:
این فایل فقط مسئول ارتباط با دیتابیس است و منطق حسابداری داخل آن قرار نمی گیرد.
================================================
*/

package com.hesabdari.data.database.dao

import com.hesabdari.data.database.entity.AccountEntity

interface AccountDao {

    suspend fun insert(account: AccountEntity)

    suspend fun getById(id: Long): AccountEntity?
}
