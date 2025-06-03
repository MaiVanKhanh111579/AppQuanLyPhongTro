package com.example.appqlphongtro;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AlertDialog;


import com.example.appqlphongtro.bottomnavigation.bottomDangTin.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationview;
    private ViewPager2 viewPager;
    @SuppressLint({"NonConstantResourceId", "CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        navigationview = findViewById(R.id.bottom_nav);
        navigationview.setItemActiveIndicatorEnabled(false);//Loại bỏ animation mặc định của bottomnavigation
        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavController navController = navHostFragment.getNavController();
        navigationview.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_tongquan) {
                navController.navigate(R.id.navigation_tongquan);
                return true;
            } else if (item.getItemId() == R.id.navigation_tindang) {
                navController.navigate(R.id.navigation_tindang);
                return true;
            } else if (item.getItemId() == R.id.navigation_dangtinnew) {
                navController.navigate(R.id.navigation_dangtinnew);
                return true;
            } else if (item.getItemId() == R.id.navigation_khachhang) {
                navController.navigate(R.id.navigation_khachhang);
                return true;
            } else if (item.getItemId() == R.id.navigation_taikhoan) {
                navController.navigate(R.id.navigation_taikhoan);
                return true;
            } else navController.navigate(R.id.navigation_tongquan);
            return false;
        });

//        navigationview = findViewById(R.id.bottom_nav);
//        viewPager = findViewById(R.id.view_pager2);
//
//        NavHostFragment navHostFragment = (NavHostFragment)
//                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
//        NavController navController = navHostFragment.getNavController();
//         BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
//        NavigationUI.setupWithNavController(bottomNav, navController);

//        navigationview.setOnItemSelectedListener(item -> {
//            if (item.getItemId() == R.id.navigation_tongquan) {
//                navController.navigate(R.id.navigation_tongquan);
//                return true;
//            } else if (item.getItemId() == R.id.navigation_tindang) {
//                navController.navigate(R.id.navigation_tindang);
//                return true;
//            } else if (item.getItemId() == R.id.navigation_khachhang) {
//                navController.navigate(R.id.navigation_khachhang);
//                return true;
//            } else if (item.getItemId() == R.id.navigation_taikhoan) {
//                navController.navigate(R.id.navigation_taikhoan);
//                return true;
//            } else navController.navigate(R.id.navigation_tongquan);
//            // xử lý các item khác
//            return false;
//        });

        //Sự kiện
//        navigationview.setOnItemSelectedListener(item -> {
//            //Chức năng chọn item
//            if (item.getItemId()== R.id.item_nav_overview)
//            {
//                viewPager.setCurrentItem(0);
//                return true;
//            } else if (item.getItemId()== R.id.item_nav_listcheck) {
//                viewPager.setCurrentItem(1);
//                return true;
//            } else if (item.getItemId()== R.id.item_nav_pluscircle) {
//                return true;
//            } else if (item.getItemId()== R.id.item_nav_people) {
//                viewPager.setCurrentItem(2);
//                return true;
//            } else if (item.getItemId()== R.id.item_nav_3dot) {
//                viewPager.setCurrentItem(3);
//                return true;}
//
//            return false ;
//        });
        //setUPViewPager();
    }
    private void setUPViewPager(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

    }
    public void chuyenSangThemKhach(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_them_khach_hang, null);
        builder.setView(dialogView);
        builder.show();
    }
}