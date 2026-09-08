package com.hesabdari.accounting_engine.domain.usecase

import com.hesabdari.accounting_engine.accounting_dashboard.DashboardRepository
import com.hesabdari.accounting_engine.accounting_dashboard.DashboardState

class GetFinancialDashboardUseCase(
    private val repository: DashboardRepository
) {
    suspend operator fun invoke(): DashboardState = repository.loadDashboard()
}
