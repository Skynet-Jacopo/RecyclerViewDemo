package com.example.liuqun.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;//定义RecyclerView对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv =new RecyclerView(this);//实例化对象

        setContentView(rv);//关联vh

        //设置RecyclerView的布局,这里使用LinearLayout
        rv.setLayoutManager(new LinearLayoutManager(this));

        //填充内容 使用Adapter
        rv.setAdapter(new RecyclerView.Adapter() {

            class MyViewHolder extends RecyclerView.ViewHolder{

                private TextView tv;//绑定子对象的数据类型

                public MyViewHolder(TextView itemView) {
                    super(itemView);
                    tv =itemView;
                }

                //用getTv()向外界返回一个TextView
                public TextView getTv() {
                    return tv;
                }
            }


            //创建ViewHolder的方法,要使用它,要自定义一个类继承RecyclerView.MyViewHolder
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                //这个ViewHolder是自定义的
                return new MyViewHolder(new TextView(parent.getContext()));
            }

            //对TextView赋值
            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                MyViewHolder vh = (MyViewHolder) holder;
//                vh.getTv().setText("Item"+position);

                vh.getTv().setText(data[position]);
            }

            //获取RecyclerView子对象的数量
            @Override
            public int getItemCount() {
                return data.length;
            }
            //假数据
            private String [] data =new String[]{"流浪法师","瑞兹","我掌控雷电"};
        });

    }
}
