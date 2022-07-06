package com.example.belajariqrodasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IQRO2 extends AppCompatActivity {
    Button a,b;
    TextView f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro2);
        f = (TextView) findViewById(R.id.textView5);
        a = (Button) findViewById(R.id.button3);
        a.setOnClickListener(new klik());
        b= (Button) findViewById(R.id.button5);
        b.setOnClickListener(new klik2());
    }

    public void Hijaiyah2(View view) {
        switch (view.getId()) {
            case R.id.ro:
                f.setText("RO");
                break;
            case R.id.zai:
                f.setText("ZAI");
                break;
            case R.id.sin:
                f.setText("SIN");
                break;
            case R.id.shin:
                f.setText("SHIN");
                break;
            case R.id.sad:
                f.setText("SAD");
                break;
            case R.id.dho:
                f.setText("DHO");
                break;
            case R.id.tho:
                f.setText("THO");
                break;
            case R.id.dzo:
                f.setText("DZO");
                break;
            case R.id.ain:
                f.setText("AIN");
                break;
            case R.id.ghain:
                f.setText("GHAIN");
                break;
            case R.id.fa:
                f.setText("FA");
                break;
            case R.id.qof:
                f.setText("QOF");
                break;
        }
    }
    class klik implements Button.OnClickListener{
        public void onClick (View v){
            Intent i=new Intent(IQRO2.this,IQRO3.class);
            finish();
            startActivity(i);
        }
    }
    class klik2 implements Button.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(IQRO2.this, IQRO.class);
            finish();
            startActivity(i);
        }
    }
}