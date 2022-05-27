package com.example.zeeproject1

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_list.*
import java.nio.file.attribute.AclEntry

class ListActivity : AppCompatActivity() {
    var countries = arrayOf("India","China","USA","UK","France","Paris","Pakistan","Thailand");
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        var builder = AlertDialog.Builder(this)
        builder.setTitle("My Alert ! ! !")
        builder.setIcon(R.drawable.image1)
        builder.setMessage("Do you want to continue?")
        builder.setCancelable(false)
        builder.setPositiveButton("yes",DialogInterface.OnClickListener {
                dialogInterface, i->
            Toast.makeText(this,"Yes Button Clicked",Toast.LENGTH_SHORT).show()
        })


        builder.setNegativeButton("no",DialogInterface.OnClickListener {
                dialogInterface, i->
            finish()
        })

        var alertDialog = builder.create()
        alertDialog.show()

//        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)

        var arrayAdapter = ArrayAdapter(this,R.layout.mylayout,R.id.textView,countries)
        mylistView.adapter = arrayAdapter

        mylistView.setOnItemClickListener{adapterView,view,i,pos->
            var item = adapterView.getItemAtPosition(pos.toInt()).toString()
            Toast.makeText(this,"you clicked on $item",Toast.LENGTH_SHORT).show()

            val gmmIntentUri = Uri.parse("geo:0,0?q=${item}")

            // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        // Make the Intent explicit by setting the Google Maps package
            mapIntent.setPackage("com.google.android.apps.maps")

// Attempt to
            startActivity(mapIntent)






        }




    }
}