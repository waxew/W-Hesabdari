package com.hesabdari.di

import com.hesabdari.accounting_engine.service.LedgerUpdateService
import com.hesabdari.accounting_engine.service.PostingService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    @Singleton
    fun providePostingService(): PostingService {
        return PostingService()
    }

    @Provides
    @Singleton
    fun provideLedgerUpdateService(): LedgerUpdateService {
        return LedgerUpdateService()
    }
}
