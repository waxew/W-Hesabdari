/*
================================================
نام فایل:
Payment.kt

وظیفه:
مدل پرداخت عمومی سیستم حسابداری.

ارتباط:
به Invoice و Accounting Core متصل می‌شود.

نکات توسعه:
روش‌های پرداخت باید قابل توسعه باشند.
================================================
*/

package com.hesabdari.domain.payment

/**
 * ثبت پرداخت بدون وابستگی به نوع کسب‌وکار.
 */
data class Payment(
    val id: String,
    val amount: Double,
    val method: PaymentMethod
)

enum class PaymentMethod {
    CASH,
    CARD,
    TRANSFER,
    OTHER
}
