/*
================================================
نام فایل:
CustomerEvent.kt

وظیفه:
تعریف رویدادهای قابل ارسال از UI مشتری.

ارتباط:
CustomerScreen -> CustomerViewModel

نکات توسعه:
رویدادها مستقل از نوع کسب و کار هستند.
تنظیمات اختصاصی از Business Profile تامین می‌شود.
================================================
*/

package com.hesabdari.modules.customer.presentation


sealed class CustomerEvent {
    data object LoadCustomers : CustomerEvent()
}
