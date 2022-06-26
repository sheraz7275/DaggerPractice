package com.example.daggerpractice.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MyViewModel @Inject constructor():ViewModel() {

    init {
        Log.d("##","Triggered")
    }

}