/*
================================================
نام فایل:
omnichannel_store_001.kt

وظیفه:
تعریف تنظیمات نسخه فروشگاه آنلاین و حضوری.

این فایل فقط Profile کسب و کار را نگهداری می‌کند.
منطق فروش، پرداخت و ارسال در Moduleهای مستقل قرار می‌گیرد.

Module ها:
Online Order
Delivery
Inventory Sync
Customer CRM
Payment

Attribute Schema:
Order Channel
Delivery Method
Customer Segment

نکات توسعه:
Business Profile نباید وابستگی به Core ایجاد کند.
================================================
*/

package com.hesabdari.business_profile.profiles

object OmnichannelStore001 {
    const val ID = "omnichannel_store_001"
    const val TYPE = "OMNICHANNEL_STORE"
}
