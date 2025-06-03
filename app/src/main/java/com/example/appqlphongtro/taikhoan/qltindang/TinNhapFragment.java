package com.example.appqlphongtro.taikhoan.qltindang;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.appqlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TinNhapFragment extends Fragment {
    private NavController navController;
    private BottomNavigationView bottomNavigationView;
    @Nullable
    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tinnhap, container, false);
        navController = NavHostFragment.findNavController(this);
        bottomNavigationView = getActivity().findViewById(R.id.bottom_nav);
        bottomNavigationView.setVisibility(View.GONE);

        ImageButton btnBackStack = view.findViewById(R.id.btn_tinnhap_backStack);
        btnBackStack.setOnClickListener(v -> {
            navController.popBackStack();
            bottomNavigationView.setVisibility(View.VISIBLE);
        });

        return view;
    }
}
