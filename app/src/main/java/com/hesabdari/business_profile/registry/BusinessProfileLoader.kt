/*
================================================
نام فایل:
BusinessProfileLoader.kt

وظیفه:
بارگذاری و مدیریت Profile فعال کسب و کار.

ارتباط:
- BusinessRegistry
- BusinessProfile

نکات توسعه:
این فایل فقط وظیفه انتخاب و بارگذاری تنظیمات را دارد.
هیچ منطق اختصاصی کسب و کار نباید در این بخش قرار گیرد.
================================================
*/

package com.hesabdari.business_profile.registry

import com.hesabdari.business_profile.model.BusinessProfile

/**
 * مسئول آماده سازی Profile فعال برنامه.
 */
class BusinessProfileLoader {

    private var activeProfile: BusinessProfile? = null

    fun load(profile: BusinessProfile) {
        activeProfile = profile
    }

    fun getActiveProfile(): BusinessProfile? {
        return activeProfile
    }
}
