package com.etl.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PessoaHash implements Serializable {

    private Pessoa pessoa;
    private int hash;

    public PessoaHash() {
    }

    private PessoaHash(final Pessoa pessoa, final int hash) {
        this.pessoa = pessoa;
        this.hash = hash;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getHash() {
        return hash;
    }

    public static PessoaHash of(final Pessoa pessoa, final int hash) {
        return new PessoaHash(pessoa, hash);
    }

    @Override
    public String toString() {
        return "NOME: " + getPessoa().getNome() + ", HASH: " + getHash();
    }
}