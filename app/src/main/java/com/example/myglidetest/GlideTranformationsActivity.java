package com.example.myglidetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GlideTranformationsActivity extends AppCompatActivity {

    @Bind(R.id.tv_title)
    TextView mTvTitle;
    @Bind(R.id.rv_glide_transformations)
    RecyclerView mRvGlideTransformations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_tranformations);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        mTvTitle.setText("图片变换");
        // 初始化Recyclerview
        GlideTranformationsAdapter glideTranformationsAdapter = new GlideTranformationsAdapter(this);
        mRvGlideTransformations.setAdapter(glideTranformationsAdapter);
        mRvGlideTransformations.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
