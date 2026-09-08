/*
================================================
نام فایل:
Invoice.kt

وظیفه:
مدل فاکتور عمومی سیستم.

ارتباط:
به ماژول فروش و ثبت مالی متصل می‌شود.

نکات توسعه:
جزئیات کسب‌وکارها نباید داخل این مدل قرار گیرد.
================================================
*/

package com.hesabdari.domain.invoice

/**
 * فاکتور عمومی که برای تمام Business Profileها قابل استفاده است.
 */
data class Invoice(
    val id: String,
    val number: String,
    val totalAmount: Double,
    val status: InvoiceStatus
)

enum class InvoiceStatus {
    DRAFT,
    CONFIRMED,
    PAID,
    CANCELLED
}
