/*
================================================
نام فایل:
grocery_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری فروشگاه مواد غذایی.

این فایل فقط Profile کسب و کار را مشخص می‌کند.
منطق حسابداری، انبار و فروش در Core و Moduleهای عمومی قرار دارد.

Module ها:
Product
Inventory
Supplier
Sales

Attribute Schema:
Expiration Date
Batch Number
Unit
Weight

نکات توسعه:
هیچ وابستگی اختصاصی کسب و کار نباید وارد Core شود.
================================================
*/

package com.hesabdari.business_profile.profiles

object GroceryStore001 {
    const val ID = "grocery_store_001"
    const val TYPE = "GROCERY_STORE"
}
