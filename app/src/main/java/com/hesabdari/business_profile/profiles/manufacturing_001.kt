/*
================================================
نام فایل:
manufacturing_001.kt

وظیفه:
تعریف Profile حسابداری شرکت تولیدی.

ارتباط:
- BusinessProfile
- Module Configuration
- Financial Configuration

نکات توسعه:
این فایل فقط تنظیمات کسب و کار است.
منطق تولید و محاسبه هزینه باید داخل Module مربوطه باشد.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.BusinessProfile
import com.hesabdari.business_profile.AccountingBusinessType

val manufacturing001 = BusinessProfile(
    softwareName = "Accounting Manufacturing",
    companyName = "Manufacturing Business",
    businessId = "manufacturing_001",
    logo = null,
    primaryColor = "#1565C0",
    businessType = AccountingBusinessType.MANUFACTURING,
    enabledModules = listOf(
        "Customer",
        "Supplier",
        "Production",
        "Material",
        "Inventory",
        "CostCalculation",
        "Invoice"
    ),
    financialConfigurationId = "manufacturing_financial_config_001"
)
