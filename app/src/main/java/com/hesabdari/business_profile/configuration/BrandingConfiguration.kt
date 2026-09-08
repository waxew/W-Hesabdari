/*
================================================
نام فایل:
BrandingConfiguration.kt

وظیفه:
نگهداری تنظیمات ظاهری و برند نسخه های مختلف نرم افزار.

ارتباط:
BusinessProfile -> BrandingConfiguration -> UI Theme

نکات توسعه:
تغییر برند نباید باعث تغییر Core شود.
================================================
*/

package com.hesabdari.business_profile.configuration


data class BrandingConfiguration(
    val applicationName: String,
    val logoPath: String?,
    val primaryColor: String
)
