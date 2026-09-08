/*
================================================
نام فایل:
CustomerUseCaseResult.kt

وظیفه:
تعریف نتیجه استاندارد عملیات Customer UseCase.

ارتباط:
CustomerUseCase -> ViewModel -> UI

نکات توسعه:
این فایل فقط برای خروجی عملیات مشتری است و نباید شامل منطق کسب و کار باشد.
================================================
*/

package com.hesabdari.modules.customer.domain

import com.hesabdari.core.result.ResultState

sealed class CustomerUseCaseResult {
    data class Success(val customers: List<Customer>) : CustomerUseCaseResult()
    data class Failure(val message: String) : CustomerUseCaseResult()
}
