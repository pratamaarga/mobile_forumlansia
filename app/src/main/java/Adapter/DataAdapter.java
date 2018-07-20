package Adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.coba.els_connect.R;

import java.util.ArrayList;

import Model.PostModel;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<PostModel> posts;

    public DataAdapter(ArrayList<PostModel> posts) {
        this.posts = posts;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.tv_name.setText(posts.get(position).getEmail());
        holder.tv_posting.setText(posts.get(position).getPosting());
        holder.tv_date.setText(posts.get(position).getWaktu());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_posting;
        private TextView tv_date;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.tv_name);
            tv_posting = (TextView)itemView.findViewById(R.id.tv_posting);
            tv_date = (TextView)itemView.findViewById(R.id.tv_date);

        }
    }
}