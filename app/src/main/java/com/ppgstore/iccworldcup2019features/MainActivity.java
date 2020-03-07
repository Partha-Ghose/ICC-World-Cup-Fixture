package com.ppgstore.iccworldcup2019features;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView camera,call,status,chat;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camera= (TextView) findViewById(R.id.camera);
        call= (TextView) findViewById(R.id.call);
        status= (TextView) findViewById(R.id.status);
        chat= (TextView) findViewById(R.id.chat);
        viewPager = (ViewPager) findViewById(R.id.fragment_container);

        pagerViewAdapter =new PagerViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                onChangeTab(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    private void onChangeTab(int i) {
        if(i==0)
        {
            camera.setTextSize(22);
            camera.setTextColor(getColor(R.color.colorPrimary));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.colorAccent));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.colorAccent));

            call.setTextSize(20);
            call.setTextColor(getColor(R.color.colorAccent));
        }

        if(i==1)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.colorAccent));

            chat.setTextSize(22);
            chat.setTextColor(getColor(R.color.colorPrimary));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.colorAccent));

            call.setTextSize(20);
            call.setTextColor(getColor(R.color.colorAccent));
        }

        if(i==2)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.colorAccent));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.colorAccent));

            status.setTextSize(22);
            status.setTextColor(getColor(R.color.colorPrimary));

            call.setTextSize(20);
            call.setTextColor(getColor(R.color.colorAccent));
        }

        if(i==3)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.colorAccent));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.colorAccent));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.colorAccent));

            call.setTextSize(22);
            call.setTextColor(getColor(R.color.colorPrimary));
        }
    }
}
