/*
================================================
نام فایل:
InvoiceModule.kt

وظیفه:
تعریف ماژول فاکتور به عنوان قابلیت عمومی سیستم.

ارتباط:
با Core Accounting برای ثبت عملیات مالی ارتباط دارد.

نکات توسعه:
قالب و ظاهر فاکتور از Business Profile Configuration خوانده می‌شود.
================================================
*/

package com.hesabdari.modules.invoice

import com.hesabdari.modules.core.Module

class InvoiceModule : Module {
    override val id: String = "invoice"
    override val name: String = "فاکتور"
}
