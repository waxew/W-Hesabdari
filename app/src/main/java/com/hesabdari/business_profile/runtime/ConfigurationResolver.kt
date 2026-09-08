/*
================================================
نام فایل:
ConfigurationResolver.kt

وظیفه:
حل کردن تنظیمات فعال Business Profile در زمان اجرای برنامه.

ارتباط:
BusinessProfile -> Configuration -> Runtime

نکات توسعه:
این کلاس نباید شامل منطق حسابداری باشد.
فقط وظیفه تبدیل تنظیمات Profile به Context اجرایی را دارد.
================================================
*/
package com.hesabdari.business_profile.runtime

class ConfigurationResolver {
    fun resolve(profileId: String): String {
        return profileId
    }
}
