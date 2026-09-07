/*
================================================
نام فایل:
ModuleType.kt

وظیفه:
تعریف قابلیت هایی که دارای منطق، فرآیند و Workflow هستند.

ارتباط:
Business Profile مشخص می کند کدام Module فعال باشد.

نکات توسعه:
اطلاعات توصیفی باید Attribute Schema باشند و نباید Module شوند.
================================================
*/

package com.hesabdari.business_profile


enum class ModuleType {
    ACCOUNTING,
    INVOICE,
    PAYMENT,
    INVENTORY,
    CUSTOMER,
    SUPPLIER,
    PRODUCT,
    SALES,
    PURCHASE,
    PRODUCTION,
    COST_CALCULATION,
    RESERVATION,
    DELIVERY,
    REPAIR,
    WARRANTY,
    IMEI,
    ONLINE_ORDER,
    CRM
}
