/*
================================================
نام فایل:
PaymentViewModel.kt

وظیفه:
مدیریت وضعیت صفحه پرداخت.

ارتباط:
UI پرداخت -> ViewModel -> RegisterPaymentUseCase

نکات توسعه:
روش‌های پرداخت عمومی هستند و وابسته به نوع کسب‌وکار نیستند.
================================================
*/

package com.hesabdari.presentation.payment

import androidx.lifecycle.ViewModel

class PaymentViewModel : ViewModel() {

    // آماده‌سازی صفحه پرداخت
    fun initialize() {
        // بارگذاری اولیه اطلاعات پرداخت
    }
}
