package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleInstanceActivity extends AppCompatActivity {

    Button btnSelf,btnSingleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        btnSelf=(Button)findViewById(R.id.btn_single_instance_self);
        btnSingleInstance=(Button)findViewById(R.id.btn_single_instance_to_testing_activity);
        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(SingleInstanceActivity.this,SingleInstanceActivity.class);
                startActivity(intent);

            }
        });

        btnSingleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SingleInstanceActivity.this,TestingSingleInstance.class);
                startActivity(intent);

            }
        });

    }
}
