package com.hesabdari.accounting_engine.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AccountingViewModel : ViewModel() {

    private val _state = MutableStateFlow(AccountingState())
    val state: StateFlow<AccountingState> = _state

    fun onEvent(event: AccountingEvent) {
        when (event) {
            AccountingEvent.Refresh -> refresh()
            is AccountingEvent.OpenTransaction -> {
                // Transaction navigation will be connected with UI router
            }
        }
    }

    private fun refresh() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)
            _state.value = _state.value.copy(isLoading = false)
        }
    }
}
