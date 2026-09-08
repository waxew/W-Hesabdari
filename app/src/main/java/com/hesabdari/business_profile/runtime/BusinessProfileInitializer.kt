package com.hesabdari.business_profile.runtime

/*
================================================
نام فایل:
BusinessProfileInitializer.kt

وظیفه:
راه اندازی Business Profile در شروع اجرای برنامه.

ارتباط:
ProfileLoader
ProfileValidator
ActiveBusinessContext

نکات توسعه:
این فایل نقطه اتصال Startup برنامه با معماری چند کسب و کاری است.
================================================
*/

class BusinessProfileInitializer(
    private val profileLoader: ProfileLoader,
    private val profileValidator: ProfileValidator,
    private val activeContext: ActiveBusinessContext
) {

    fun initialize(profileId: String): Boolean {
        val profile = profileLoader.load(profileId)
            ?: return false

        if (!profileValidator.validate(profile)) {
            return false
        }

        activeContext.setActiveProfile(profile)
        return true
    }
}
