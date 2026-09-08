/*
================================================
نام فایل:
TransactionDao.kt

وظیفه:
مدیریت دسترسی دیتابیس تراکنش های مالی.

ارتباط:
TransactionEntity -> DAO -> Repository

نکات توسعه:
فقط عملیات ذخیره و بازیابی داده در این لایه انجام می شود.
================================================
*/

package com.hesabdari.data.database.dao

import com.hesabdari.data.database.entity.TransactionEntity

interface TransactionDao {

    suspend fun insert(transaction: TransactionEntity)

    suspend fun getById(id: Long): TransactionEntity?
}
