package com.example.acemeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {
    Button goBackButton;
    TextView welcomeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        welcomeText = (TextView) findViewById(R.id.welcomeText);
        welcomeText.setText("sdfsfsdfsdf");
        goBackButton = (Button) findViewById(R.id.goBackButton);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Username_Data");
        System.out.println(message);
        welcomeText.setText("Welcome \n" + message);



        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
