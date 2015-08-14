package com.mikazuki.android.furin.tools;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mikazuki.android.furin.R;
import com.mikazuki.android.furin.entity.FurinList;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by matsuMac on 2015/08/10.
 */
public class FurinListAdapter extends BaseAdapter {
    public LayoutInflater mLayoutInflater;
    public Context mContext;
    public List<FurinList> mItems;

    public FurinListAdapter(Context context, List<FurinList> items) {
        mContext = context;
        mItems = items;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_item, parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        FurinList item = mItems.get(position);

        holder.userName.setText(item.getName());

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.userName)
        TextView userName;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
