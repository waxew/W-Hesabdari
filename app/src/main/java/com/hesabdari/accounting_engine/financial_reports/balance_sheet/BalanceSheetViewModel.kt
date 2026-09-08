package com.hesabdari.accounting_engine.financial_reports.balance_sheet

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class BalanceSheetViewModel : ViewModel() {

    private val _state = MutableStateFlow(BalanceSheetState())
    val state: StateFlow<BalanceSheetState> = _state.asStateFlow()

    fun loadReport() {
        _state.value = _state.value.copy(
            isLoading = true,
            errorMessage = null
        )
    }

    fun clearError() {
        _state.value = _state.value.copy(errorMessage = null)
    }
}
