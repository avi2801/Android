package com.example.zeeproject1

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    lateinit var mp : MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate()
    {
        super.onCreate()
        Log.i("myTag","Service Created")
        mp = MediaPlayer.create(this,R.raw.blindinglite)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("myTag","Service Started")
        mp.start()
        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()
        mp.stop()
        Log.i("myTag","Service Finished")
    }

}