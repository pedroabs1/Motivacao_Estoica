package com.motivacaoestoica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class telaPreferencias extends AppCompatActivity {

    private ImageButton btretornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_preferencias);

        getSupportActionBar().hide(); //esconder action bar, aquela barra acima do app

        btretornar = findViewById(R.id.bt_retornar); //associa id ao item na tela

        btretornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaPreferencias.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}