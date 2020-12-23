package com.example.nguyenvantri_kiemtra4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    Context context;
    ArrayList<Product> productArrayList;
    int layout;

    public ProductAdapter(Context context, ArrayList<Product> productArrayList, int layout) {
        this.context = context;
        this.productArrayList = productArrayList;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return productArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        ImageView img = convertView.findViewById(R.id.img_product);
        TextView title = convertView.findViewById(R.id.tv_title);
        TextView detail = convertView.findViewById(R.id.tv_detail);
        Product product = productArrayList.get(position);
        Picasso.get().load(productArrayList.get(position).getImg()).into(img);
        title.setText(product.title);
        detail.setText(product.detail);
        return convertView;
    }
}
