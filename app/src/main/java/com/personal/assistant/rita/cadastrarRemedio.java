package com.personal.assistant.rita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.personal.assistant.rita.ui.login.LoginActivity;

public class cadastrarRemedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_remedio);

        final Button proximoButton = findViewById(R.id.proximo);
        final Button pularButton = findViewById(R.id.pular);

        proximoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToCadastrarHorario();
            }
        });

        pularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToCadastrarHorario();
            }
        });
    }

    private void switchToCadastrarHorario() {
        Intent switchActivityIntent = new Intent(this, cadastrarHorarios.class);
        startActivity(switchActivityIntent);
    }

    private void switchToHomePage() {
        Intent switchActivityIntent = new Intent(this, homePage.class);
        startActivity(switchActivityIntent);
    }
}