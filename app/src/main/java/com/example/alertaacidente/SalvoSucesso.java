package com.example.alertaacidente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SalvoSucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salvo_sucesso);
        final FloatingActionButton Fbutton3=findViewById(R.id.floatingActionButton3);

        Fbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar(v);
            }
        });
    }
    public void voltar(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}