package vn.edu.iuh.fit.se.android.lab_04;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Product> products;
    private int positionSelected = -1;

    public ProductAdapter(Context context, int layout, List<Product> products) {
        this.context = context;
        this.layout = layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        }

        TextView tvProductName = (TextView) view.findViewById(R.id.tvProductName);
        TextView tvProductShop = (TextView) view.findViewById(R.id.tvShopName);
        ImageView imgProductImage = (ImageView) view.findViewById(R.id.imgProductImage);

        final Product product = products.get(i);
        tvProductName.setText(product.getProductName());
        tvProductShop.setText(product.getShop());
        imgProductImage.setImageResource(product.getProductImage());

        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "" + product.getProductName(), Toast.LENGTH_SHORT).show();
                        positionSelected = i;
                        notifyDataSetChanged();
                    }
                }
        );
//
//        final ConstraintLayout constraintLayout = view.findViewById(R.id.mainLayout);
//        if(positionSelected == i){
//            constraintLayout.setBackgroundColor(Color.BLUE);
//        }
//        else
//            constraintLayout.setBackgroundColor(Color.WHITE);

        return view;
    }
}
