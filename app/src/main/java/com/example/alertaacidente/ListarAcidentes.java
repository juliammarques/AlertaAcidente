package com.example.alertaacidente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListarAcidentes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_acidentes);

        final FloatingActionButton Fbutton=findViewById(R.id.floatingActionButton);
        final FloatingActionButton Fbutton2=findViewById(R.id.floatingActionButton2);
        Fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastroacidente(v);
            }
        });
        Fbutton2.setOnClickListener(new View.OnClickListener() {
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
    public void cadastroacidente(View v){
        Intent intent = new Intent(this, CadastrarAcidente.class);
        startActivity(intent);
    }
}