package com.example.belajariqrodasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mulai=(Button) findViewById(R.id.button);
        mulai.setOnClickListener(new klik());
    }
    class klik implements Button.OnClickListener{
        @Override
        public void onClick(View v){
            Intent i= new Intent(MainActivity.this,Bismillah.class);
            finish();
            startActivity(i);
        }
    }
}