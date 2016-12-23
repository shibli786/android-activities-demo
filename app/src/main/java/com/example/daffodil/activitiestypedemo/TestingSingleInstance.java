package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestingSingleInstance extends AppCompatActivity {
    Button btnSingleInstance,btnSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_single_instance);
        btnSingleInstance=(Button) findViewById(R.id.btn_testing_single_instance);
        btnSelf=(Button)findViewById(R.id.btn_testing_single_instance_self);

        btnSingleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TestingSingleInstance.this,SingleInstanceActivity.class);
                startActivity(intent);
            }
        });
        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TestingSingleInstance.this,TestingSingleInstance.class);
                startActivity(intent);
            }
        });


    }
}
