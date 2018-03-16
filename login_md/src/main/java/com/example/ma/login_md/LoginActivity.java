package com.example.ma.login_md;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.ma.routerbase.RouterPath;

@Route(path = RouterPath.ACTIVITY_LOGIN)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login);
        findViewById(R.id.login_to_news).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build(RouterPath.ACTIVITY_NEWS)
                        .navigation();
            }
        });
    }
}
