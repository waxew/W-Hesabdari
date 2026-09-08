/*
================================================
نام فایل:
BusinessType.kt

وظیفه:
تعریف انواع عمومی کسب و کار قابل پشتیبانی.

نکات توسعه:
این فایل فقط نوع کسب و کار را مشخص می کند.
منطق اختصاصی هر کسب و کار نباید در Core قرار گیرد.
================================================
*/

package com.hesabdari.business_profile

enum class BusinessType {
    RETAIL,
    MANUFACTURING,
    SERVICE_COMPANY,
    RESTAURANT,
    DISTRIBUTION
}
