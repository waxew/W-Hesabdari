/*
================================================
نام فایل:
CustomerEntity.kt

وظیفه:
مدل ذخیره سازی مشتری در لایه Data.

ارتباط:
Domain Customer <- Repository <- Database

نکات توسعه:
این Entity فقط اطلاعات عمومی مشتری را نگهداری می‌کند.
اطلاعات اختصاصی کسب و کار باید از Business Profile و Attribute Schema تامین شود.
================================================
*/

package com.hesabdari.modules.customer.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
data class CustomerEntity(
    @PrimaryKey
    val id: String,
    val name: String,
    val phone: String,
    val email: String?
)
