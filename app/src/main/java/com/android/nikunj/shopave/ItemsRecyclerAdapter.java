package com.android.nikunj.shopave;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gurleensethi on 08/08/17.
 */

public class ItemsRecyclerAdapter extends RecyclerView.Adapter<ItemsRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<ProductModel> mProductList;

    public ItemsRecyclerAdapter(Context context, List<ProductModel> products) {
        mContext = context;
        mProductList = products;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }

    //ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitleTextView;
        private TextView mPriceTextView;
        private ImageView mProductImageView;
        private RatingBar mRatingBar;
        private TextView mTotalRatingsTextView;
        private ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.productImageView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            mPriceTextView = (TextView) itemView.findViewById(R.id.priceTextView);
            mTotalRatingsTextView = (TextView) itemView.findViewById(R.id.totalRatingsTextView);
            mProductImageView = (ImageView) itemView.findViewById(R.id.productImageView);
            mRatingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }

        void bindData(int position) {
            ProductModel product = mProductList.get(position);

            String titleText = product.getName();
            if (titleText.length() > 13) {
                titleText = titleText.substring(0, 13) + "...";
            }

            mTitleTextView.setText(titleText);
            mPriceTextView.setText("$" + String.valueOf(product.getPrice()));
            mTotalRatingsTextView.setText("(" + product.getTotalRatings() + ")");
            mRatingBar.setRating(product.getRating().floatValue());
            mImageView.setImageResource(product.getImage());
        }
    }
}
