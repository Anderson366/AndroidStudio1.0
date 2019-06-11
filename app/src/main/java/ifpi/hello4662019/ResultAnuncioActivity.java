package ifpi.hello4662019;

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
    }

}
