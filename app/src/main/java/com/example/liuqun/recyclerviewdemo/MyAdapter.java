package com.example.liuqun.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 90516 on 5/29/2016.
 */
class MyAdapter extends RecyclerView.Adapter {

    class MyViewHolder extends RecyclerView.ViewHolder {

        private View root;
        private TextView tvTitle,tvContent;

        public MyViewHolder(View root) {
            super(root);

            tvTitle = (TextView) root.findViewById(R.id.tvTitle);
            tvContent = (TextView) root.findViewById(R.id.tvContent);
        }

        public TextView getTvContent() {
            return tvContent;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

    }


    //创建ViewHolder的方法,要使用它,要自定义一个类继承RecyclerView.MyViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //这个ViewHolder是自定义的
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_cell,null));
    }

    //对TextView赋值
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder vh = (MyViewHolder) holder;

        CellData cd =data[position];
        vh.getTvTitle().setText(cd.title);
        vh.getTvContent().setText(cd.content);

    }

    //获取RecyclerView子对象的数量
    @Override
    public int getItemCount() {
        return data.length;
    }

    private CellData[] data =new CellData[]{new CellData("瑞兹","我掌控雷电,谁人不服!"),
            new CellData("辛吉德","我摇啊摇啊摇,饮用之前要摇一摇!"),new CellData("瑞兹","我掌控雷电,谁人不服!"),
            new CellData("辛吉德","我摇啊摇啊摇,饮用之前要摇一摇!"),new CellData("瑞兹","我掌控雷电,谁人不服!"),
            new CellData("辛吉德","我摇啊摇啊摇,饮用之前要摇一摇!"),new CellData("瑞兹","我掌控雷电,谁人不服!"),
            new CellData("辛吉德","我摇啊摇啊摇,饮用之前要摇一摇!")};

    //假数据
//    private String[] data = new String[]{"流浪法师", "瑞兹", "我掌控雷电"};
}
