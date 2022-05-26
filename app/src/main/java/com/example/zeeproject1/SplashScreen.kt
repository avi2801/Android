package com.example.zeeproject1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        var h = Handler()
        Thread{
//            h.post{
//                var i = Intent(this,MyService::class.java)
//                startService(i)
//
//            }
//            Thread.sleep(10000)
//            h.post{
//                var i = Intent(this,MyService::class.java)
//                stopService(i)
//            }

            var i = Intent(this,MyService::class.java)
            startService(i)

            Thread.sleep(10000)

            stopService(i)

            var i3 = Intent(this,MainActivity::class.java)
            startActivity(i3)

        }.start()



    }
}