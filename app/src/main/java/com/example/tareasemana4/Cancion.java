package com.example.tareasemana4;
public class Cancion {
    private String titulo,url;

    public Cancion(String titulo,String url) {
        this.titulo = titulo;
        this.url=url;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getUrl() {
        return url;
    }
}

