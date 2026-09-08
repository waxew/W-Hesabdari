package com.hesabdari.accounting_engine.accounting_dashboard

interface DashboardRepository {
    suspend fun loadDashboard(): DashboardState
}
