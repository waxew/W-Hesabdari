package com.hesabdari.accounting_engine.financial_reports.cash_flow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CashFlowViewModel : ViewModel() {

    private val _state = MutableStateFlow(CashFlowState())
    val state: StateFlow<CashFlowState> = _state.asStateFlow()

    fun loadReport() {
        _state.value = _state.value.copy(
            isLoading = true,
            errorMessage = null
        )

        // Repository connection will be added in the next layer.
    }

    fun clearError() {
        _state.value = _state.value.copy(errorMessage = null)
    }
}
