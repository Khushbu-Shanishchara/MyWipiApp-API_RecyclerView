package com.app.mywikiapp.Adapters;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.mywikiapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    public List<String> titles;
    public List<String> desc;
    public List<String> img_paths;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    public CustomAdapter(List<String> titles, List<String> desc, List<String> img_paths) {
        this.titles = titles;
        this.desc = desc;
        this.img_paths = img_paths;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final String title = this.titles.get(position);
        holder.txtTitle.setText(title);

        final String desc = this.desc.get(position);
        holder.txtDesc.setText(desc);

        final String img = this.img_paths.get(position);
        Picasso.get().load(img).into(holder.imgView);

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;// init the item view's
        TextView txtDesc;
        ImageView imgView;
        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
            txtDesc = (TextView) itemView.findViewById(R.id.txt_desc);
            imgView = (ImageView) itemView.findViewById(R.id.img_view);

        }
    }
}