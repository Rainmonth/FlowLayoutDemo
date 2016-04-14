package com.rainmonth.flowlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.rainmonth.view.FlowLayout;

public class MainActivity extends AppCompatActivity {

    private String[] flowStrings = {"Hello", "Android", "Weclome Hi ", "Button", "TextView", "Hello",
            "Android", "Welcome", "Button ImageView", "TextView", "HelloWorld",
            "Android", "Welcome Hello", "Button Text", "TextView"};
    private FlowLayout flowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flowLayout = (FlowLayout) findViewById(R.id.flow_layout);
        initData();
    }

    private void initData() {
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < flowStrings.length; i++) {
            TextView textView = (TextView) inflater.inflate(R.layout.tv, flowLayout, false);
            textView.setText(flowStrings[i]);
            flowLayout.addView(textView);
        }
    }
}
