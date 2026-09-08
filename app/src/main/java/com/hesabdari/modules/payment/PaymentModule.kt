/*
================================================
نام فایل:
PaymentModule.kt

وظیفه:
تعریف ماژول پرداخت.

ارتباط:
اتصال آینده به Invoice و Accounting Posting Engine.

نکات توسعه:
ثبت دریافت و پرداخت در این Module قرار می‌گیرد.
قوانین حسابداری در Core Engine باقی می‌ماند.
================================================
*/

package com.hesabdari.modules.payment

import com.hesabdari.modules.core.Module

class PaymentModule : Module {
    override val id: String = "payment"
    override val name: String = "Payment"
}
