package com.zqx.kedaxunfei.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zqx.kedaxunfei.R;
import com.zqx.kedaxunfei.bean.SpeakerBean;

import java.util.List;

/**
 * Created by ZhangQixiang on 2017/1/6.
 */
public class SpeakerAdapter extends MyBaseAdapter<SpeakerBean> {

    public SpeakerAdapter(List<SpeakerBean> datas) {
        super(datas);
    }

    @Override
    protected void setData(int position, View convertView, ViewGroup parent, Object viewHolder) {
        ViewHolder vh = (ViewHolder) viewHolder;
        SpeakerBean item = getItem(position);
        vh.iv.setImageResource(item.iconId);
        vh.tv.setText(item.desc);
    }

    @Override
    protected Object getViewHolder(View convertView) {
        return new ViewHolder(convertView);
    }

    private static  class ViewHolder{
        ImageView iv;
        TextView tv;

        ViewHolder(View view) {
            iv = (ImageView) view.findViewById(R.id.iv_speaker_icon);;
            tv = (TextView) view.findViewById(R.id.tv_speaker_desc);
        }
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_speaker;
    }
}
