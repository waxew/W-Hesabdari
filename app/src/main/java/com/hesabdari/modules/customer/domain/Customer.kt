/*
================================================
نام فایل:
Customer.kt

وظیفه:
مدل اصلی مشتری در ماژول Customer.

ارتباط:
این فایل بخشی از Module مشتری است و به Core Accounting وابسته نیست.
اطلاعات مالی از طریق Transaction و Accounting Engine مدیریت می‌شود.

نکات توسعه:
از اضافه کردن فیلدهای اختصاصی کسب‌وکار به این مدل خودداری شود.
================================================
*/

package com.hesabdari.modules.customer.domain

/**
 * مدل عمومی مشتری قابل استفاده در تمام Business Profile ها.
 */
data class Customer(
    val id: String,
    val name: String,
    val phone: String?,
    val email: String?
)
