package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStandard,btnSingleTask,btnSingleTop,btnSingleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStandard=(Button)findViewById(R.id.btn_standard);
        btnSingleTop=(Button)findViewById(R.id.btn_single_top);
        btnSingleInstance=(Button)findViewById(R.id.btn_single_instance);
        btnSingleTask=(Button)findViewById(R.id.btn_single_tsak);

        btnStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnSingleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,TestingSingleInstance.class);
                startActivity(intent);

            }
        });

        btnSingleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent= new Intent(MainActivity.this,TestingSingleTaskActivity.class);
                startActivity(intent);


            }
        });

        btnSingleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,TestingSingleTopActivity.class);
                startActivity(intent);

            }
        });

    }
}
