package com.hesabdari.accounting_engine.ledger

/**
 * Maps ledger domain data into presentation state.
 */
object LedgerMapper {

    fun mapToState(
        accountId: String,
        accountName: String,
        openingBalance: Double,
        debitTotal: Double,
        creditTotal: Double
    ): LedgerState {
        return LedgerState(
            isLoading = false,
            accountId = accountId,
            accountName = accountName,
            openingBalance = openingBalance,
            debitTotal = debitTotal,
            creditTotal = creditTotal,
            closingBalance = openingBalance + debitTotal - creditTotal,
            errorMessage = null
        )
    }
}
