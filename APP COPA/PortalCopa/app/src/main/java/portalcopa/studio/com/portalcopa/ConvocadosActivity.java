package portalcopa.studio.com.portalcopa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ConvocadosActivity extends AppCompatActivity {

    private ListView  listaConvocados;
    private String[] NOMES = {"Neymar", "Fred", "Alisson", "Philippe Coutinho", "Marcelo", "Gabriel Jesus", "Roberto Firmino",
            "Willian", "Thiago Silva" , "Paulinho" , "Casemiro", "Danilo", "Taison", "Douglas Costa", "Miranda", "Renato Augusto",
            "Ederson", "Fernandinho", "Filipe Luís", "Pedro Geromel", "Fagner", "Cássio"};

    private String[] perfis = {"Craque, camisa 10 do time, 26 anos e joga pelo PSG", "Promessa brasileira, 25 anos e joga pelo Shakhtar Donetsk",
            "Formado pelo Internacional, 25 anos e joga pelo Roma", "Jogador em destaque na europa, 26 anos e joga pelo Barcelona",
            "Grande nome na europa, 30 anos e joga pelo Real Madrid", "Ganhou tudo no Brasil pelo Palmeiras, 21 anos e joga pelo Manchester City",
            "Excelente temporada em 2017, 26 anos e joga pelo Liverpool", "Segunda copa pelo Brasil, 29 anos e joga pelo Chelsea",
            "Apareceu no Fluminense, 33 anos e joga pelo PSG", "Pupilo de Tite, 29 anos e joga pelo Barcelona", "Conhecido desde jovem, 26 anos e joga pelo Real Madrid",
            "Apareceu pelo América-MG, 26 anos e joga pelo Manchester City", "Grande surpresa da convocação, 30 anos e joga pelo Shakhtar Donetsk",
            "Relevado no Grêmio, 27 anos e joga pelo Juventus", "Frequente nas recentes convocações, 34 anos e joga pela Internazionale de Milão",
            "Outro que cresceu com o Tite, 30 anos e joga pelo Beijing Guoan", "Requisitado por Guardiola, 24 anos e joga pelo Benfica",
            "Titular no famoso 7x1, 33 anos e joga pelo Manchester City", "Primeira copa dele, 32 anos e joga pelo Atlético de Madrid", "Um dos mais velhos da seleção, 32 anos e joga pelo Grêmio",
            "Convocado por conta da lesão de Daniel Alves, 28 anos e joga pelo Corinthians", "Revelado no Grêmio, 31 anos e joga pelo Corinthians"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocados);

        listaConvocados = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                NOMES
        );

        listaConvocados.setAdapter( adaptador );


        listaConvocados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });
    }
}
