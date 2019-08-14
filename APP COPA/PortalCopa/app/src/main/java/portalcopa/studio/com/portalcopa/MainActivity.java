package portalcopa.studio.com.portalcopa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView noticias;
    private ImageView convocados;
    private ImageView videos;
    private ImageView jogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticias = (ImageView) findViewById(R.id.noticiasId);

        noticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NoticiasActivity.class));
            }
        });

        convocados = (ImageView) findViewById(R.id.convocadosId);

        convocados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConvocadosActivity.class));
            }
        });

        videos = (ImageView) findViewById(R.id.videosId);

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Video.class));
            }
        });

        jogos = (ImageView) findViewById(R.id.jogosId);

        jogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, JogosActivity.class));
            }
        });
    }
}
