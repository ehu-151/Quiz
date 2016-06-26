package org.t_robop.kido.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextClick(View view){

        //画面遷移
        Intent intent = new Intent(MainActivity.this,SubActivity.class);
        startActivity(intent);
        activity_subactivity2.
    }




}