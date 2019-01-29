package com.etl.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Pessoa implements Serializable {

    private Long id;
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    private Pessoa(final Long id, final String nome, final String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public static Pessoa of(final Long id, final String nome, final String cpf) {
        return new Pessoa(id, nome, cpf);
    }
}