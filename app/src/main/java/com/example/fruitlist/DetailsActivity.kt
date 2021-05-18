package com.example.fruitlist

import android.content.ComponentCallbacks
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }

    fun handleOnClickback(view: View) {
        val MainActivity = Intent (this, MainActivity::class.java)
        startActivity(MainActivity)
    }
}
