/*
================================================
نام فایل:
InvoiceEntity.kt

وظیفه:
مدل ذخیره سازی فاکتور در لایه Database.

ارتباط:
Invoice Domain Model
<->
Invoice Mapper
<->
Room Database

نکات توسعه:
این فایل نباید شامل اطلاعات اختصاصی کسب و کار باشد.
ویژگی هایی مانند IMEI، رنگ، سایز، هزینه تولید و موارد مشابه
باید از Module یا Attribute Schema تامین شوند.
================================================
*/

package com.hesabdari.modules.invoice.data

/**
 * Entity عمومی فاکتور برای ذخیره سازی.
 */
data class InvoiceEntity(
    val id: Long,
    val customerId: Long,
    val invoiceNumber: String,
    val date: Long,
    val totalAmount: Double,
    val status: String
)
