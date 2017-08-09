package com.android.nikunj.shopave;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {

    private TextView mSignup;
    private TextView mSignin;
    private TextView mSkip;
    private View signin_view;
    private View signup_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        mSignin = (TextView) findViewById(R.id.signin);
        signin_view = (View) findViewById(R.id.signin_view);
        signup_view = (View) findViewById(R.id.signup_view);
        mSignup = (TextView) findViewById(R.id.signup);
        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin_view.setVisibility(View.INVISIBLE);
                signup_view.setVisibility(View.VISIBLE);
                mSignin.setTextColor(getResources().getColor(R.color.signincolor));
                mSignup.setTextColor(getResources().getColor(R.color.textcolorhigh));
                Intent i = new Intent(login_activity.this,sign_up.class);
                startActivity(i);
            }
        });
        mSkip = (TextView) findViewById(R.id.skip);
        mSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_activity.this,MarketActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        signin_view.setVisibility(View.VISIBLE);
        signup_view.setVisibility(View.INVISIBLE);
        mSignin.setTextColor(getResources().getColor(R.color.textcolorhigh));
        mSignup.setTextColor(getResources().getColor(R.color.signincolor));
    }
}
