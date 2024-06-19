package com.phalphearun.campinggearapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout loginForm, signUpForm;
    private EditText editTextUsername, editTextPassword;
    private EditText editTextNewUsername, editTextNewEmail, editTextNewPassword;
    private Button loginButton, signUpButton;
    private TextView textViewSignUp, textViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginForm = findViewById(R.id.loginForm);
        signUpForm = findViewById(R.id.signUpForm);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);

        editTextNewUsername = findViewById(R.id.editTextNewUsername);
        editTextNewEmail = findViewById(R.id.editTextNewEmail);
        editTextNewPassword = findViewById(R.id.editTextNewPassword);

        loginButton = findViewById(R.id.loginButton);
        signUpButton = findViewById(R.id.signUpButton);

        textViewSignUp = findViewById(R.id.textViewSignUp);
        textViewLogin = findViewById(R.id.textViewLogin);

        // Initially show login form and hide sign-up form
        loginForm.setVisibility(View.VISIBLE);
        signUpForm.setVisibility(View.GONE);

        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show sign-up form, hide login form
                loginForm.setVisibility(View.GONE);
                signUpForm.setVisibility(View.VISIBLE);
            }
        });

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show login form, hide sign-up form
                loginForm.setVisibility(View.VISIBLE);
                signUpForm.setVisibility(View.GONE);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login logic here
                // For demonstration, navigate to MainActivity after login
                navigateToMain();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sign-up logic here
                // For demonstration, navigate to MainActivity after sign-up
                navigateToMain();
            }
        });
    }

    private void navigateToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
