package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    boolean bottom1 = false;
    boolean bottom2 = false;
    boolean bottom3 = false;
    boolean bottom4 = false;
    boolean bottom5 = false;
    boolean bottom6 = false;
    boolean bottom7 = false;
    boolean bottom8 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!bottom1){
            Intent intent = new Intent(this, Func1Activity.class);
            startActivity(intent);
        }
        if(!bottom2){
            Intent intent = new Intent(this, Func2Activity.class);
            startActivity(intent);
        }
        if(!bottom3){
            Intent intent = new Intent(this, Func3Activity.class);
            startActivity(intent);
        }
        if(!bottom4){
            Intent intent = new Intent(this, Func4Activity.class);
            startActivity(intent);
        }
        if(!bottom5){
            Intent intent = new Intent(this, Func5Activity.class);
            startActivity(intent);
        }
        if(!bottom6){
            Intent intent = new Intent(this, Func5Activity.class);
            startActivity(intent);
        }
        if(!bottom7){
            Intent intent = new Intent(this, Func5Activity.class);
            startActivity(intent);
        }
        if(!bottom8){
            Intent intent = new Intent(this, Func5Activity.class);
            startActivity(intent);
        }
    }
    public void bottom1(View v){

    }

}

