package com.example.appqlphongtro.taikhoan.qlthongtintk;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.appqlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class QLThongTinTKFragment extends Fragment {
    private NavController navController;
    private BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qlthongtintk, container, false);
        NavController navController = NavHostFragment.findNavController(this);
        bottomNavigationView = getActivity().findViewById(R.id.bottom_nav);
        bottomNavigationView.setVisibility(View.GONE);
        ImageButton btnBack = view.findViewById(R.id.btn_qlthongtin_backStack);
        Button btnSave = view.findViewById(R.id.btn_qlthongtintk_luu);
        btnBack.setOnClickListener(v -> {
            if (navController != null) {
                navController.popBackStack();
                bottomNavigationView.setVisibility(View.VISIBLE);
            }
        });
        btnSave.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Thao tác lưu thông tin thành công", Toast.LENGTH_SHORT).show();
        });
        return view;
    }
}

