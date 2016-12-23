package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestingSingleTopActivity extends AppCompatActivity {
    Button btn_back,btnLauchMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_single_top);

        btn_back=(Button)findViewById(R.id.btn_single_top_testing_to_activity);
        btnLauchMe=(Button)findViewById(R.id.btn_testing_single_top_self);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TestingSingleTopActivity.this, SingleTopActivity.class);
                startActivity(intent);


            }
        });

        btnLauchMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TestingSingleTopActivity.this,TestingSingleTopActivity.class);
                startActivity(intent);
            }
        });
    }
}
