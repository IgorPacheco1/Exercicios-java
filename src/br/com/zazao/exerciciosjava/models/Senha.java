package br.com.zazao.exerciciosjava.models;

import br.com.zazao.exerciciosjava.exceptions.SenhaInvalidaException;

public class Senha {
    public static void validarSenha(String senha){
        if (senha.length()<8){
            throw new SenhaInvalidaException("A senha não atende aos requisitos");
        }
    }
}
