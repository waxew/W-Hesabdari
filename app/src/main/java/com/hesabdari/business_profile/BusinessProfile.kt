/*
نام فایل:
BusinessProfile.kt

وظیفه:
مدل اصلی تعریف یک نسخه کسب و کار.

ارتباط:
- BusinessRegistry
- Configuration Engine
- Application Layer

نکات توسعه:
اطلاعات اختصاصی کسب و کار نباید وارد Core Accounting شود.
*/

package com.hesabdari.business_profile


data class BusinessProfile(
    val softwareName: String,
    val companyName: String,
    val businessId: String,
    val logo: String?,
    val primaryColor: String,
    val businessType: AccountingBusinessType,
    val enabledModules: List<String>,
    val financialConfigurationId: String
)
