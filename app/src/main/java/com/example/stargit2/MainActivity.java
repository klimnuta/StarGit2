package com.example.stargit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView tv1;
    Button btn;
    int num=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btn = findViewById(R.id.button1);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        num = num+1;
        tv1.setText(Integer.toString(num));
    }
}
