package com.example.belajariqrodasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bismillah extends AppCompatActivity {
    Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bismillah);
        a=(Button) findViewById(R.id.button7);
        a.setOnClickListener(new klik());
    }
    class klik implements Button.OnClickListener{
        @Override
        public void onClick (View v){
            Intent i= new Intent(Bismillah.this,IQRO.class);
            finish();
            startActivity(i);
        }
    }
}