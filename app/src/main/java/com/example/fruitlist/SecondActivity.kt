package com.example.fruitlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun handleOnClickEvent(view: View) {
        val MainActivity = Intent (this, MainActivity::class.java)
        startActivity(MainActivity)
    }
}