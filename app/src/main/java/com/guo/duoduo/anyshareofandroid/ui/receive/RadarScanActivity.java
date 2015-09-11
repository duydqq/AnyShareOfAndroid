package com.guo.duoduo.anyshareofandroid.ui.receive;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.guo.duoduo.anyshareofandroid.R;


/**
 * Created by 郭攀峰 on 2015/9/12.
 */
public class RadarScanActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radarscan);

        Intent intent = getIntent();
        if(intent != null)
        {
            TextView selfText = (TextView) findViewById(R.id.radar_scan_name);
            selfText.setText(intent.getStringExtra("name"));
        }

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
}
