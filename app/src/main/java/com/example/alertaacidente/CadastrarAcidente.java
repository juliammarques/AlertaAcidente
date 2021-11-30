package com.example.alertaacidente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarAcidente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_acidente);


        final Button button3=findViewById(R.id.button3);
        final Button button4=findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cancelar(v);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                salvar(v);
        }
        });
    }

    public void cancelar(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void salvar(View v)
    {
        Intent intent = new Intent(this, SalvoSucesso.class);
        startActivity(intent);
    }
}