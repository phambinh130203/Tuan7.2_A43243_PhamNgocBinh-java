package com.example.myapplication.tuan41;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan412MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView Tvkq;
    Context context=this;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan412_main);
        tuan41VolleyFn volleyFn= new tuan41VolleyFn();
        Tvkq=findViewById(R.id.tuan412kq);
        btnGetData=findViewById(R.id.tuan412btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,Tvkq);
            }
        });
    }
}