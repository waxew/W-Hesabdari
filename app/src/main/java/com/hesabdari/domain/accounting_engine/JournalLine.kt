package com.hesabdari.domain.accounting_engine

/*
================================================
نام فایل:
JournalLine.kt

وظیفه:
مدل یک ردیف از سند حسابداری.

ارتباط:
JournalEntry -> JournalLine -> Account

نکات توسعه:
این فایل بخشی از هسته عمومی حسابداری است و نباید شامل اطلاعات کسب و کار باشد.
مواردی مثل فروشگاه، کلینیک یا رستوران باید در Business Profile مدیریت شوند.
================================================
*/

/**
 * هر سند حسابداری حداقل شامل یک بدهکار و یک بستانکار است.
 */
data class JournalLine(
    val accountId: String,
    val debitAmount: Double,
    val creditAmount: Double,
    val description: String? = null
)
