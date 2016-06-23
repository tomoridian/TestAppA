package com.example.tospace.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void OnclickSaw (View view){
        Button btn_Saw = (Button) findViewById(R.id.button2);
        Intent intent= new  Intent(MainActivity.this,PageSaw.class);
        startActivity(intent);
    }
}
