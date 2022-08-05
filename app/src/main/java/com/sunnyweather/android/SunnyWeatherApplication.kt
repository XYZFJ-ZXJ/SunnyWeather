package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

//615
class SunnyWeatherApplication : Application() {

    companion object {
        //616
        const val TOKEN = "LX8ZlX0b1WPRdfB6" // 填入你申请到的令牌值
        //615
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}