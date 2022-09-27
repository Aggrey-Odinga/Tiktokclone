package com.example.tiktok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tiktok.Adapter.DemoAdapter;
import com.example.tiktok.Models.MediaObject;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private ImageView sound_dis;
    private List<MediaObject> mediaObjectList = new ArrayList<>();
    private DemoAdapter demoAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();
    }
    private void init(){

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        SnapHelper mSnapHelper = new PagerSnapHelper();
        mSnapHelper.attachToRecyclerView(recyclerView);

        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));
        mediaObjectList.add(new MediaObject("","", "", "", "", "", "", "", "",""));

        demoAdapter = new DemoAdapter(mediaObjectList, getApplicationContext());
        recyclerView.setAdapter(demoAdapter);
        demoAdapter.notifyDataSetChanged();


    }

}
