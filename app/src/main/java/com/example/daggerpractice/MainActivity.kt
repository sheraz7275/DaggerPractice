package com.example.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.daggerpractice.di.DaggerViewModelFactory
import com.example.daggerpractice.di.ViewModelFactoryModule
import com.example.daggerpractice.viewModel.MyViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {


    @Inject
    lateinit var viewModeFactory: DaggerViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel=ViewModelProvider(this, viewModeFactory).get(MyViewModel::class.java)


    }
}