package com.example.daggerpractice.di

import com.example.daggerpractice.MainActivity
import com.example.daggerpractice.di.myActivity.MyViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [MyViewModelModule::class])
    abstract fun contributeMainActivity():MainActivity

}