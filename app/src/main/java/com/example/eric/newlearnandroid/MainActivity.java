package com.example.eric.newlearnandroid;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//新加入注释!!!!
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMethord(R.layout.class.toString());
    }
    //新建工程方法
    protected  void myMethord(String str){
        System.out.println(str);
    }
}
