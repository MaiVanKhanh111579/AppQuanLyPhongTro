package TinDang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.appqlphongtro.R;

import java.util.List;

public class TinDangAdapter extends ArrayAdapter<TinDang> {
    private Context context;
    private List<TinDang> tinList;

    public TinDangAdapter(Context context, List<TinDang> tinList) {
        super(context, 0, tinList);
        this.context = context;
        this.tinList = tinList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_tindang, parent, false);
        }

        TinDang tin = tinList.get(position);

        ImageView img = convertView.findViewById(R.id.imgPhong);
        TextView tvTieuDe = convertView.findViewById(R.id.tvTieuDe);
        TextView tvGia = convertView.findViewById(R.id.tvGia);
        TextView tvDiaChi = convertView.findViewById(R.id.tvDiaChi);
        TextView tvZalo = convertView.findViewById(R.id.tvZalo);

        // Gán dữ liệu
        img.setImageResource(tin.imageRes);  // hoặc dùng Glide nếu image là URL
        tvTieuDe.setText(tin.tieuDe);
        tvGia.setText(tin.gia);
        tvDiaChi.setText(tin.diaChi);
        tvZalo.setText(tin.zalo);  // Thêm nếu có số Zalo

        return convertView;
    }
}
