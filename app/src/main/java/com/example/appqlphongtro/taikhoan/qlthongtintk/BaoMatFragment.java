package com.example.appqlphongtro.taikhoan.qlthongtintk;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.appqlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BaoMatFragment extends Fragment {
    private NavController navController;
    private BottomNavigationView bottomNavigationView;

    @SuppressLint({"ResourceType", "MissingInflatedId", "LocalSuppress"})
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_taikhoan_baomat,container, false);
        navController = NavHostFragment.findNavController(this);
        bottomNavigationView = getActivity().findViewById(R.id.bottom_nav);
        bottomNavigationView.setVisibility(View.GONE);

        ImageButton btn_backStack = view.findViewById(R.id.btn_taikhoan_baomat_backStack);
        btn_backStack.setOnClickListener(v -> {
            navController.popBackStack();
            bottomNavigationView.setVisibility(View.VISIBLE);
        });
        Button btn_thaydoimatkhau = view.findViewById(R.id.btn_taikhoan_baomat_luu);
        btn_thaydoimatkhau.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        Button btn_khoataikhoan = view.findViewById(R.id.btn_taikhoan_baomat_khoataikhoan);
        btn_khoataikhoan.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        Button btn_xoataikhoan = view.findViewById(R.id.btn_taikhoan_baomat_xoataikhoan);
        btn_xoataikhoan.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        CheckBox checkBox_xoataikhoan = view.findViewById(R.id.checkbox_taikhoan_baomat_xoataikhoan);
        checkBox_xoataikhoan.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox_xoataikhoan.setChecked(false);
                Toast.makeText(getContext(), "Đang cập nhật", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
