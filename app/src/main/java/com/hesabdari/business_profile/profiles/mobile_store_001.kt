/*
================================================
نام فایل:
mobile_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری موبایل فروشی.

این فایل مشخص می کند:
- چه Module هایی فعال هستند.
- چه Attribute Schema هایی استفاده شوند.

نکات توسعه:
این فایل فقط Configuration است.
هیچ منطق حسابداری یا منطق کسب و کار نباید اینجا قرار گیرد.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.model.BusinessProfile
import com.hesabdari.business_profile.module.ModuleDefinition
import com.hesabdari.business_profile.schema.AttributeDefinition

val MobileStore001Profile = BusinessProfile(
    id = "mobile_store_001",
    name = "Mobile Store Accounting Profile",
    modules = listOf(
        ModuleDefinition("PRODUCT"),
        ModuleDefinition("INVENTORY"),
        ModuleDefinition("SALES"),
        ModuleDefinition("INVOICE"),
        ModuleDefinition("WARRANTY"),
        ModuleDefinition("REPAIR")
    ),
    attributes = listOf(
        AttributeDefinition("Model"),
        AttributeDefinition("Brand"),
        AttributeDefinition("Storage"),
        AttributeDefinition("Serial Number")
    )
)
