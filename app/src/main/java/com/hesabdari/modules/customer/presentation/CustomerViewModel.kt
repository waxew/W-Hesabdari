/*
================================================
نام فایل:
CustomerViewModel.kt

وظیفه:
مدیریت وضعیت و تعاملات UI ماژول مشتری.

ارتباط:
UI -> ViewModel -> UseCase -> Repository

نکات توسعه:
این لایه نباید شامل منطق حسابداری یا منطق اختصاصی کسب و کار باشد.
================================================
*/

package com.hesabdari.modules.customer.presentation


class CustomerViewModel {

    private var state = CustomerState()

    fun getState(): CustomerState {
        return state
    }

    fun onEvent(event: CustomerEvent) {
        when (event) {
            CustomerEvent.LoadCustomers -> {
                state = state.copy(isLoading = true)
            }
        }
    }
}
