/*
================================================
File: BusinessConfig.kt

وظیفه:
نمونه تنظیمات نسخه اول نرم افزار.

در آینده برای هر کسب و کار یک نسخه جدا از این فایل ساخته می شود.
هسته حسابداری هیچ وابستگی به این اطلاعات ندارد.
================================================
*/

package com.hesabdari.core.config


object BusinessConfig {

    val currentBusiness = BusinessProfile(

        businessId = "store_001",

        businessName = "فروشگاه ۱",

        packageName = "com.store001.accounting",

        logo = "store_logo.png",

        primaryColor = "#1565C0",

        enabledModules = listOf(
            "accounting",
            "invoice",
            "customer",
            "inventory"
        )
    )
}
