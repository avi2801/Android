package com.example.zeeproject1


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myButton.setOnClickListener {
//            var myIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9939913288"))
//            startActivity(myIntent)
//            var intent = Intent(this,SecondScreen::class.java)
//            startActivity(intent)
            var myIntent = Intent(this,MyService::class.java)
            startService(myIntent)

        }
        myButton1.setOnClickListener{
            var myIntent = Intent(this,MyService::class.java)
            stopService(myIntent)

        }
    }

}

// calculator
// email
//



