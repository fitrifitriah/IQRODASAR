package com.example.belajariqrodasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class IQRO extends AppCompatActivity {
    ImageButton alif,ba,ta,tsa,jim,ha,kho,dal,dzal;
    Button b;
    TextView c;
    public static String isi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro);
        c=(TextView)findViewById(R.id.textView3);
        b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new klik());


    }

    public void Hijaiyah(View view) {
        switch (view.getId()){
            case R.id. alif:
                c.setText("ALIF");
                break;
            case R.id.ba:
                c.setText("BA");
                break;
            case R.id. ta:
                c.setText("TA");
                break;
            case R.id.tsa:
                c.setText("TSA");
                break;
            case R.id. jim:
                c.setText("JIM");
                break;
            case R.id.ha:
                c.setText("HA");
                break;
            case R.id.kho:
                c.setText("KHO");
                break;
            case R.id. dal:
                c.setText("DAL");
                break;
            case R.id.dzal:
                c.setText("DZAL");
                break;
        }
    }

    class klik implements View.OnClickListener{
        @Override
        public void onClick (View v){
            Intent i= new Intent(IQRO.this,IQRO2.class);
            finish();
            startActivity(i);
        }
    }

}