package com.example.arnassmicius.retrofit

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.arnassmicius.retrofit.api.model.GitHubRepo

/**
 * Created by arnas on 18.2.16.
 */

class GitHubRepoAdapter(private val context: Context, private val repos: List<GitHubRepo>) : RecyclerView.Adapter<ReposAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposAdapterViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_repo, parent, false)
        return ReposAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReposAdapterViewHolder, position: Int) {
        holder.listItem.text = repos[position].name
    }

    override fun getItemCount(): Int {
        return repos.size
    }
}
