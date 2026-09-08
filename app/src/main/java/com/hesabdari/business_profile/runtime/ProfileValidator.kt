/*
================================================
نام فایل:
ProfileValidator.kt

وظیفه:
اعتبارسنجی Business Profile قبل از فعال شدن برنامه.

ارتباط:
BusinessProfile
BusinessRegistry
Runtime Loader

نکات توسعه:
بررسی های مربوط به کامل بودن تنظیمات Profile در این لایه انجام می شود.
منطق حسابداری نباید وارد این فایل شود.
================================================
*/

package com.hesabdari.business_profile.runtime

import com.hesabdari.business_profile.BusinessProfile

class ProfileValidator {

    fun validate(profile: BusinessProfile): Boolean {
        return profile.businessId.isNotBlank() &&
                profile.softwareName.isNotBlank()
    }
}
