/*
================================================
نام فایل:
InvoiceLineEntity.kt

وظیفه:
مدل ذخیره سازی ردیف های فاکتور.

ارتباط:
InvoiceLine Domain
<->
Room Database

نکات توسعه:
این Entity فقط اطلاعات عمومی خط فاکتور را نگهداری می کند.
Attribute های اختصاصی کسب و کار نباید به صورت Field ثابت اضافه شوند.
================================================
*/

package com.hesabdari.modules.invoice.data

/**
 * Entity عمومی آیتم فاکتور.
 */
data class InvoiceLineEntity(
    val id: Long,
    val invoiceId: Long,
    val description: String,
    val quantity: Double,
    val unitPrice: Double
)
