package ifpi.hello4662019.modelos;

import java.util.ArrayList;
import java.util.List;

public class Anuncio {
    private String titulo;
    private String descricao;
    private String data;
    private double preco;
    private String endereco;

    public Anuncio(String titulo, String descricao, String data, double preco, String endereco) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.preco = preco;
        this.endereco = endereco;
    }

    public static List<Anuncio> getAnuncios() {
        List<Anuncio> anuncios = new ArrayList<>();
        anuncios.add(new Anuncio("Abajur","Usado poucas vezes.","31 de maio de 2019",80,"Rua São Jõao"));
        anuncios.add(new Anuncio("Abajur","Usado poucas vezes.","31 de maio de 2019",80,"Rua São Jõao"));
        anuncios.add(new Anuncio("Abajur","Usado poucas vezes.","31 de maio de 2019",80,"Rua São Jõao"));
        anuncios.add(new Anuncio("Abajur","Usado poucas vezes.","31 de maio de 2019",80,"Rua São Jõao"));
        anuncios.add(new Anuncio("Abajur","Usado poucas vezes.","31 de maio de 2019",80,"Rua São Jõao"));

        return anuncios;
    }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() { return preco; }

    public void setPreco(double preco) { this.preco = preco; }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
