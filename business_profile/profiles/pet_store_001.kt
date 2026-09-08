/*
================================================
نام فایل:
pet_store_001.kt

وظیفه:
تعریف تنظیمات نسخه حسابداری پت شاپ.

این فایل فقط Profile کسب و کار را نگهداری می‌کند.
منطق Core و Moduleها در این فایل قرار نمی‌گیرد.

Module ها:
Customer
Product
Inventory
Sales

Attribute Schema:
Animal Type
Age
Weight
Food Type
Expiration Date

نکات توسعه:
Profile فقط Configuration است و مستقل از Core باقی می‌ماند.
================================================
*/

package com.hesabdari.business_profile.profiles

object PetStore001 {
    const val ID = "pet_store_001"
    const val TYPE = "PET_STORE"
}
