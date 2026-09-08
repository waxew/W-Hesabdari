/*
================================================
نام فایل:
TransactionEntity.kt

وظیفه:
مدل ذخیره سازی تراکنش مالی.

ارتباط:
Domain Transaction <-> Database Entity

نکات توسعه:
تمام Business Logic باید خارج از Entity باقی بماند.
================================================
*/

package com.hesabdari.data.database.entity

/**
 * Entity عمومی تراکنش مالی.
 */
data class TransactionEntity(
    val id: Long,
    val accountId: Long,
    val amount: Double,
    val description: String
)
