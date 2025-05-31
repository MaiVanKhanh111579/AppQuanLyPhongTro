package com.example.appqlphongtro;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


import com.example.appqlphongtro.bottomnavigation.bottomDangTin.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationview;
    private ViewPager2 viewPager;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        //Ánh xạ
        navigationview = findViewById(R.id.bottom_nav);
        viewPager = findViewById(R.id.view_pager2);


        //Sự kiện
        navigationview.setSelectedItemId(R.id.item_nav_overview); //Mặc định khi mở app là Tổng quan (đối với TK đăng tin)
        navigationview.setItemActiveIndicatorEnabled(false); //Loại bỏ animation mặc định của bottomnavigation
        navigationview.setOnItemSelectedListener(item -> {
            //Chức năng chọn item
            if (item.getItemId()== R.id.item_nav_overview)
            {
                viewPager.setCurrentItem(0);
                return true;
            } else if (item.getItemId()== R.id.item_nav_listcheck) {
                viewPager.setCurrentItem(1);
                return true;
            } else if (item.getItemId()== R.id.item_nav_pluscircle) {
                return true;
            } else if (item.getItemId()== R.id.item_nav_people) {
                viewPager.setCurrentItem(2);
                return true;
            } else if (item.getItemId()== R.id.item_nav_3dot) {
                viewPager.setCurrentItem(3);
                return true;}

            return false ;
        });
        setUPViewPager();
    }
    private void setUPViewPager(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

    }
}