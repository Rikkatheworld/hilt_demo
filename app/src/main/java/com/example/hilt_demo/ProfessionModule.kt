package com.example.hilt_demo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class ProfessionModule {

    @BindDoctor
    @Binds
    abstract fun bindDoctor(doctor: Doctor): Profession

    @BindProgrammer
    @Binds
    abstract fun bindProgrammer(programmer: Programmer): Profession
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindDoctor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindProgrammer
