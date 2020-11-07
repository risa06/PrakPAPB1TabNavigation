package com.prakpapb1.tabnavigation;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleText;
        TextView subText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText=itemView.findViewById(R.id.text1);
            subText=itemView.findViewById(R.id.text2);
        }
    }
}
