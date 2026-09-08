/*
================================================
نام فایل:
InvoiceUseCase.kt

وظیفه:
تعریف Workflow های اصلی فاکتور در لایه Domain.

ارتباط:
با Validator و Repository آینده Invoice ارتباط دارد.

نکات توسعه:
این فایل نباید شامل منطق Database یا منطق اختصاصی کسب و کار باشد.
تنظیمات اختصاصی از Business Profile و Module Configuration دریافت می‌شوند.
================================================
*/

package com.hesabdari.modules.invoice.domain

class InvoiceUseCase {

    fun validate(invoice: Invoice): Boolean {
        return InvoiceValidator().validate(invoice)
    }
}
