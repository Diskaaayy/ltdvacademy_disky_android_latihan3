package com.example.diskaay.corelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKedua extends AppCompatActivity {

    private Button mBtn_kembali, mBtn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        mBtn_kembali = (Button) findViewById(R.id.kembali);
        mBtn_kembali.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(ActivityKedua.this, Home.class);
                startActivity(i);
            }
        });

        mBtn_home = (Button) findViewById(R.id.home);
        mBtn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityKedua.this,Home.class);
                startActivity(i);
            }
        });

    }
}
