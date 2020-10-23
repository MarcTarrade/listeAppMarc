package com.example.listeapp

import android.annotation.SuppressLint
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var items = Array<AndVersion>(14, { AndVersion() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndVersionAdapter(items)
    }


    fun seedItems() {
        val nameArray = resources.getStringArray(R.array.version)
        val images: TypedArray = resources.obtainTypedArray(R.array.image)
        val description = resources.getStringArray(R.array.description)
        for (k in 0..13) {
            items[k] = AndVersion(nameArray[k], images.getResourceId(k, -1), description[k])
        }
    }
}
