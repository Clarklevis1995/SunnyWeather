package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

@SuppressLint("StaticFieldLeak")
class SunnyWeatherApplication : Application() {
    companion object{
        lateinit var context : Context
        const val TOKEN = "MKQyWcNyDQmhKVGV"
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}