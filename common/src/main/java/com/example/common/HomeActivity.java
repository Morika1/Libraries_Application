package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class HomeActivity extends AppCompatActivity {

    private MaterialButton home_BTN_start;
    private MaterialTextView home_LBL_ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();
        initViews();

        home_LBL_ad.setText(App_Parent.adid);
    }


    private void initViews() {
        home_BTN_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, App_Parent.gameClass));
                finish();
            }
        });
    }

    private void findViews() {

        home_BTN_start = findViewById(R.id.home_BTN_start);
        home_LBL_ad = findViewById(R.id.home_LBL_ad);



    }

}