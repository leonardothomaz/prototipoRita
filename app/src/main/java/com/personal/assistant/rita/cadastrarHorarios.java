package com.personal.assistant.rita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastrarHorarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_remedio);

        final Button concluirButton = findViewById(R.id.concluir);

        concluirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchTohomePage();
            }
        });
    }

    private void switchTohomePage() {
        Intent switchActivityIntent = new Intent(this, homePage.class);
        startActivity(switchActivityIntent);
    }
}