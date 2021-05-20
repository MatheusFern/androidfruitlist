package com.example.fruitlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    companion object {
        const val SECOND_ACTIVITY_TITTLE_EXTRA_ID = "title"
        const val SECOND_ACTIVITY_DESC_EXTRA_ID = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun handleOnClickEvent(view: View) {
        val newTitle = findViewById<EditText>(R.id.editTextNewTittle)
        val newDesc = findViewById<EditText>(R.id.editTextDecription)

        val MainActivity = Intent (this, MainActivity::class.java)
        //MainActivity.putExtra(SECOND_ACTIVITY_TITTLE_EXTRA_ID, newTitle)
        //MainActivity.putExtra(SECOND_ACTIVITY_DESC_EXTRA_ID, newDesc)

        startActivity(MainActivity)
    }
}