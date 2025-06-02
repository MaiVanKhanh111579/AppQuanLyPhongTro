package com.example.appqlphongtro.bottomnavigation.bottomDangTin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appqlphongtro.R;

import java.util.ArrayList;

import TinDang.TinDang;
import TinDang.TinDangAdapter;

public class TinDangFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tindang, container, false);

        ListView listView = view.findViewById(R.id.listViewTinDang);

        ArrayList<TinDang> list = new ArrayList<>();
        list.add(new TinDang(R.drawable.matketnoi, "Phòng trọ sạch sẽ, chung chủ", "1.000.000đ/tháng", "Hà Nội", "0936205xxx"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng mới xây 100%", "1.200.000đ/tháng", "Quận 9, TP.HCM", "0931111222"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng trọ khép kín", "800.000đ/tháng", "Quận Gò Vấp", "0934567890"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng thoáng mát, an ninh", "1.300.000đ/tháng", "Quận Tân Phú", "0988888888"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng giá rẻ, gần trường", "750.000đ/tháng", "Thủ Đức", "0909999999"));

        list.add(new TinDang(R.drawable.matketnoi, "Phòng mới xây 100%", "1.200.000đ/tháng", "Quận 9, TP.HCM", "0931111222"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng trọ khép kín", "800.000đ/tháng", "Quận Gò Vấp", "0934567890"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng thoáng mát, an ninh", "1.300.000đ/tháng", "Quận Tân Phú", "0988888888"));
        list.add(new TinDang(R.drawable.matketnoi, "Phòng giá rẻ, gần trường", "750.000đ/tháng", "Thủ Đức", "0909999999"));
        TinDangAdapter adapter = new TinDangAdapter(getContext(), list);
        listView.setAdapter(adapter);

        return view;
    }
}
