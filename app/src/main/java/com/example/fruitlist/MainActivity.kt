package com.example.fruitlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity(), ListAdapter.onItemClickListener {


    private val premadeList =  PreList(15)
    private val adapter = ListAdapter(premadeList, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.fruitlist).adapter = adapter
        findViewById<RecyclerView>(R.id.fruitlist).layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.fruitlist).setHasFixedSize(true)


    }



    private fun PreList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()
        for (i in 0 until size) {
            val drawable = when (i % 3 ) {
                0 -> R.drawable.apple
                1 -> R.drawable.banana
                else -> R.drawable.carot
            }
            val item = ExampleItem(drawable, "Fruta: $i", "Descrição da fruta")
            list += item
        }
        return list
    }

    override fun onItemClick(position: Int) {
        val DetailsActivity = Intent (this, DetailsActivity::class.java)
        DetailsActivity.putExtra("Title",premadeList[position].text1)
        DetailsActivity.putExtra("Desc",premadeList[position].text2)
        DetailsActivity.putExtra("Image",premadeList[position].imageResource.toString())
        startActivity(DetailsActivity)

    }

    fun handleOnClickEvent(view: View) {
        val SecondActivity = Intent (this, SecondActivity::class.java)
        startActivity(SecondActivity)
    }


}