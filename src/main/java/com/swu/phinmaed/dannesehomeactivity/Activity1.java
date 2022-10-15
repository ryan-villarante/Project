package com.swu.phinmaed.dannesehomeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    Button calculator, family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        calculator = findViewById(R.id.btnCalcu);
        family = findViewById(R.id.btnFam);

    }
    public void buttonCalculatorOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), Calculator.class);
        startActivity(i);
    }
    public void buttonFamilyOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), Family.class);
        startActivity(i);
    }
}