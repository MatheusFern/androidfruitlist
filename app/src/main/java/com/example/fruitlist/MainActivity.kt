package com.example.fruitlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val premadeList =  PreList(10)

        recycler_view.adapter = ListAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


    }

    private fun PreList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()
        for (i in 0 until size) {
            val drawable = when (i % 3 ) {
                0 -> R.drawable.apple
                1 -> R.drawable.carot
                else -> R.drawable.watermelon
            }
            val item = ExampleItem(drawable, "Item $i", "description")
            list += item
        }
        return list
    }


    fun handleOnClickEvent(view: View) {
        val SecondActivity = Intent (this, SecondActivity::class.java)
        startActivity(SecondActivity)
    }
}