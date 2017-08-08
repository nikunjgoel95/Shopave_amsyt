package com.android.nikunj.shopave;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MarketActivity extends AppCompatActivity {

    private RecyclerView mCategoriesRecyclerView;
    private RecyclerView mBrandsRecyclerView;
    private RecyclerView mTrendsRecyclerView;
    private RecyclerView mNewRecyclerView;
    private RecyclerView mHotRecyclerView;
    private TabLayout mTabLayout;
    private BrandRecyclerAdapter mBrandRecyclerAdapter;
    private BrandRecyclerAdapter mCategoryRecyclerAdapter;
    private ItemsRecyclerAdapter mRecyclerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        mCategoriesRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewCategories);
        mBrandsRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewBrands);
        mTrendsRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewTrends);
        mNewRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewNew);
        mHotRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewHot);
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        initializeViews();
    }

    private void initializeViews() {
        List<Integer> imagesList = new ArrayList<>();
        imagesList.add(R.drawable.advert_2);
        imagesList.add(R.drawable.advert_3);
        imagesList.add(R.drawable.advert_2);
        imagesList.add(R.drawable.advert_3);
        imagesList.add(R.drawable.advert_2);
        imagesList.add(R.drawable.advert_3);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), imagesList);
        mViewPager.setAdapter(adapter);
        mViewPager.setPageMargin(20);
        mViewPager.setClipToPadding(false);
        mViewPager.setPadding(40, 20, 20, 40);

        mTabLayout.addTab(mTabLayout.newTab().setText("BRANDS"));
        mTabLayout.addTab(mTabLayout.newTab().setText("DEALS"));
        mTabLayout.addTab(mTabLayout.newTab().setText("SHOP"));
        mTabLayout.addTab(mTabLayout.newTab().setText("COLLECTION"));

        mCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mBrandsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mTrendsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mNewRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mHotRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<BrandModel> categoryList = new ArrayList<>();
        categoryList.add(new BrandModel("Smart Phones",R.drawable.layer1));
        categoryList.add(new BrandModel("Electronics",R.drawable.layer2));
        categoryList.add(new BrandModel("Fashion",R.drawable.layer3));
        categoryList.add(new BrandModel("Gadgets", R.drawable.layer1));
        categoryList.add(new BrandModel("Appliances", R.drawable.layer2));

        mCategoryRecyclerAdapter = new BrandRecyclerAdapter(this, categoryList);
        mCategoriesRecyclerView.setAdapter(mCategoryRecyclerAdapter);

        List<BrandModel> brandList = new ArrayList<>();
        brandList.add(new BrandModel("Adidas", R.drawable.layer_99));
        brandList.add(new BrandModel("Rebook", R.drawable.layer_8));
        brandList.add(new BrandModel("Nike", R.drawable.layer3));
        brandList.add(new BrandModel("Samsung", R.drawable.layer_99));
        brandList.add(new BrandModel("Nokia", R.drawable.layer3));

        mBrandRecyclerAdapter = new BrandRecyclerAdapter(this, brandList);
        mBrandsRecyclerView.setAdapter(mBrandRecyclerAdapter);

        List<ProductModel> productList = new ArrayList<>();
        productList.add(new ProductModel("Lip Colour Shade", 750.0, 4.5, 1100,R.drawable.layer_4));
        productList.add(new ProductModel("Ladies Bag", 2200.0, 4.3, 700,R.drawable.layer_5));
        productList.add(new ProductModel("SAMSUNG LED TV", 853.0, 4.0, 456,R.drawable.layer_6));
        productList.add(new ProductModel("TRAVEL BAG", 54.0, 3.9, 12,R.drawable.layer_4));
        productList.add(new ProductModel("USB C Data Cable", 12.0, 4.0, 34,R.drawable.layer_5));
        productList.add(new ProductModel("Table Cloth", 5.0, 4.1, 3464,R.drawable.layer_6));
        productList.add(new ProductModel("Moto Z2", 750.0, 2.5, 123,R.drawable.layer_7));
        productList.add(new ProductModel("Screen Protector iPhone 6", 25.0, 3.1, 768,R.drawable.layer_4));
        productList.add(new ProductModel("Messenger Bag-BT123", 120.0, 3.7, 500,R.drawable.layer_5));

        mRecyclerAdapter = new ItemsRecyclerAdapter(this, productList);
        mTrendsRecyclerView.setAdapter(mRecyclerAdapter);
        mNewRecyclerView.setAdapter(mRecyclerAdapter);
        mHotRecyclerView.setAdapter(mRecyclerAdapter);
    }
}
