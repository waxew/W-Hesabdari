/*
================================================
نام فایل:
CustomerDao.kt

وظیفه:
تعریف عملیات دسترسی به داده های مشتری در Room.

ارتباط:
Customer Repository با این DAO به Database متصل می‌شود.

نکات توسعه:
منطق کسب و کار نباید داخل DAO قرار گیرد.
================================================
*/

package com.hesabdari.modules.customer.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CustomerDao {

    @Insert
    suspend fun insert(customer: CustomerEntity)

    @Query("SELECT * FROM customers")
    suspend fun getAll(): List<CustomerEntity>
}
