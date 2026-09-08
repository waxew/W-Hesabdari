package com.hesabdari.accounting_engine.accounting_dashboard

/**
 * Dashboard data implementation layer.
 *
 * This class is responsible for preparing aggregated
 * financial information from accounting modules.
 */
class DashboardRepositoryImpl : DashboardRepository {

    override suspend fun getDashboardSummary(): DashboardState {
        return DashboardState()
    }
}
