package andrades.isabelly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // encontra o botão por meio da findViewById
        Button btnEnviar = findViewById(R.id.btnEnviar);

        // atribuindo o método a ação OnClick do botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override

            // pega conteúdo escrito no textView e envia para a NextActivity
            public void onClick(View view) {
                // por meio do findViewById encontra o textView para pegar o texto escrito para a
                // NextActivity
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();

                // cria a intent para fazer a navegação entre a MainActivity e a NextActivity e
                // adiciona a ela os valores para "levar" para NextActiviy
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);

            }
        });
    }


}