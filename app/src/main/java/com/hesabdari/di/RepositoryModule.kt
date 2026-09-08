package com.hesabdari.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Repository dependency bindings.
 *
 * Repository implementations will be added here when data layer contracts
 * are finalized. The project keeps all repositories inside this repository.
 */
@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule
