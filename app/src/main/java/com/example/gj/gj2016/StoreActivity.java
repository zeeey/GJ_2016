package com.example.gj.gj2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        ImageView img_bck = (ImageView)findViewById(R.id.back);
        img_bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, TeamActivity.class);
                finish();
            }
        });

        ImageView bhc = (ImageView)findViewById(R.id.bhc);
        bhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, ChoiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
