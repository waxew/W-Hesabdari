/*
================================================
نام فایل:
CustomerState.kt

وظیفه:
نگهداری وضعیت رابط کاربری ماژول مشتری.

ارتباط:
CustomerViewModel -> CustomerScreen

نکات توسعه:
این فایل فقط وضعیت UI را نگهداری می‌کند.
منطق کسب و کار نباید داخل State قرار گیرد.
================================================
*/

package com.hesabdari.modules.customer.presentation


data class CustomerState(
    val isLoading: Boolean = false,
    val customersCount: Int = 0,
    val errorMessage: String? = null
)
