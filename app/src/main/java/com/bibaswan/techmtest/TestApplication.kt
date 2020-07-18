package com.bibaswan.techmtest

import android.app.Application
import android.content.Context
import com.bibaswan.techmtest.dependency.APIComponent
import com.bibaswan.techmtest.dependency.APIModule
import com.bibaswan.techmtest.dependency.DaggerAPIComponent
import com.bibaswan.techmtest.repository.APIURL

class TestApplication : Application() {

    companion object {
        var ctx: Context? = null
        lateinit var apiComponent: APIComponent
    }
    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
        apiComponent = initDaggerComponent()

    }

    fun initDaggerComponent():APIComponent{
        apiComponent =   DaggerAPIComponent
            .builder()
            .aPIModule(APIModule(APIURL.BASE_URL))
            .build()
        return  apiComponent

    }

}