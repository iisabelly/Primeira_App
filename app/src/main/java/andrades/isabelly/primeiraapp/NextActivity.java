package andrades.isabelly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    // ações que serão feitas quando NextActivity for criada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // pega conteúdo da intent criada no MainActivity e inclui na NextActivity
        Intent i = getIntent();
        String textoDigitado = i.getStringExtra("texto");

        // por meio do findViewById encontra o textView para a fazer o display do texto que foi
        // digitado na MainActivity
        TextView tvText = findViewById(R.id.tvText);
        tvText.setText(textoDigitado);
    }
}