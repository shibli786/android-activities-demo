package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTaskActivity extends AppCompatActivity {

    Button btnSingleTaskSelf,btnSingleTaskTesting,btnSingleTaskLauchMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        btnSingleTaskSelf=(Button)findViewById(R.id.btn_single_task_self);
        btnSingleTaskTesting=(Button)findViewById(R.id.btn_single_task_to_testing);

        btnSingleTaskSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SingleTaskActivity.this,SingleTaskActivity.class);
                startActivity(intent);


            }
        });

        btnSingleTaskTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(SingleTaskActivity.this,TestingSingleTaskActivity.class);
                startActivity(intent);


            }
        });




    }

}
