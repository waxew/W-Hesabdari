package com.hesabdari.accounting_engine.accounting_dashboard

/** پیاده‌سازی اولیه منبع داده داشبورد مالی. */
class DashboardRepositoryImpl : DashboardRepository {
    override suspend fun loadDashboard(): DashboardState = DashboardState()
}
