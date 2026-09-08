/*
================================================
نام فایل:
restaurant_001.kt

وظیفه:
تعریف Profile حسابداری رستوران.

ارتباط:
- BusinessProfile
- Module Configuration
- Financial Configuration

نکات توسعه:
قابلیت های اختصاصی مانند مدیریت میز و Food Cost
نباید وارد Core Accounting شوند.
آنها Module مستقل هستند.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.BusinessProfile
import com.hesabdari.business_profile.AccountingBusinessType

val restaurant001 = BusinessProfile(
    softwareName = "Accounting Restaurant",
    companyName = "Restaurant Business",
    businessId = "restaurant_001",
    logo = null,
    primaryColor = "#E65100",
    businessType = AccountingBusinessType.RESTAURANT,
    enabledModules = listOf(
        "Customer",
        "Sales",
        "Purchase",
        "Inventory",
        "Invoice",
        "FoodCost",
        "TableManagement"
    ),
    financialConfigurationId = "restaurant_financial_config_001"
)
