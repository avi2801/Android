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
            var un = editTextEmailAddress2.text.toString()
            Toast.makeText(this, "UserName is $un", Toast.LENGTH_LONG).show()
            editTextEmailAddress2.setText(un)

            var myIntent = Intent(this, SecondScreen::class.java)
            myIntent.putExtra("username", un)
            startActivity(myIntent)


        }

        editTextEmailAddress2.addTextChangedListener((object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(editTextEmailAddress2.text.toString())
                        .matches()
                )
                    myButton.isEnabled = true
                else {
                    myButton.isEnabled = false
                    editTextEmailAddress2.setError("invalid email")
                }

            }

        }))


    }
}



