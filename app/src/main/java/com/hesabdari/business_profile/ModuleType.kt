/*
نام فایل:
ModuleType.kt

وظیفه:
تعریف قابلیت های دارای منطق و Workflow در سیستم.

ارتباط:
Business Profile مشخص می کند کدام Module فعال باشد.

نکات توسعه:
هر قابلیت جدید با منطق مستقل باید Module باشد، نه Attribute.
*/

package com.hesabdari.business_profile


enum class ModuleType {
    ACCOUNTING,
    INVOICE,
    PAYMENT,
    INVENTORY,
    CUSTOMER,
    SUPPLIER,
    PRODUCTION,
    RESERVATION,
    DELIVERY,
    REPAIR,
    WARRANTY
}
