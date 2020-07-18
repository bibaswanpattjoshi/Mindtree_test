package com.example.myapplication.network.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bibaswan.techmtest.model.PostInfo
import com.bibaswan.techmtest.repository.RetrofitRepository
import javax.inject.Inject

class RetroViewModel(retrofitRepository: RetrofitRepository): ViewModel() {

    var retrofitRepository:RetrofitRepository = retrofitRepository
    var postInfoLiveData: LiveData<List<PostInfo>> = MutableLiveData()

    init {
        fetchPostInfoFromRepository()
        }

    private fun fetchPostInfoFromRepository(){
        postInfoLiveData =  retrofitRepository.fetchPostInfoList()
    }


}