package com.rainmonth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rainmonth.flowlayoutdemo.FlowLayoutDemo;
import com.rainmonth.flowlayoutdemo.R;
import com.rainmonth.flowlayoutdemo.TagCloudViewDemo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_flow_layout).setOnClickListener(this);
        findViewById(R.id.btn_tag_cloud_view).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_flow_layout:
                intent.setClass(this, FlowLayoutDemo.class);
                startActivity(intent);
                break;
            case R.id.btn_tag_cloud_view:
                intent.setClass(this, TagCloudViewDemo.class);
                startActivity(intent);
                break;
        }
    }
}
