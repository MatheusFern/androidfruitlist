package com.example.fruitlist

import android.content.ComponentCallbacks
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val Title = intent.getStringExtra("Title")
        findViewById<TextView>(R.id.tv_tittle).text = Title
        val Desc = intent.getStringExtra("Desc")
        findViewById<TextView>(R.id.tv_description).text = Desc
        val Image = intent.getStringExtra("Image")
        if (Image != null) {
            findViewById<ImageView>(R.id.image_view).setImageResource(Image.toInt())
        }
    }

    fun handleOnClickback(view: View) {
        val MainActivity = Intent (this, MainActivity::class.java)
        startActivity(MainActivity)
    }
}
