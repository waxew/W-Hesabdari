/*
================================================
نام فایل:
Invoice.kt

وظیفه:
مدل دامنه فاکتور در سیستم حسابداری.

ارتباط:
با Customer، Payment و Accounting Core در ارتباط خواهد بود.

نکات توسعه:
این فایل فقط اطلاعات عمومی فاکتور را نگهداری می‌کند.
اطلاعات اختصاصی کسب‌وکار باید از Module و Attribute Schema تامین شود.
هیچ وابستگی به نوع کسب‌وکار وجود ندارد.
================================================
*/

package com.hesabdari.modules.invoice.domain

/**
 * مدل عمومی فاکتور.
 */
data class Invoice(
    val id: String,
    val customerId: String,
    val invoiceNumber: String,
    val date: Long,
    val totalAmount: Double,
    val status: InvoiceStatus
)

enum class InvoiceStatus {
    DRAFT,
    CONFIRMED,
    PAID,
    CANCELLED
}
