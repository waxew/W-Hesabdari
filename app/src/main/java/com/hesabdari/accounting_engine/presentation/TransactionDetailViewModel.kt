package com.hesabdari.accounting_engine.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TransactionDetailViewModel : ViewModel() {

    private val _state = MutableStateFlow(TransactionDetailState())
    val state: StateFlow<TransactionDetailState> = _state.asStateFlow()

    fun loadTransaction(transactionId: String) {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true,
                transactionId = transactionId
            )

            // Repository integration will populate real transaction data.
            _state.value = _state.value.copy(
                isLoading = false
            )
        }
    }

    fun clearError() {
        _state.value = _state.value.copy(errorMessage = null)
    }
}
