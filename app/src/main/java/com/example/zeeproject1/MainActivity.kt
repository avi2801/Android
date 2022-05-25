package com.example.zeeproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton.setOnClickListener {
            var un = editTextTextEmailAddress2.text.toString();
            Toast.makeText(this,"UserName is $un",Toast.LENGTH_LONG).show()
            editTextTextEmailAddress2.setText(un)


            var myIntent = Intent(this, SecondScreen::class.java)
            myIntent.putExtra("username", un)
            startActivity(myIntent)

        }


        editTextTextEmailAddress2.addTextChangedListener((object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(editTextTextEmailAddress2.text.toString()).matches())
                    myButton.isEnabled = true
                else
                {
                    myButton.isEnabled = false
                    editTextTextEmailAddress2.setError("invalid email")
                }

            }

        }))

    }

}


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        buttonSubmit.setOnClickListener {
//            var un =  editTextUsername.text.toString()
//            Toast.makeText(this,"username is $un", Toast.LENGTH_LONG).show()
//            textViewUsername.setText(un)
//
//            var myIntent = Intent(this, SecondActivty::class.java)
//            myIntent.putExtra("username", un)
//            startActivity(myIntent)
//        }
//    }
//}
//
//-----------------------------------
//class SecondActivty : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_second)
//
//        var user = intent.extras?.getString("username")
//        textViewResult.setText(user)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.mymenu,menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
//        var id = item.itemId
//
//        if(id == R.id.mytoast){
//
//            Log.i("mytag","id is $id")
//            Toast.makeText(this, "TOAST SELECTED",Toast.LENGTH_LONG).show()
//        }
//
//        if(id==R.id.myscond){
//            var i = Intent(this,MainActivity::class.java)
//            startActivity(i)
//        }
//
//        return super.onOptionsItemSelected(item)
//    }
//}
//-----------------------------------
//MENU
//
//<?xml version="1.0" encoding="utf-8"?>
//<menu xmlns:android="http://schemas.android.com/apk/res/android">
//
//<item android:title="TOAST" android:id="@+id/mytoast"></item>
//<item android:title="Main" android:id="@+id/myscond"></item>
//
//</menu>