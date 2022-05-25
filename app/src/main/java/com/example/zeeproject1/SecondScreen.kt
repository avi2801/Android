package com.example.zeeproject1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second_screen.*

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        var user = intent.extras?.getString("username")
        textView1.setText(user)
        myButton2.setOnClickListener {
            var myIntent1 = Intent(this,ThirdScreen::class.java)
            startActivity(myIntent1)
        }


        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu,menu)
       return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var id = item.itemId

        if(id == R.id.mytoast){

            Log.i("mytag","id is $id")
            Toast.makeText(this, "TOAST SELECTED",Toast.LENGTH_LONG).show()
        }

        if(id==R.id.myscond){
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        if(id == android.R.id.home)
        {
           var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }


        return super.onOptionsItemSelected(item)
    }
}
