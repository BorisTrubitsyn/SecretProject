package com.example.simplefragment.recyclerView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplefragment.R

class RecyclerViewActivity : AppCompatActivity() {
    private val adapterSimple = SimpleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        initListeners()
        initRecyclerView()
    }

    private fun initListeners() {
//        TODO("Not yet implemented")
    }

    private fun initRecyclerView() {
        val list =
            listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
        val recyclerViewSimple = findViewById<RecyclerView>(R.id.simpleRecyclerview)
        recyclerViewSimple.layoutManager = LinearLayoutManager(this)
        recyclerViewSimple.setHasFixedSize(false)
        recyclerViewSimple.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerViewSimple.adapter = adapterSimple
        adapterSimple.setData(list)
    }
}