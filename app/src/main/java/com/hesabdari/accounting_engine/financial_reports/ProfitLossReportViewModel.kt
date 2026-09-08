package com.hesabdari.accounting_engine.financial_reports

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProfitLossReportViewModel : ViewModel() {

    private val _state = MutableStateFlow(ProfitLossReportState())
    val state: StateFlow<ProfitLossReportState> = _state.asStateFlow()

    fun loadReport(startDate: Long, endDate: Long) {
        _state.value = _state.value.copy(
            isLoading = true,
            startDate = startDate,
            endDate = endDate,
            errorMessage = null
        )
    }

    fun clearError() {
        _state.value = _state.value.copy(errorMessage = null)
    }
}
