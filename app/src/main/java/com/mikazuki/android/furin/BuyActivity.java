package com.mikazuki.android.furin;

import android.app.Activity;
import android.app.LauncherActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.mikazuki.android.furin.entity.FurinList;
import com.mikazuki.android.furin.tools.FurinListAdapter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BuyActivity extends Activity {

    ListView mListView;
    FurinList hurinList = new FurinList(1, "ほげほげ");

    List<FurinList> hogeItems = java.util.Arrays.asList(hurinList,hurinList,hurinList);;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        ButterKnife.bind(this);

        List<FurinList> items = hogeItems;

//        ArrayAdapter<FurinList> adapter = new ArrayAdapter<FurinList>(this, R.layout.list_item);
//        adapter.add(hurinList);
//        adapter.add(hurinList);
//        adapter.add(hurinList);



        ListView mListView = (ListView)this.findViewById(R.id.list);

        FurinListAdapter mmadapter = new FurinListAdapter(this, items);

        mListView.setAdapter(mmadapter);



        //mListView.setAdapter(adapter);

        //setListAdapter(new FurinListAdapter(this, items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.button2)
    public void buckMain() {
        finish();
    }
}
