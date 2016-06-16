package com.pallaud.loginlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
        tvForgotPassword.setClickable(true);
        tvForgotPassword.setMovementMethod(LinkMovementMethod.getInstance());
        etEmail = (EditText) findViewById(R.id.etEmail);
    }

    public void takeToWelcome(View view) {
        Intent i = new Intent(MainActivity.this, Welcome.class);
        i.putExtra("email",etEmail.getText().toString());
        startActivity(i);
    }

}
