/*
نام فایل:
BusinessRegistry.kt

وظیفه:
مرکز دسترسی به Business Profile فعال.

ارتباط:
تمام بخش های برنامه تنظیمات کسب و کار را از این لایه دریافت می کنند.

نکات توسعه:
در آینده امکان بارگذاری Profile از فایل JSON یا سرور اضافه می شود.
*/

package com.hesabdari.business_profile


object BusinessRegistry {

    private var activeProfile: BusinessProfile? = null

    fun register(profile: BusinessProfile) {
        activeProfile = profile
    }

    fun getProfile(): BusinessProfile {
        return requireNotNull(activeProfile) {
            "Business Profile هنوز ثبت نشده است"
        }
    }
}
