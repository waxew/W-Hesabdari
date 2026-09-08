package com.hesabdari.accounting_engine.ledger

/**
 * Default implementation of LedgerRepository.
 *
 * This layer isolates Ledger UI from Accounting data sources.
 */
class LedgerRepositoryImpl : LedgerRepository {

    override suspend fun getLedger(accountId: String): LedgerState {
        return LedgerState(
            isLoading = false,
            accountId = accountId,
            accountName = "",
            openingBalance = 0.0,
            debitTotal = 0.0,
            creditTotal = 0.0,
            closingBalance = 0.0,
            errorMessage = null
        )
    }
}
