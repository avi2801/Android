package com.example.zeeproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        var h = Handler()
        Thread{
//            Thread.sleep(5000)
//            var i = Intent(this,MainActivity::class.java)
//            startActivity(i)
            var counter = 1
            for(i in 1..5)
            {
                h.post{
                   textView1.setText("" + counter)
                }

                Thread.sleep(1000)
                counter++
            }
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)

        }.start()
    }
}