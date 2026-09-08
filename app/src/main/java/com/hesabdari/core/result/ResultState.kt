/*
================================================
نام فایل:
ResultState.kt

وظیفه:
تعریف وضعیت استاندارد خروجی عملیات در Core.

ارتباط:
Repository -> UseCase -> Presentation

نکات توسعه:
این فایل نباید شامل منطق کسب و کار باشد.
برای تمام Module ها قابل استفاده است.
================================================
*/

package com.hesabdari.core.result

sealed class ResultState<out T> {

    data class Success<T>(
        val data: T
    ) : ResultState<T>()

    data class Error(
        val message: String
    ) : ResultState<Nothing>()

    object Loading : ResultState<Nothing>()
}
