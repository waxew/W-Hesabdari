/*
================================================
نام فایل:
AccountTree.kt

وظیفه:
مدیریت ساختار درخت حساب‌ها.

ارتباط:
Chart Of Accounts Engine

نکات توسعه:
ساختار حساب‌ها باید قابل تغییر باشد.
نباید برای هر کسب‌وکار Core جدید ساخته شود.
================================================
*/

package com.hesabdari.financial_configuration

data class AccountTree(
    val accounts: List<AccountTemplate>
)
