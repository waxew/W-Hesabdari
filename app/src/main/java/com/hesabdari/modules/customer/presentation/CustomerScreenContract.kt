/*
================================================
نام فایل:
CustomerScreenContract.kt

وظیفه:
تعریف قرارداد ارتباط UI مشتری با ViewModel.

ارتباط:
Customer Screen -> ViewModel -> UseCase

نکات توسعه:
این فایل فقط قرارداد UI است و نباید وابسته به نوع کسب‌وکار باشد.
================================================
*/

package com.hesabdari.modules.customer.presentation

sealed interface CustomerScreenAction {
    data object Load : CustomerScreenAction
}
