package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        getting recycler view by its id
        val recyclerview=findViewById<RecyclerView>(R.id.recyclerview)
//        this creates a vertical layout manager
        recyclerview.layoutManager=LinearLayoutManager(this)
//        ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()
//        This loop will create 20 views containing the image with the count of view
        for (i in 1..20){
            data.add(ItemsViewModel(R.drawable.ic_baseline_folder_shared_25, "item" +i))
        }
//        This will pass the Arraylist to our Adapter
        val adapter=CustomAdapter(data)
//        Setting the adapter with the recyclerview
        recyclerview.adapter=adapter
    }
}