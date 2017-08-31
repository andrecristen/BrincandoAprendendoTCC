package com.example.andrecristen.brincandoeaprendendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }
    public void startTelaMenu(View view) {

        Intent telaMenu = new Intent(this, TelaMenu.class);
        startActivity(telaMenu);
    }
    public void startTelaSobre(View view) {

        Intent telaSobre = new Intent(this, Sobre.class);
        startActivity(telaSobre);
    }

}
