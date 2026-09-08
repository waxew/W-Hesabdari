/*
================================================
نام فایل:
InvoiceViewModel.kt

وظیفه:
مدیریت وضعیت صفحه فاکتور و ارتباط UI با UseCaseهای مربوطه.

ارتباط:
Compose UI -> ViewModel -> UseCase -> Repository

نکات توسعه:
این فایل نباید شامل منطق حسابداری باشد.
منطق ثبت فاکتور در لایه UseCase قرار دارد.
================================================
*/

package com.hesabdari.presentation.invoice

import androidx.lifecycle.ViewModel

class InvoiceViewModel : ViewModel() {

    // وضعیت اولیه صفحه فاکتور
    fun initialize() {
        // آماده‌سازی داده‌های مورد نیاز صفحه
    }
}
