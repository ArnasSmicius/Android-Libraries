package com.example.arnassmicius.retrofit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arnassmicius.retrofit.api.model.GitHubRepo;

import java.util.List;

/**
 * Created by arnas on 18.2.16.
 */

public class GitHubRepoAdapter extends RecyclerView.Adapter<ReposAdapterViewHolder> {

    private Context context;
    private List<GitHubRepo> repos;

    public GitHubRepoAdapter(Context context, List<GitHubRepo> repos) {
        this.context = context;
        this.repos = repos;
    }

    @Override
    public ReposAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_repo, parent, false);
        return new ReposAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReposAdapterViewHolder holder, int position) {
        holder.listItem.setText(repos.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return repos.size();
    }
}
