package br.com.zazao.exerciciosjava.exceptions;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String message) {
        super(message);
    }
}
