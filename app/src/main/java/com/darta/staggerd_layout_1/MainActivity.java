package com.darta.staggerd_layout_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView postRecyclerView = findViewById(R.id.postsRecyclerView);
        postRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        );
        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.gambar1));
        postItems.add(new PostItem(R.drawable.gambar14));
        postItems.add(new PostItem(R.drawable.gambar2));
        postItems.add(new PostItem(R.drawable.gambar13));
        postItems.add(new PostItem(R.drawable.gambar14));
        postItems.add(new PostItem(R.drawable.gambar5));
        postItems.add(new PostItem(R.drawable.gambar12));
        postItems.add(new PostItem(R.drawable.gambar7));
        postItems.add(new PostItem(R.drawable.gambar14));
        postItems.add(new PostItem(R.drawable.gambar8));
        postItems.add(new PostItem(R.drawable.gambar9));
        postItems.add(new PostItem(R.drawable.gambar13));
        postItems.add(new PostItem(R.drawable.gambar10));

        postRecyclerView.setAdapter(new PostsAdapter(postItems));

    }
}