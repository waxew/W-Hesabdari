/*
================================================
نام فایل:
ProfileLoader.kt

وظیفه:
بارگذاری Business Profile برای اجرای برنامه.

ارتباط:
BusinessRegistry
ActiveBusinessContext

نکات توسعه:
در آینده این بخش می تواند Profile را از فایل تنظیمات، دیتابیس یا سرور دریافت کند.
================================================
*/

package com.hesabdari.business_profile.runtime

import com.hesabdari.business_profile.BusinessProfile

class ProfileLoader {

    fun load(profile: BusinessProfile): ActiveBusinessContext {
        return ActiveBusinessContext(profile)
    }
}
