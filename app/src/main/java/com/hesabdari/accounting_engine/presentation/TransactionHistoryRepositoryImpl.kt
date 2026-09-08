package com.hesabdari.accounting_engine.presentation

/**
 * Implementation layer for transaction history data access.
 *
 * This class keeps Presentation independent from the underlying storage.
 * The final connection to AccountingRepository / Room will be injected here.
 */
class TransactionHistoryRepositoryImpl(
    private val accountingRepository: Any
) : TransactionHistoryRepository {

    override suspend fun getTransactions(): List<TransactionItemState> {
        // Mapping from Accounting data source will be connected here.
        return emptyList()
    }
}
