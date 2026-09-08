/*
================================================
نام فایل:
Party.kt

وظیفه:
مدل عمومی اشخاص در سیستم حسابداری.

ارتباط:
Customer، Supplier و سایر نقش‌ها در آینده از این مفهوم استفاده می‌کنند.

نکات توسعه:
به جای ساخت Entity جدا برای هر کسب‌وکار، Core از مفهوم عمومی Party استفاده می‌کند.
================================================
*/

package com.hesabdari.domain.party

/**
 * شخص یا مجموعه طرف حساب سیستم.
 */
data class Party(
    val id: String,
    val name: String,
    val phone: String? = null,
    val address: String? = null
)
