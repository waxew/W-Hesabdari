/*
================================================
نام فایل:
AccountEntity.kt

وظیفه:
مدل ذخیره سازی حساب در لایه Database.

ارتباط:
Domain Account <-> Database Entity

نکات توسعه:
این فایل فقط برای نگهداری داده است و نباید شامل منطق حسابداری باشد.
================================================
*/

package com.hesabdari.data.database.entity

/**
 * Entity عمومی حسابداری.
 */
data class AccountEntity(
    val id: Long,
    val code: String,
    val name: String,
    val type: String
)
