package br.com.zazao.exerciciosjava.models;

import java.net.URL;

public class InformacoesGitHub {
    private String usuario;
    private String url = "https://api.github.com/users/";

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
