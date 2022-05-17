package com.example.orient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.TextView);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            text.setText("Портретная ориентация");
            text.setTextColor(getResources().getColor(R.color.Cl));
        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            text.setText("Альбомная ориентация");
            text.setTextColor(getResources().getColor(R.color.PL));


        }
    }
}