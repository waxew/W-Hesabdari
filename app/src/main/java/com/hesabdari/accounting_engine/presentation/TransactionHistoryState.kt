package com.hesabdari.accounting_engine.presentation

/**
 * UI state holder for transaction history screen.
 */
data class TransactionHistoryState(
    val isLoading: Boolean = false,
    val transactions: List<TransactionItemState> = emptyList(),
    val selectedFilter: TransactionFilter = TransactionFilter.ALL,
    val errorMessage: String? = null
)


data class TransactionItemState(
    val id: String,
    val title: String,
    val amount: Double,
    val type: String,
    val date: String
)


enum class TransactionFilter {
    ALL,
    INCOME,
    EXPENSE
}
