/*
================================================
نام فایل:
PurchaseModule.kt

وظیفه:
تعریف ماژول خرید در معماری ماژولار حسابداری.

ارتباط:
این ماژول توسط Business Profile فعال یا غیرفعال می‌شود.

نکات توسعه:
منطق خرید، تامین‌کننده و گردش خرید باید در این Module توسعه یابد.
این فایل نباید شامل منطق Core Accounting باشد.
================================================
*/

package com.hesabdari.modules.purchase

import com.hesabdari.modules.core.Module

class PurchaseModule : Module {
    override val id: String = "purchase"
    override val name: String = "Purchase"
}
