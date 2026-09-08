/*
================================================
نام فایل:
CustomerValidationResult.kt

وظیفه:
نتیجه اعتبارسنجی اطلاعات مشتری.

ارتباط:
CustomerValidator -> UseCase

نکات توسعه:
این فایل فقط وضعیت Validation را نگهداری می‌کند.
================================================
*/

package com.hesabdari.modules.customer.domain

sealed class CustomerValidationResult {
    object Valid : CustomerValidationResult()
    data class Invalid(val message: String) : CustomerValidationResult()
}
