package com.example.mydimanche

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCustomButton = findViewById<Button>(R.id.mySimpleButtonD)

        val myFirstTextView = findViewById<TextView>(R.id.myFirstTextViewDimanche)

        myCustomButton.setOnClickListener(){
            Log.d("Demo", "this is my forst LogZ!")
            myFirstTextView.setText("This is ODD!!!!")
        }
    }
}