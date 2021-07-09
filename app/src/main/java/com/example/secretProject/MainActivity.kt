package com.example.secretProject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.secretProject.recyclerView.RecyclerViewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        val buttonRecyclerView = findViewById<Button>(R.id.buttonRecyclerView)
        val buttonExpandableRecyclerView = findViewById<Button>(R.id.simpleExpandableRecyclerView)
        //recyclerview
        buttonRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
        //expandable group recyclerview
        buttonExpandableRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
    }
}