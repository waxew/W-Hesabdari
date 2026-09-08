package com.hesabdari.accounting_engine.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AccountingDashboardViewModel(
    private val dashboardUseCase: AccountingDashboardUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(AccountingState())
    val state: StateFlow<AccountingState> = _state.asStateFlow()

    init {
        loadDashboard()
    }

    fun onEvent(event: AccountingEvent) {
        when (event) {
            AccountingEvent.Refresh -> loadDashboard()
            is AccountingEvent.OpenTransaction -> {
                // Navigation will be handled by the UI layer
            }
        }
    }

    private fun loadDashboard() {
        viewModelScope.launch {
            try {
                _state.value = _state.value.copy(isLoading = true, errorMessage = null)
                val dashboard = dashboardUseCase.getDashboard()
                _state.value = dashboard
            } catch (exception: Exception) {
                _state.value = _state.value.copy(
                    isLoading = false,
                    errorMessage = exception.message
                )
            }
        }
    }
}
