package com.example.ma.marouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.ma.routerbase.AppUtils;
import com.example.ma.routerbase.RouterPath;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.route1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppUtils.toastss(MainActivity.this,"测试");
                ARouter.getInstance()
                        .build(RouterPath.ACTIVITY_LOGIN)
                        .navigation();
            }
        });
    }
}

