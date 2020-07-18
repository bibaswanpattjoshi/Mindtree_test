package com.bibaswan.techmtest.dependency

import com.bibaswan.techmtest.AppModule
import com.bibaswan.techmtest.repository.RetrofitRepository
import com.bibaswan.techmtest.view.EntryFragment
import com.example.myapplication.network.viewmodel.RetroViewModel
import com.example.myapplication.network.viewmodel.RetroViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, APIModule::class])
interface APIComponent {
    fun inject(retrofitRepository: RetrofitRepository)
    fun inject(retroViewModel: RetroViewModel)
    fun inject(retroFragment: EntryFragment)
    fun inject(retroViewModelFactory: RetroViewModelFactory)
}