package com.shizy.flowlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.shizy.flowlayout.view.FlowLayout;

public class MainActivity extends AppCompatActivity {

    private String[] mTitles = new String[]{
            "Hello", "Android", "Studio", "MainActivity", "Layout",
            "Hello", "Android", "Studio", "MainActivity", "FlowLayout",
            "Hello", "Android", "Studio", "MainActivity", "FlowLayout"
    };

    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (FlowLayout) findViewById(R.id.flowlayout);
        initData();
    }

    private void initData() {
        for (int i = 0; i < mTitles.length; i++) {
            TextView tv = (TextView) getLayoutInflater().inflate(R.layout.label, mFlowLayout, false);
            tv.setText(mTitles[i]);
            mFlowLayout.addView(tv);
        }
    }

}
