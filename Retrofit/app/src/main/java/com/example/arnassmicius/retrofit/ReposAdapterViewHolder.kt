package com.example.arnassmicius.retrofit

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by arnas on 18.2.16.
 */

class ReposAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    internal val listItem: TextView = itemView.findViewById(R.id.list_item)

}
