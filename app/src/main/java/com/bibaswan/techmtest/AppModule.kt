package com.bibaswan.techmtest

import com.bibaswan.techmtest.TestApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule constructor(testApplication: TestApplication){

    var testApplication:TestApplication = testApplication

    @Provides
    fun provideTestApplication():TestApplication{
        return TestApplication()
    }
}