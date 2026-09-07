/*
================================================
نام فایل:
mobile_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری موبایل فروشی

این فایل مشخص می کند:
- Module های فعال
- Attribute Schema های فعال
- تنظیمات اختصاصی کسب و کار

این فایل نباید شامل منطق برنامه باشد.
منطق داخل Core و Module مربوطه قرار می گیرد.
================================================
*/

package com.hesabdari.business_profile.profiles


val mobileStore001ProfileId = "mobile_store_001"

val mobileStore001Modules = listOf(
    "Customer",
    "Product",
    "Inventory",
    "Sales",
    "Invoice",
    "Warranty",
    "Repair",
    "IMEI"
)

val mobileStore001Attributes = listOf(
    "Model",
    "Brand",
    "Storage",
    "Color",
    "Serial Number"
)
