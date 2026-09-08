/*
================================================
نام فایل:
ReportsModule.kt

وظیفه:
تعریف ماژول گزارشات مالی و مدیریتی.

ارتباط:
دریافت اطلاعات از Ledger و Accounting Core.

نکات توسعه:
گزارش‌ها باید از Core داده دریافت کنند و منطق ثبت مالی نداشته باشند.
================================================
*/

package com.hesabdari.modules.reports

import com.hesabdari.modules.core.Module

class ReportsModule : Module {
    override val id: String = "reports"
    override val name: String = "Reports"
}
