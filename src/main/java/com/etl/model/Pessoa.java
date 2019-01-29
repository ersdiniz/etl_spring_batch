package com.etl.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Pessoa implements Serializable {

    private String nome;

    public Pessoa() {
    }

    private Pessoa(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static Pessoa of(final String nome) {
        return new Pessoa(nome);
    }
}