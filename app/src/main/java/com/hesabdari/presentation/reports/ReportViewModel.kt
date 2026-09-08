/*
================================================
نام فایل:
ReportViewModel.kt

وظیفه:
مدیریت وضعیت گزارش‌های مالی در لایه نمایش.

ارتباط:
Report Screen -> ViewModel -> Financial Report UseCase

نکات توسعه:
گزارش‌های عمومی در Core قرار دارند.
گزارش اختصاصی هر کسب‌وکار باید در Module مربوطه باشد.
================================================
*/

package com.hesabdari.presentation.reports

import androidx.lifecycle.ViewModel

class ReportViewModel : ViewModel() {

    // آماده‌سازی اطلاعات گزارش
    fun initialize() {
        // بارگذاری اولیه گزارش‌ها
    }
}
