package ifpi.hello4662019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultAnuncioActivity extends AppCompatActivity {
    TextView txtdetalhetitulo, txtdetalhevalor, txtdetalhedescricao, txtdetalhedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_anuncio);
        txtdetalhetitulo.findViewById(R.id.txt_detalhe_titulo);
        txtdetalhedescricao.findViewById(R.id.txt_detalhe_descricao);
        txtdetalhevalor.findViewById(R.id.txt_detalhe_valor);
        txtdetalhedata.findViewById(R.id.txt_detalhe_data);
        Intent i = getIntent();
        txtdetalhevalor.setText(i.getStringExtra("AnuncioValor"));
        txtdetalhetitulo.setText(i.getStringExtra("AnuncioTitulo"));
        txtdetalhedata.setText(i.getStringExtra("AnuncioData"));
        txtdetalhedescricao.setText(i.getStringExtra("AnuncioDescricao"));

    }



}
