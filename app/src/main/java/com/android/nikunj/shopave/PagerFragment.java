package com.android.nikunj.shopave;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by nikunjgoel on 09-08-2017.
 */

public class PagerFragment extends Fragment {

    private ImageView mImageView;
    private static final String ARGS_IMAGE = "image";

    //Instance
    public static PagerFragment getInstance(int imageId) {
        PagerFragment fragment = new PagerFragment();
        Bundle args = new Bundle();
        args.putInt(ARGS_IMAGE, imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        mImageView = (ImageView) view.findViewById(R.id.imageView);
        mImageView.setImageResource(getArguments().getInt(ARGS_IMAGE));
        return view;
    }
}
