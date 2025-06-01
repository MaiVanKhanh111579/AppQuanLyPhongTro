package com.example.appqlphongtro.bottomnavigation.bottomDangTin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appqlphongtro.R;
import com.example.appqlphongtro.taikhoan.ExpandablelistAdapter;
import com.example.appqlphongtro.taikhoan.GroupExpandablelistview;
import com.example.appqlphongtro.taikhoan.ItemExpandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaiKhoanFragment extends Fragment {

    private ExpandableListView expandableListView;
    private List<GroupExpandablelistview> mgroupExpandablelistview;
    private Map<GroupExpandablelistview, List<ItemExpandablelistview>> mitemExpandablelistview;
    private ExpandablelistAdapter expandablelistAdapter;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taikhoan,container, false);

        expandableListView = view.findViewById(R.id.expandablelistview_taikhoan);
        mitemExpandablelistview = getMitemExpandablelistview();
        mgroupExpandablelistview = new ArrayList<>(mitemExpandablelistview.keySet());
        expandableListView.setGroupIndicator(null);


        expandablelistAdapter = new ExpandablelistAdapter(mgroupExpandablelistview,mitemExpandablelistview);
        expandableListView.setAdapter(expandablelistAdapter);

        return view;
    }

    private Map<GroupExpandablelistview, List<ItemExpandablelistview>> getMitemExpandablelistview(){
        Map<GroupExpandablelistview, List<ItemExpandablelistview>> MitemExpandablelistview = new LinkedHashMap<>();

        GroupExpandablelistview groupExpandablelistview1 = new GroupExpandablelistview(1, "Quản lý tin đăng");
        GroupExpandablelistview groupExpandablelistview2 = new GroupExpandablelistview(2, "Quản lý khách hàng");
        GroupExpandablelistview groupExpandablelistview3 = new GroupExpandablelistview(3, "Quản lý tài chính");
        GroupExpandablelistview groupExpandablelistview4 = new GroupExpandablelistview(4, "Tiện ích");

        List<ItemExpandablelistview> itemExpandablelistviewList1 = new ArrayList<>();
        itemExpandablelistviewList1.add(new ItemExpandablelistview(1, "Đăng mới"));
        itemExpandablelistviewList1.add(new ItemExpandablelistview(2, "Danh sách tin"));
        itemExpandablelistviewList1.add(new ItemExpandablelistview(3, "Tin nháp"));

        List<ItemExpandablelistview> itemExpandablelistviewList2 = new ArrayList<>();
        itemExpandablelistviewList2.add(new ItemExpandablelistview(1, "Đăng mới"));
        itemExpandablelistviewList2.add(new ItemExpandablelistview(2, "Danh sách tin"));
        itemExpandablelistviewList2.add(new ItemExpandablelistview(3, "Tin nháp"));

        List<ItemExpandablelistview> itemExpandablelistviewList3 = new ArrayList<>();
        itemExpandablelistviewList3.add(new ItemExpandablelistview(1, "Thông tin số dư"));
        itemExpandablelistviewList3.add(new ItemExpandablelistview(2, "Lịch sử giao dịch"));
        itemExpandablelistviewList3.add(new ItemExpandablelistview(3, "Nhóm khuyến mãi"));

        List<ItemExpandablelistview> itemExpandablelistviewList4 = new ArrayList<>();
        itemExpandablelistviewList4.add(new ItemExpandablelistview(1, "Quản lý tài khoản"));
        itemExpandablelistviewList4.add(new ItemExpandablelistview(2, "Đăng xuất"));

        MitemExpandablelistview.put(groupExpandablelistview1, itemExpandablelistviewList1);
        MitemExpandablelistview.put(groupExpandablelistview2, itemExpandablelistviewList2);
        MitemExpandablelistview.put(groupExpandablelistview3, itemExpandablelistviewList3);
        MitemExpandablelistview.put(groupExpandablelistview4, itemExpandablelistviewList4);


        return MitemExpandablelistview;
    }
}
