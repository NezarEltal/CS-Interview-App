package com.eltals.cs_interview_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position){
                    case 0: Toast.makeText(MainActivity.this, "Moving to Big O",
                            Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, BigOActivity.class);

                        startActivity(intent);
                        break;
                    default: Toast.makeText(MainActivity.this, "Position " + position, Toast.LENGTH_SHORT).show();
                             break;
                }

            }
        });
    }
}