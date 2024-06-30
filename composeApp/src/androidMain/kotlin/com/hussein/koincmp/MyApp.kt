package com.hussein.koincmp

import android.app.Application
import di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

/** This should be created in android because Android needs context*/
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApp)
            //androidLogger()
        }
    }

}