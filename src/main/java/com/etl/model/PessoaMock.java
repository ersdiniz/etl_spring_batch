package com.etl.model;

import java.util.ArrayList;
import java.util.List;

public class PessoaMock {

    public static List<Pessoa> getPessoas(final int quantidade) {
        final List<Pessoa> pessoas = new ArrayList<Pessoa>(quantidade);
        for (int i = 1; i <= quantidade; i++) {
            pessoas.add(Pessoa.of("Pessoa " + i));
        }
        return pessoas;
    }
}