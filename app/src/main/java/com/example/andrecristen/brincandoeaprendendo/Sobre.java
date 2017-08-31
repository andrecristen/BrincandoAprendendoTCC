package com.example.andrecristen.brincandoeaprendendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Sobre extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        textView =(TextView)findViewById(R.id.web);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://tccifcibirama.wixsite.com/home'> ACESSE! </a>";
        textView.setText(Html.fromHtml(text));
    }

    public void startTelaInicial(View view) {

        Intent telaInicial = new Intent(this, TelaInicial.class);
        startActivity(telaInicial);
    }

}
