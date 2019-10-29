package com.example.debugexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello World!")

//region
        //logging
        //Log.d("MainActivity", "Hello World!")
//endregion

//region
        //exception and debug break point
//        val x: String? = "John"
//        val y: String? = null
//        Log.d("MainActivity", (x!!.length + y!!.length).toString())
//endregion

    }
}
