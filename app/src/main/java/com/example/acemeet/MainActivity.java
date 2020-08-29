package com.example.acemeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Intent welcomeIntent, createIntent;
    TextView userNameText, passwordText, errorText;
    Button signInButton, createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameText = (TextView) findViewById(R.id.usernameText);
        passwordText = (TextView) findViewById(R.id.passwordText);
        errorText = (TextView) findViewById(R.id.errorText);
        signInButton = (Button) findViewById(R.id.signInButton);
        createAccountButton = (Button) findViewById(R.id.createAccountButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                errorText.setText("");
                if (userNameText.getText().toString().isEmpty() && passwordText.getText().toString().isEmpty()){
                    errorText.setText("Username and Password field empty");
                }
                else if (passwordText.getText().toString().isEmpty()){
                    errorText.setText("Password field empty");
                }
                else if (userNameText.getText().toString().isEmpty()){
                    errorText.setText("Username field empty");
                }
                else {
                    welcomeIntent = new Intent(getApplicationContext(), WelcomeScreen.class);
                    welcomeIntent.putExtra("Username_Data", userNameText.getText().toString());
                    startActivity(welcomeIntent);
                }
            }
        });
        /*
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            createIntent = new Intent(getApplicationContext(), CreateAccount.class);
        }
         });*/




    }
}
