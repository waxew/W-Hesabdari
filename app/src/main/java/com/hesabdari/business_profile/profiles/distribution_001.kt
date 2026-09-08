/*
================================================
نام فایل:
distribution_001.kt

وظیفه:
تعریف Profile حسابداری شرکت پخش.

ارتباط:
- BusinessProfile
- Module Configuration
- Financial Configuration

نکات توسعه:
مدیریت مسیر توزیع و ارسال باید در Module جداگانه باشد.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.BusinessProfile
import com.hesabdari.business_profile.AccountingBusinessType

val distribution001 = BusinessProfile(
    softwareName = "Accounting Distribution",
    companyName = "Distribution Business",
    businessId = "distribution_001",
    logo = null,
    primaryColor = "#2E7D32",
    businessType = AccountingBusinessType.DISTRIBUTION,
    enabledModules = listOf(
        "Customer",
        "Supplier",
        "Sales",
        "Purchase",
        "Inventory",
        "Delivery",
        "Invoice"
    ),
    financialConfigurationId = "distribution_financial_config_001"
)
