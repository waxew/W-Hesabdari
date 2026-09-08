/*
================================================
نام فایل:
ThemeResolver.kt

وظیفه:
تبدیل تنظیمات Branding Profile به تنظیمات ظاهری برنامه.

ارتباط:
BrandingConfiguration -> UI Theme

نکات توسعه:
ظاهر برنامه نباید داخل Core قرار گیرد.
================================================
*/
package com.hesabdari.business_profile.runtime

class ThemeResolver {
    fun resolvePrimaryColor(color: String): String {
        return color
    }
}
