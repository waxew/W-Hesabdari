/*
================================================
نام فایل:
service_company_001.kt

وظیفه:
تعریف Profile حسابداری شرکت خدماتی.

این فایل فقط تنظیمات کسب و کار است.
================================================
*/

package com.hesabdari.business_profile.profiles

import com.hesabdari.business_profile.BusinessProfile
import com.hesabdari.business_profile.AccountingBusinessType

val serviceCompany001 = BusinessProfile(
    softwareName = "Accounting Service Company",
    companyName = "Service Business",
    businessId = "service_company_001",
    logo = null,
    primaryColor = "#7B1FA2",
    businessType = AccountingBusinessType.SERVICE_COMPANY,
    enabledModules = listOf(
        "Customer",
        "Contract",
        "Invoice",
        "Payment"
    ),
    financialConfigurationId = "service_financial_config_001"
)
