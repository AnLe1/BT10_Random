package com.lecongan.bt10_random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btnThucHien;
private TextView tv_kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_kq = (TextView) findViewById(R.id.tv_kq);
        btnThucHien = (Button) findViewById(R.id.btn);
        btnThucHien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x= (int) (Math.random()*101);//Min + (int)(Math.random()*((Max-Min)+1)
                tv_kq.setText("ket qua: "+x);
            }
        });
    }
}
