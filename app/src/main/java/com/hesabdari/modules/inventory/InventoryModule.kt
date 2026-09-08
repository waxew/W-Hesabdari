/*
================================================
نام فایل:
InventoryModule.kt

وظیفه:
تعریف ماژول انبار به عنوان قابلیت مستقل.

ارتباط:
Profile تعیین می‌کند این قابلیت برای کسب‌وکار فعال شود.

نکات توسعه:
موجودی، گردش کالا و عملیات انبار داخل این Module قرار می‌گیرد.
Core Accounting فقط تراکنش مالی را دریافت می‌کند.
================================================
*/

package com.hesabdari.modules.inventory

import com.hesabdari.modules.core.Module

class InventoryModule : Module {
    override val id: String = "inventory"
    override val name: String = "انبار"
}
