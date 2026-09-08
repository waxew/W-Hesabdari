/*
================================================
نام فایل:
InvoiceEntity.kt

وظیفه:
مدل ذخیره سازی فاکتور در Database.

ارتباط:
Domain Invoice <-> Database Entity

نکات توسعه:
قالب و قوانین اختصاصی کسب و کار باید خارج از این Entity باشد.
================================================
*/

package com.hesabdari.data.database.entity

/**
 * Entity عمومی فاکتور.
 */
data class InvoiceEntity(
    val id: Long,
    val number: String,
    val totalAmount: Double,
    val status: String
)
