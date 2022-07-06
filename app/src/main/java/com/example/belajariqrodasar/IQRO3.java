package com.example.belajariqrodasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class IQRO3 extends AppCompatActivity {
    Button home,back;
    TextView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro3);
        g=(TextView)findViewById(R.id.textView4);
        home=(Button) findViewById(R.id.button4);
        home.setOnClickListener(new klik());
        back=(Button) findViewById(R.id.button6);
        back.setOnClickListener(new klik2());
    }

    public void Hijaiyah3(View view) {
        switch (view.getId()) {
            case R.id.kaf:
                g.setText("KAF");
                break;
            case R.id.lam:
                g.setText("LAM");
                break;
            case R.id.mim:
                g.setText("MIM");
                break;
            case R.id.nun:
                g.setText("NUN");
                break;
            case R.id.wau:
                g.setText("WAU");
                break;
            case R.id.hamzah:
                g.setText("HA'");
                break;
            case R.id.ya:
                g.setText("YA'");
                break;
        }
    }

    class klik implements Button.OnClickListener{
        public void onClick (View v){
            Intent i=new Intent(IQRO3.this,MainActivity.class);
            finish();
            startActivity(i);
        }
    }
    class klik2 implements Button.OnClickListener{
        public void onClick (View v){
            Intent i=new Intent(IQRO3.this,IQRO2.class);
            finish();
            startActivity(i);
        }
    }
}