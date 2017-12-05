package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
        Intent intent = getIntent();
    }
    public void buttom1(View v){
        Toast.makeText(this, "特殊功能",Toast.LENGTH_LONG).show();

    }
}
