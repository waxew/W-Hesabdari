package com.hesabdari.accounting_engine.domain.usecase

import com.hesabdari.accounting_engine.accounting_dashboard.DashboardRepository
import com.hesabdari.accounting_engine.accounting_dashboard.DashboardState

/**
 * Domain use case for loading accounting dashboard financial summary.
 *
 * ViewModels should depend on business operations rather than directly
 * depending on repository implementations.
 */
class GetFinancialDashboardUseCase(
    private val repository: DashboardRepository
) {

    suspend operator fun invoke(): DashboardState {
        return repository.getDashboardSummary()
    }
}
