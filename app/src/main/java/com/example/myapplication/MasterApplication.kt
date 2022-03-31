package com.example.myapplication

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class MasterApplication: Application() {
    val userId = 1000

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks{
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.d("testt", "onActivityCreated")
            }

            override fun onActivityStarted(activity: Activity) {
                Log.d("testt", "onActivityStarted")
            }

            override fun onActivityResumed(activity: Activity) {
                Log.d("testt", "onActivityResumed")
            }

            override fun onActivityPaused(activity: Activity) {
                Log.d("testt", "onActivityPaused")
            }

            override fun onActivityStopped(activity: Activity) {
                Log.d("testt", "onActivityStopped")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                Log.d("testt", "onActivitySaveInstanceState")
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.d("testt", "onActivityDestroyed")
            }
        })


    }

    fun methodFromApplication() {
        Log.d("testt", "methodFromApplication")
    }

}