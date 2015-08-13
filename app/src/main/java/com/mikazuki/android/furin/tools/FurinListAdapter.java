package com.mikazuki.android.furin.tools;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mikazuki.android.furin.entity.FurinList;

import java.util.List;

/**
 * Created by matsuMac on 2015/08/10.
 */
public class FurinListAdapter extends BaseAdapter {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<FurinList> mItems;

    FurinListAdapter(Context context, List<FurinList> items) {
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
        if(convertView == null) {
            convertView = mLayoutInflater.inflate(android.R.layout.list_content, parent,false);
        }

        FurinList item = mItems.get(position);

        ((TextView)convertView).setText(item.getName());

        return convertView;
    }
}
