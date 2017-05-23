package com.example.gill.moneyapp_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a button which open the Category_Activity from main screen
        Button CategoryBtn = (Button)findViewById(R.id.Category_Button);
        CategoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Category_Activity.class));
            }
        });


        //Create a button which open the Category_Activity from main screen
        Button addBtn = (Button)findViewById(R.id.add_Button);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, add_Activity.class));
            }
        });


    }
}
