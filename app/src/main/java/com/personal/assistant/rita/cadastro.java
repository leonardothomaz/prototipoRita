package com.personal.assistant.rita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.personal.assistant.rita.ui.login.LoginActivity;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final Button loginButton = findViewById(R.id.login);
        final Button registerButton = findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToLogin();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToCadastrarRemedio();
            }
        });
    }

    private void switchToLogin() {
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchToCadastrarRemedio() {
        Intent switchActivityIntent = new Intent(this, cadastrarRemedio.class);
        startActivity(switchActivityIntent);
    }
}