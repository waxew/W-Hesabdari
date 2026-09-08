/*
================================================
نام فایل:
retail_accounting_001.kt

وظیفه:
تعریف Profile حسابداری فروشگاهی.

این فایل فقط تنظیمات کسب و کار را مشخص می کند.
هیچ منطق حسابداری نباید داخل Profile قرار گیرد.

منطق در Core و Module ها نگهداری می شود.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.BusinessProfile
import com.hesabdari.business_profile.AccountingBusinessType

val retailAccounting001 = BusinessProfile(
    softwareName = "Accounting Retail",
    companyName = "Retail Business",
    businessId = "retail_accounting_001",
    logo = null,
    primaryColor = "#1976D2",
    businessType = AccountingBusinessType.RETAIL,
    enabledModules = listOf(
        "Customer",
        "Supplier",
        "Sales",
        "Purchase",
        "Inventory",
        "Invoice"
    ),
    financialConfigurationId = "retail_financial_config_001"
)
