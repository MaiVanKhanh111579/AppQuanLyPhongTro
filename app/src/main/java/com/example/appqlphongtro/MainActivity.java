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
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;


import com.example.appqlphongtro.bottomnavigation.bottomDangTin.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationview;

    @SuppressLint({"NonConstantResourceId", "CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }

    public void chuyenSangThemKhach(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_them_khach_hang, null);
        builder.setView(dialogView);
        builder.show();
    }
}