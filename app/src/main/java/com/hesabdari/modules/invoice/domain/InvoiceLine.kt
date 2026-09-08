/*
================================================
نام فایل:
InvoiceLine.kt

وظیفه:
تعریف آیتم عمومی داخل فاکتور.

ارتباط:
با Invoice Domain و Accounting Workflow ارتباط دارد.

نکات توسعه:
اطلاعات اختصاصی کسب‌وکار نباید در این مدل قرار گیرد.
ویژگی‌هایی مانند IMEI، رنگ، سایز و ... از Attribute Schema تامین می‌شوند.
================================================
*/

package com.hesabdari.modules.invoice.domain


data class InvoiceLine(
    val id: String,
    val invoiceId: String,
    val description: String,
    val quantity: Double,
    val unitPrice: Double
)
