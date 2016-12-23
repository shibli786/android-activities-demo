package com.example.daffodil.activitiestypedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestingSingleTaskActivity extends AppCompatActivity {

    Button btnSingleTaskTesting,btnTestingSingleTaskSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_single_task);
        btnSingleTaskTesting=(Button)findViewById(R.id.btn_single_task_testing_to_activity);
        btnTestingSingleTaskSelf=(Button)findViewById(R.id.btn_testing_single_task_self);

        btnSingleTaskTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestingSingleTaskActivity.this,SingleTaskActivity.class);
                startActivity(intent);

            }
        });

        btnTestingSingleTaskSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TestingSingleTaskActivity.this,TestingSingleTaskActivity.class);

                startActivity(intent);
            }
        });
    }
}
