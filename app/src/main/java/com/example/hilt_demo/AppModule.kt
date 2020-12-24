package com.example.hilt_demo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import java.util.concurrent.ExecutorService
import java.util.concurrent.LinkedBlockingDeque
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideExecutor(): ExecutorService {
        return ThreadPoolExecutor(
            5, 30,
            1, TimeUnit.MINUTES, LinkedBlockingDeque(10000)
        )
    }
}