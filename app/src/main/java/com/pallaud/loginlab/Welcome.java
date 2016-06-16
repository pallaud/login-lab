package com.pallaud.loginlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        String name = getIntent().getStringExtra("email");
        TextView tvWelcomeText = (TextView) findViewById(R.id.tvWelcomeText);
        tvWelcomeText.setText("Welcome " + name + " !");
    }

}
