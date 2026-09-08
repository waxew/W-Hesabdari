/*
================================================
نام فایل:
ActiveBusinessContext.kt

وظیفه:
نگهداری Profile فعال برنامه در زمان اجرای نرم افزار.

ارتباط:
BusinessProfile
BusinessRegistry
ConfigurationResolver

نکات توسعه:
این فایل منطق کسب و کار ندارد.
فقط وضعیت فعال برنامه را نگهداری می کند.
================================================
*/

package com.hesabdari.business_profile.runtime

import com.hesabdari.business_profile.BusinessProfile

/**
 * Context مربوط به کسب و کار فعال در اجرای برنامه
 */
data class ActiveBusinessContext(
    val profile: BusinessProfile
)
