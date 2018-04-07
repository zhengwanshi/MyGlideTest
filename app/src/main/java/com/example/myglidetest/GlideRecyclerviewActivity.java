package com.example.myglidetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GlideRecyclerviewActivity extends AppCompatActivity {

    @Bind(R.id.tv_title)
    TextView mTvTitle;
    @Bind(R.id.rv_glide)
    RecyclerView mRvGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_recyclerview);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        mTvTitle.setText("RecyclerviewGride");
        // 初始化Recyclerview
        GlideRecyclerviewAdapter glideRecyclerviewAdapter = new GlideRecyclerviewAdapter(this);
        mRvGlide.setAdapter(glideRecyclerviewAdapter);
        mRvGlide.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
