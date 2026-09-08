/*
================================================
نام فایل:
book_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری کتاب فروشی.

این فایل فقط Profile کسب و کار است.

ارتباط:
BusinessProfile
ModuleRegistry
AttributeSchemaRegistry
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.model.BusinessProfile
import com.hesabdari.business_profile.module.ModuleType

val BookStore001 = BusinessProfile(
    id = "book_store_001",
    name = "حسابداری کتاب فروشی",
    modules = listOf(
        ModuleType.PRODUCT,
        ModuleType.INVENTORY,
        ModuleType.SUPPLIER,
        ModuleType.SALES
    )
)
