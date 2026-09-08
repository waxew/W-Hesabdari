/*
================================================
نام فایل:
jewelry_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری طلا و جواهر.

این فایل فقط مشخصات Profile را نگهداری می کند.

ارتباط:
BusinessProfile
ModuleRegistry
AttributeSchemaRegistry

نکات توسعه:
وزن، عیار و اطلاعات سنگ باید Attribute Schema باشند.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.model.BusinessProfile
import com.hesabdari.business_profile.module.ModuleType

val JewelryStore001 = BusinessProfile(
    id = "jewelry_store_001",
    name = "حسابداری طلا و جواهر",
    modules = listOf(
        ModuleType.CUSTOMER,
        ModuleType.PRODUCT,
        ModuleType.SALES,
        ModuleType.INVOICE,
        ModuleType.REPORTING
    )
)
