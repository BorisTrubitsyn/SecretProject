package com.example.secretProject.expandableRecyclerView

import android.view.View
import android.widget.TextView
import com.example.secretProject.R
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder

class GroupHolderView(itemView: View) : GroupViewHolder(itemView) {
    private val categoryTitle: TextView = itemView.findViewById(R.id.titleCategory)


    fun bind(group: ExpandableGroup<GroupListDto>) {
        categoryTitle.text = group.title
    }

}