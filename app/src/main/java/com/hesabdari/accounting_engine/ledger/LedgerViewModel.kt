package com.hesabdari.accounting_engine.ledger

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LedgerViewModel : ViewModel() {

    private val _state = MutableStateFlow(LedgerState())
    val state: StateFlow<LedgerState> = _state

    fun loadLedger(accountId: String) {
        _state.value = _state.value.copy(
            accountId = accountId,
            isLoading = false
        )
    }

    fun clearError() {
        _state.value = _state.value.copy(errorMessage = null)
    }
}
