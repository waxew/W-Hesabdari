/*
================================================
نام فایل:
auto_parts_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری قطعات خودرو.

این فایل فقط Configuration است و منطق برنامه ندارد.

ارتباط:
BusinessProfile
ModuleRegistry
AttributeSchemaRegistry

نکات توسعه:
ویژگی های اختصاصی خودرو باید در Attribute Schema تعریف شوند.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.model.BusinessProfile
import com.hesabdari.business_profile.module.ModuleType

val AutoPartsStore001 = BusinessProfile(
    id = "auto_parts_store_001",
    name = "حسابداری قطعات خودرو",
    modules = listOf(
        ModuleType.CUSTOMER,
        ModuleType.PRODUCT,
        ModuleType.INVENTORY,
        ModuleType.SALES,
        ModuleType.SUPPLIER
    )
)
