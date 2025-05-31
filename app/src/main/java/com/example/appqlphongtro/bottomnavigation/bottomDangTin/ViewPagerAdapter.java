package com.example.appqlphongtro.bottomnavigation.bottomDangTin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TongQuanFragment();
            case 1:
                return new TinDangFragment();
            case 2:
                return new KhachHangFragment();
            case 3:
                return new TaiKhoanFragment();
            default:
                return new TaiKhoanFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
