package vn.edu.iuh.fit.se.android.lab_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private List<Product> products;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.lvProduct);

        products = new ArrayList<>();
        products.add(new Product("Ca nấu lẩu, nấu mì mini", "Devang", R.drawable.ca_nau_lau));
        products.add(new Product("1Kg khô gà bơ tỏi", "LTD Food", R.drawable.ga_bo_toi));
        products.add(new Product("Xe cần cẩu đa năng", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        products.add(new Product("Đồ chơi dạng mô hình", "Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        products.add(new Product("Lãnh đạo giản đơn", "Minh Long Book", R.drawable.lanh_dao_gian_don));
        products.add(new Product("Hiểu lòng con trẻ", "Minh Long Book", R.drawable.hieu_long_con_tre));

        ProductAdapter productAdapter = new ProductAdapter(this, R.layout.product_listview, products);
        listView.setAdapter(productAdapter);
    }
}