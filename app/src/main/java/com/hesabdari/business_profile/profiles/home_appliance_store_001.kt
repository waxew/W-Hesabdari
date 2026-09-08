/*
================================================
نام فایل:
home_appliance_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری لوازم خانگی.

این فایل فقط Profile کسب و کار است.
هیچ منطق حسابداری یا عملیات تجاری داخل آن قرار نمی گیرد.

ارتباط:
BusinessProfile
ModuleRegistry
AttributeSchemaRegistry

نکات توسعه:
تمام منطق باید در Core یا Module مربوطه باشد.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.model.BusinessProfile
import com.hesabdari.business_profile.module.ModuleType

val HomeApplianceStore001 = BusinessProfile(
    id = "home_appliance_store_001",
    name = "حسابداری لوازم خانگی",
    modules = listOf(
        ModuleType.CUSTOMER,
        ModuleType.PRODUCT,
        ModuleType.INVENTORY,
        ModuleType.SALES,
        ModuleType.WARRANTY,
        ModuleType.DELIVERY
    )
)
