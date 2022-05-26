package com.example.zeeproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    var countries = arrayOf("India","China","USA","UK","France","Paris","Pakistan","Thailand");
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        //var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)

        var arrayAdapter = ArrayAdapter(this,R.layout.mylayout,R.id.textView,countries)
        mylistView.adapter = arrayAdapter




    }
}