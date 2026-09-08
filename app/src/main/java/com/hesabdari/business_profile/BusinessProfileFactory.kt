/*
================================================
نام فایل:
BusinessProfileFactory.kt

وظیفه:
ساخت نمونه Business Profile.

این Factory کمک می کند نسخه های مختلف
حسابداری از یک Core ساخته شوند.

منطق کسب و کار نباید در اینجا قرار گیرد.
================================================
*/

package com.hesabdari.business_profile

object BusinessProfileFactory {

    fun create(
        profileId: String,
        name: String,
        type: AccountingBusinessType
    ): BusinessProfile {
        return BusinessProfile(
            softwareName = name,
            companyName = "",
            businessId = profileId,
            logo = null,
            primaryColor = "",
            businessType = type,
            enabledModules = emptyList(),
            financialConfigurationId = "default"
        )
    }
}
