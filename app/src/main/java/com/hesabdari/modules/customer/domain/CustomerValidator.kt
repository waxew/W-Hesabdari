/*
================================================
نام فایل:
CustomerValidator.kt

وظیفه:
اعتبارسنجی اطلاعات عمومی مشتری.

ارتباط:
CustomerUseCase -> CustomerValidator

نکات توسعه:
این فایل فقط قوانین عمومی مشتری را نگهداری می‌کند.
اطلاعات اختصاصی کسب و کار از Business Profile تامین می‌شود.
================================================
*/

package com.hesabdari.modules.customer.domain

class CustomerValidator {

    fun validate(customer: Customer): Boolean {
        return customer.name.isNotBlank()
    }
}
