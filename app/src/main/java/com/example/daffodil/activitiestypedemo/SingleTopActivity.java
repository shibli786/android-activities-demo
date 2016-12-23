package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTopActivity extends AppCompatActivity {

    Button btnGoBackTesting,btnSingleTopSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        btnGoBackTesting=(Button)findViewById(R.id.btn_goback_testing);
        btnSingleTopSelf=(Button)findViewById(R.id.btn_single_top_self);
        btnGoBackTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleTopActivity.this,TestingSingleTopActivity.class);
                startActivity(intent);


            }
        });

        btnSingleTopSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SingleTopActivity.this,SingleTopActivity.class);
                startActivity(intent);


            }
        });
    }
}
