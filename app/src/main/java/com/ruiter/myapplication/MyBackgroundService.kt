package com.ruiter.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyBackgroundService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Thread(
            Runnable {
                while (true) {
                    Log.i("Service", "Service is running...")
                    try {
                        Thread.sleep(2000)
                    } catch (e: InterruptedException){
                        e.printStackTrace()
                    }
                }
            }
        ).start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}