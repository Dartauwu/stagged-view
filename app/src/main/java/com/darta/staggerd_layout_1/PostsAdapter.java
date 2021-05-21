package com.darta.staggerd_layout_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private List<PostItem> postItems;

    public PostsAdapter(List<PostItem> postItems) {
        this.postItems = postItems;
    }






    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.post_item_container,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.setPostImageView(postItems.get(position));

    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }





    class PostViewHolder extends RecyclerView.ViewHolder{

        RoundedImageView postImageView;

        PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.imagePost);
        }
        void setPostImageView(PostItem postItem){
            postImageView.setImageResource(postItem.getImage());
        }
    }


}
