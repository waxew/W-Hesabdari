/*
================================================
نام فایل:
SalesModule.kt

وظیفه:
تعریف ماژول فروش به عنوان یک قابلیت مستقل.

ارتباط:
Business Profile مشخص می‌کند این ماژول فعال باشد یا خیر.

نکات توسعه:
منطق فروش، سفارش و فرآیندها باید در همین Module توسعه پیدا کند و وارد Core نشود.
================================================
*/

package com.hesabdari.modules.sales

import com.hesabdari.modules.core.Module

class SalesModule : Module {
    override val id: String = "sales"
    override val name: String = "فروش"
}
