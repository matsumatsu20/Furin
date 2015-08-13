package com.mikazuki.android.furin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {


    @Bind(R.id.button)
    Button button;

    Intent intent;

    SoundPool soundPool;
    int sound1;
    int sound2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        intent = new Intent(this, BuyActivity.class);

        //--------------------- SoundPoolのインスタンス作成
        SoundPool.Builder builder = new SoundPool.Builder();
        soundPool = builder.build();

        //--------------------- 効果音をロードしておく。
        //------------引数はContext、リソースID、優先度
        sound1 = soundPool.load(this, R.raw.nc72423, 1);
        soundPool.play(sound1, 0.5f, 0.5f, 0, 0, 1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.button)
    public void onClearPreference(View v) {
        soundPool.play(sound1, 0.5f, 0.5f, 0, 0, 1);
    }

    @Override
    protected void onResume() {
        // TODO 自動生成されたメソッド・スタブ
        super.onResume();

    }

}
