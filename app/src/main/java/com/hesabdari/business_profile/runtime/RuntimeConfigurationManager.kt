package com.hesabdari.business_profile.runtime

/*
================================================
نام فایل:
RuntimeConfigurationManager.kt

وظیفه:
مدیریت تنظیمات نهایی Runtime بر اساس Business Profile فعال.

ارتباط:
BusinessProfile
ConfigurationResolver
ModuleActivationResolver
ThemeResolver

نکات توسعه:
این کلاس نباید شامل منطق حسابداری باشد.
فقط هماهنگ کننده بارگذاری تنظیمات Runtime است.
================================================
*/

class RuntimeConfigurationManager(
    private val configurationResolver: ConfigurationResolver,
    private val moduleActivationResolver: ModuleActivationResolver,
    private val themeResolver: ThemeResolver
) {

    fun initialize(profile: Any): RuntimeConfiguration {
        return RuntimeConfiguration(
            configurationResolver.resolve(profile),
            moduleActivationResolver.resolve(profile),
            themeResolver.resolve(profile)
        )
    }
}

class RuntimeConfiguration(
    val financialConfiguration: Any?,
    val activeModules: List<String>,
    val themeConfiguration: Any?
)
