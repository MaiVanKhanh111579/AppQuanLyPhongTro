package com.example.appqlphongtro.bottomnavigation.bottomTimkiem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.appqlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation_TimKiem extends Fragment {
    private BottomNavigationView navigationview;
    private NavController navController;
    private BottomNavigationView bottomNavigationView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_taikhoan_timkiem,container,false);

        navigationview = view.findViewById(R.id.bottom_nav);
        navigationview.setItemActiveIndicatorEnabled(false);//Loại bỏ animation mặc định của bottomnavigation
        navController = NavHostFragment.findNavController(this);

        return view;
    }
}
