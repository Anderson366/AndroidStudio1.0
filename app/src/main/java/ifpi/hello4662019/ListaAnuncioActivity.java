package ifpi.hello4662019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ifpi.hello4662019.adapters.AnuncioAdapter;
import ifpi.hello4662019.modelos.Anuncio;

public class ListaAnuncioActivity extends AppCompatActivity {

    RecyclerView rvAnuncios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_anuncio);
        rvAnuncios = findViewById(R.id.rv_anuncios);
    }

    @Override
    protected void onResume() {
        super.onResume();
        obterAnuncios();
    }

    private void obterAnuncios() {
        List<Anuncio> anuncio = Anuncio.getAnuncios();
        AnuncioAdapter adapter = new AnuncioAdapter(this, anuncio);
        rvAnuncios.setAdapter(adapter);
        rvAnuncios.setLayoutManager(new LinearLayoutManager(this));
    }
}
