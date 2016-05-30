package com.example.liuqun.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;//定义RecyclerView对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv =new RecyclerView(this);//实例化对象

        setContentView(rv);//关联vh

        //设置RecyclerView的布局,这里使用LinearLayout
//        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager
//                .HORIZONTAL,false));

        rv.setLayoutManager(new GridLayoutManager(this,4,LinearLayoutManager
                .HORIZONTAL,false));

        //填充内容 使用Adapter
        rv.setAdapter(new MyAdapter());

    }

}
