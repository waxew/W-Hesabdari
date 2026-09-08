package com.hesabdari.accounting_engine.presentation

sealed interface AccountingEvent {
    data object Refresh : AccountingEvent
    data class OpenTransaction(val id: String) : AccountingEvent
}
