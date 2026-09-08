/*
================================================
نام فایل:
PartyEntity.kt

وظیفه:
مدل ذخیره سازی اشخاص سیستم.

ارتباط:
Domain Party <-> Database Entity

نکات توسعه:
Customer و Supplier به عنوان نقش های Party مدیریت می شوند.
================================================
*/

package com.hesabdari.data.database.entity

/**
 * Entity عمومی شخص یا طرف حساب.
 */
data class PartyEntity(
    val id: Long,
    val name: String,
    val phone: String,
    val type: String
)
