package ifpi.hello4662019.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ifpi.hello4662019.R;
import ifpi.hello4662019.ResultAnuncioActivity;
import ifpi.hello4662019.modelos.Anuncio;

public class AnuncioAdapter extends RecyclerView.Adapter<AnuncioAdapter.AnuncioViewholder> {
    private Context context;
    private List<Anuncio> anuncios;

    public AnuncioAdapter(Context context, List<Anuncio> anuncios) {
        this.context = context;
        this.anuncios = anuncios;
    }

    @NonNull
    @Override
    public AnuncioViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int tipo) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.item_anuncio,viewGroup,false);
        AnuncioViewholder viewholder = new AnuncioViewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnuncioViewholder anuncioViewholder, int posicao) {

        Anuncio anuncio = anuncios.get(posicao);

        anuncioViewholder.txtTitulo.setText(anuncio.getTitulo());
        anuncioViewholder.txtDescricao.setText(anuncio.getDescricao());
        anuncioViewholder.txtPreco.setText("R$ " + anuncio.getPreco());
    }

    @Override
    public int getItemCount() { return anuncios.size(); }

    class AnuncioViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtTitulo, txtDescricao, txtPreco;

        public AnuncioViewholder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txt_titulo);
            txtDescricao = itemView.findViewById(R.id.txt_descricao);
            txtPreco = itemView.findViewById(R.id.txt_preco);
            //configurar o click com uma intent

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Anuncio anuncio = anuncios.get(getAdapterPosition());

            Intent intent = new Intent(context, ResultAnuncioActivity.class);

            intent.putExtra("AnuncioTitulo", anuncio.getTitulo());
            intent.putExtra("AnuncioDescricao", anuncio.getDescricao());
            intent.putExtra("AnuncioValor", anuncio.getPreco());
            intent.putExtra("AnuncioData", anuncio.getData());
            context.startActivity(intent);

        }
    }
}
