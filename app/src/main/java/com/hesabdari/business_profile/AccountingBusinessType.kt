/*
================================================
نام فایل:
AccountingBusinessType.kt

وظیفه:
تعریف انواع کسب و کارهایی که می توانند از Core حسابداری استفاده کنند.

ارتباط:
BusinessProfile
BusinessRegistry

نکات توسعه:
این فایل فقط طبقه بندی کسب و کار است.
هیچ منطق اختصاصی کسب و کار نباید در اینجا قرار گیرد.
================================================
*/

package com.hesabdari.business_profile


enum class AccountingBusinessType {
    MOBILE_STORE,
    BOUTIQUE,
    COSMETICS_STORE,
    HOME_APPLIANCE_STORE,
    AUTO_PARTS_STORE,
    JEWELRY_STORE,
    BOOK_STORE,
    GROCERY_STORE,
    PET_STORE,
    OMNICHANNEL_STORE,
    MANUFACTURING,
    SERVICE_COMPANY,
    RESTAURANT,
    DISTRIBUTION
}
