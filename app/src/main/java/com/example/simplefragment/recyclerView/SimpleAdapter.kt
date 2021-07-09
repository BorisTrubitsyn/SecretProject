package com.example.simplefragment.recyclerView

import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.simplefragment.R
import com.example.simplefragment.inflateView

class SimpleAdapter(
    @LayoutRes
    private val itemLayoutRes: Int = R.layout.item_recycler_view,
) : RecyclerView.Adapter<SimpleAdapter.ServicesHolder>() {
    private val simpleList = mutableListOf<String>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = ServicesHolder(p0)

    override fun onBindViewHolder(servicesHolder: ServicesHolder, position: Int) {
        val employee = simpleList[position]
        servicesHolder.bindView(employee)
    }

    override fun getItemCount() = simpleList.size

    fun setData(list: List<String>) {
        simpleList.clear()
        simpleList.addAll(list)
        notifyDataSetChanged()
    }

    inner class ServicesHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(parent.inflateView(itemLayoutRes)) {
        fun bindView(list: String) {
            with(itemView) {
                val textViewItemRecycler = findViewById<TextView>(R.id.textViewItemRecycler)
                textViewItemRecycler.text = list
            }
        }
    }
}

