package com.example.rifat.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        tabLayout=findViewById(R.id.tablayout_id);

        viewPager=findViewById(R.id.view_pager);

        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(),"Item One");
        adapter.addFragment(new TwoFragment(),"Item Two");
        adapter.addFragment(new ThreeFragment(),"Item Three");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
