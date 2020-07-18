package com.example.myapplication.network.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bibaswan.techmtest.TestApplication
import com.bibaswan.techmtest.dependency.APIComponent
import com.bibaswan.techmtest.dependency.APIModule
import com.bibaswan.techmtest.dependency.DaggerAPIComponent
import com.bibaswan.techmtest.repository.APIURL
import com.bibaswan.techmtest.repository.RetrofitRepository
import javax.inject.Inject


class RetroViewModelFactory : ViewModelProvider.Factory {
    lateinit var apiComponent: APIComponent
    @Inject
    lateinit var retrofitRepository: RetrofitRepository

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       var apiComponent :APIComponent =  TestApplication.apiComponent
        apiComponent.inject(this)
        if (modelClass.isAssignableFrom(RetroViewModel::class.java)) {
            return RetroViewModel(retrofitRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}