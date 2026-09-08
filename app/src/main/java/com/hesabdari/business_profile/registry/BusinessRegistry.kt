/*
================================================
نام فایل:
BusinessRegistry.kt

وظیفه:
مدیریت Profile فعال سیستم.

ارتباط:
Application از این Registry برای دریافت تنظیمات نسخه فعال استفاده می‌کند.

نکات توسعه:
تغییر کسب و کار فقط باید از طریق Profile انجام شود، نه تغییر Core.
================================================
*/

package com.hesabdari.business_profile.registry

import com.hesabdari.business_profile.model.BusinessProfile

class BusinessRegistry {

    private var activeProfile: BusinessProfile? = null

    fun register(profile: BusinessProfile) {
        activeProfile = profile
    }

    fun getActiveProfile(): BusinessProfile? {
        return activeProfile
    }
}
