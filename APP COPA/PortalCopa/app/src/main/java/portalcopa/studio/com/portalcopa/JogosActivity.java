package portalcopa.studio.com.portalcopa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JogosActivity extends AppCompatActivity {

    private Button botaoSuica;
    private Button botaoCosta;
    private Button botaoServia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);

        botaoSuica = (Button) findViewById(R.id.suicaId);
        botaoCosta = (Button) findViewById(R.id.costaId);
        botaoServia = (Button) findViewById(R.id.serviaId);

        botaoSuica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JogosActivity.this, suicaActivity.class));
            }
        });

        botaoCosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JogosActivity.this, CostaActivity.class));
            }
        });

        botaoServia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JogosActivity.this, ServiaActivity.class));
            }
        });
    }
}
