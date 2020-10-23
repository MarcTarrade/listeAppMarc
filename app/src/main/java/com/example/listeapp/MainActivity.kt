package com.example.listeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var items = Array<AndVersion>(14, {AndVersion()})

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndVersionAdapter(items)
    }



    fun seedItems(){
        val nameArray = resources.getStringArray(R.array.version)
        val images = arrayOf(R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.honeycomb, R.drawable.gingerbread, R.drawable.icecream, R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo, R.drawable.pie)
        val description = resources.getStringArray(R.array.description)
        for (k in 0..13) {
            items[k] = AndVersion(nameArray[k], images[k], description[k])
        }
    }
}
