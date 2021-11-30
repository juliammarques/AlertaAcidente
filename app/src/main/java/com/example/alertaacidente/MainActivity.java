package com.example.alertaacidente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button=findViewById(R.id.button);
        final Button button2=findViewById(R.id.button2);
        final Button button3=findViewById(R.id.button4);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               cadastroacidente(v);

           }
       });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaracidente(v);
            }
        });


    }
    public void cadastroacidente(View v){
        Intent intent = new Intent(this, CadastrarAcidente.class);
        startActivity(intent);
    }
    public void listaracidente(View v){
        Intent intent = new Intent(this,ListarAcidentes.class);
        startActivity(intent);
    }

}
