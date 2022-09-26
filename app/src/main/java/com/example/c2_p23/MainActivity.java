package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button (View view){
        TextView light = findViewById(R.id.light);

        String[] color = {"RED", "YELLOW", "GREEN"};
        int[] colors = {Color.RED, Color.YELLOW, Color.GREEN};

        if (count < 3){
            light.setText(color[count]);
            light.setTextColor(colors[count]);
            count ++;
        } else {
            count = 1;
            light.setText(color[0]);
            light.setTextColor(colors[0]);
        }

    }
}