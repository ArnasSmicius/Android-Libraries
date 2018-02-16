package com.example.arnassmicius.retrofit;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by arnas on 18.2.16.
 */

public class ReposAdapterViewHolder extends RecyclerView.ViewHolder {

    final TextView listItem;

    public ReposAdapterViewHolder(View itemView) {
        super(itemView);

        listItem = itemView.findViewById(R.id.list_item);
    }
}
