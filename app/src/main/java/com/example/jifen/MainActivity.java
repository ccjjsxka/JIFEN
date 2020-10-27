package com.example.jifen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (APP.getNewSession()) {
            APP.setNewSession();
        }

    }
    public void onBackPressed() {
        super.onBackPressed();
    }
    public void jumpBasketballCourtCounter(View view) {   //跳转篮球计分器页面
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Basketball.class);
        startActivity(intent);
    }

}