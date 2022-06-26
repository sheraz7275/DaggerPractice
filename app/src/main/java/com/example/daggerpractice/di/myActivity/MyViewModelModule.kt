package com.example.daggerpractice.di.myActivity

import androidx.lifecycle.ViewModel
import com.example.daggerpractice.di.ViewModelKey
import com.example.daggerpractice.viewModel.MyViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MyViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel::class)
    abstract fun bindMyViewModel(myViewModel: MyViewModel): ViewModel
}