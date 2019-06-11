package ifpi.hello4662019.modelos;

import java.util.ArrayList;
import java.util.List;

public class Anuncio {
    private String titulo;
    private String descrição;
    private String data;
    private double preço;
    private String endereço;

    public Anuncio(String titulo, String descrição, String data, double preço, String endereço) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.data = data;
        this.preço = preço;
        this.endereço = endereço;
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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreço() { return preço; }

    public void setPreço(double preço) { this.preço = preço; }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
