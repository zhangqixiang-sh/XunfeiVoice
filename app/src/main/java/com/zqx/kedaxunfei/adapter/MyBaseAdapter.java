package com.zqx.kedaxunfei.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by ZhangQixiang on 2017/1/6.
 */
public abstract class MyBaseAdapter<T>extends BaseAdapter{

    private List<T> mDatas;

    public MyBaseAdapter(List<T> datas){

        mDatas = datas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Object vh;
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), getLayoutRes(), null);
             vh = getViewHolder(convertView);
            convertView.setTag(vh);
        }else {
            vh = convertView.getTag();
        }
        setData(position,convertView,parent,vh);
        return convertView;
    }

    protected abstract void setData(int position, View convertView, ViewGroup parent, Object vh);

    protected abstract Object getViewHolder(View convertView);

    public abstract int getLayoutRes();
}
