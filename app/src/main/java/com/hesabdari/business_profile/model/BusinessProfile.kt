/*
================================================
نام فایل:
BusinessProfile.kt

وظیفه:
مدل اصلی تعریف یک نسخه کسب و کار.

ارتباط:
Profile فقط مشخص می‌کند چه تنظیمات، Module ها و Schema هایی فعال باشند.
هیچ منطق حسابداری نباید داخل این فایل قرار گیرد.

نکات توسعه:
Core Accounting مستقل از این Profile باقی می‌ماند.
================================================
*/

package com.hesabdari.business_profile.model

import com.hesabdari.core.configuration.FinancialConfiguration


data class BusinessProfile(
    val id: String,
    val name: String,
    val type: String,
    val financialConfiguration: FinancialConfiguration,
    val enabledModules: List<String>,
    val attributeSchemas: List<String>
)
