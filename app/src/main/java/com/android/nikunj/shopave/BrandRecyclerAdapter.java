package com.android.nikunj.shopave;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gurleensethi on 09/08/17.
 */

public class BrandRecyclerAdapter extends RecyclerView.Adapter<BrandRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<BrandModel> nBrandList;

    public BrandRecyclerAdapter(Context context, List<BrandModel> products) {
        mContext = context;
        nBrandList = products;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_brand, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return nBrandList.size();
    }

    //ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;
        private ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            mNameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            mImageView = (ImageView) itemView.findViewById(R.id.imageView);
        }

        void bindData(int position) {
            BrandModel brand = nBrandList.get(position);

            mNameTextView.setText(brand.getTitle());
            mImageView.setImageResource(brand.getImage());
        }
    }
}
