package com.hesabdari.accounting_engine.accounting_dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hesabdari.accounting_engine.domain.usecase.GetFinancialDashboardUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * ویومدل داشبورد حسابداری.
 * منطق دریافت خلاصه مالی از طریق UseCase انجام می‌شود تا UI به Repository وابستگی مستقیم نداشته باشد.
 */
class DashboardViewModel(
    private val getFinancialDashboardUseCase: GetFinancialDashboardUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(DashboardState())
    val state: StateFlow<DashboardState> = _state

    fun loadDashboard() {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true,
                errorMessage = null
            )

            try {
                val result = getFinancialDashboardUseCase()
                _state.value = result.copy(
                    isLoading = false,
                    errorMessage = null
                )
            } catch (exception: Exception) {
                _state.value = _state.value.copy(
                    isLoading = false,
                    errorMessage = exception.message ?: "خطای ناشناخته در دریافت اطلاعات داشبورد"
                )
            }
        }
    }

    fun clearError() {
        _state.value = _state.value.copy(errorMessage = null)
    }
}
