package com.etl.model;

import java.util.ArrayList;
import java.util.List;

public class PessoaMock {

    private static final List<Pessoa> PESSOAS = new ArrayList<Pessoa>(50);

    static {
        PESSOAS.add(Pessoa.of(1L, "Nome Pessoa 1", "12345678911"));
        PESSOAS.add(Pessoa.of(2L, "Nome Pessoa 2", "12345678911"));
        PESSOAS.add(Pessoa.of(3L, "Nome Pessoa 3", "12345678911"));
        PESSOAS.add(Pessoa.of(4L, "Nome Pessoa 4", "12345678911"));
        PESSOAS.add(Pessoa.of(5L, "Nome Pessoa 5", "12345678911"));
        PESSOAS.add(Pessoa.of(6L, "Nome Pessoa 6", "12345678911"));
        PESSOAS.add(Pessoa.of(7L, "Nome Pessoa 7", "12345678911"));
        PESSOAS.add(Pessoa.of(8L, "Nome Pessoa 8", "12345678911"));
        PESSOAS.add(Pessoa.of(9L, "Nome Pessoa 9", "12345678911"));
        PESSOAS.add(Pessoa.of(10L, "Nome Pessoa 10", "12345678911"));
        PESSOAS.add(Pessoa.of(11L, "Nome Pessoa 11", "12345678911"));
        PESSOAS.add(Pessoa.of(12L, "Nome Pessoa 12", "12345678911"));
        PESSOAS.add(Pessoa.of(13L, "Nome Pessoa 13", "12345678911"));
        PESSOAS.add(Pessoa.of(14L, "Nome Pessoa 14", "12345678911"));
        PESSOAS.add(Pessoa.of(15L, "Nome Pessoa 15", "12345678911"));
        PESSOAS.add(Pessoa.of(16L, "Nome Pessoa 16", "12345678911"));
        PESSOAS.add(Pessoa.of(17L, "Nome Pessoa 17", "12345678911"));
        PESSOAS.add(Pessoa.of(18L, "Nome Pessoa 18", "12345678911"));
        PESSOAS.add(Pessoa.of(19L, "Nome Pessoa 19", "12345678911"));
        PESSOAS.add(Pessoa.of(20L, "Nome Pessoa 20", "12345678911"));
        PESSOAS.add(Pessoa.of(21L, "Nome Pessoa 21", "12345678911"));
        PESSOAS.add(Pessoa.of(22L, "Nome Pessoa 22", "12345678911"));
        PESSOAS.add(Pessoa.of(23L, "Nome Pessoa 23", "12345678911"));
        PESSOAS.add(Pessoa.of(24L, "Nome Pessoa 24", "12345678911"));
        PESSOAS.add(Pessoa.of(25L, "Nome Pessoa 25", "12345678911"));
        PESSOAS.add(Pessoa.of(26L, "Nome Pessoa 26", "12345678911"));
        PESSOAS.add(Pessoa.of(27L, "Nome Pessoa 27", "12345678911"));
        PESSOAS.add(Pessoa.of(28L, "Nome Pessoa 28", "12345678911"));
        PESSOAS.add(Pessoa.of(29L, "Nome Pessoa 29", "12345678911"));
        PESSOAS.add(Pessoa.of(30L, "Nome Pessoa 30", "12345678911"));
        PESSOAS.add(Pessoa.of(31L, "Nome Pessoa 31", "12345678911"));
        PESSOAS.add(Pessoa.of(32L, "Nome Pessoa 32", "12345678911"));
        PESSOAS.add(Pessoa.of(33L, "Nome Pessoa 33", "12345678911"));
        PESSOAS.add(Pessoa.of(34L, "Nome Pessoa 34", "12345678911"));
        PESSOAS.add(Pessoa.of(35L, "Nome Pessoa 35", "12345678911"));
        PESSOAS.add(Pessoa.of(36L, "Nome Pessoa 36", "12345678911"));
        PESSOAS.add(Pessoa.of(37L, "Nome Pessoa 37", "12345678911"));
        PESSOAS.add(Pessoa.of(38L, "Nome Pessoa 38", "12345678911"));
        PESSOAS.add(Pessoa.of(39L, "Nome Pessoa 39", "12345678911"));
        PESSOAS.add(Pessoa.of(40L, "Nome Pessoa 40", "12345678911"));
        PESSOAS.add(Pessoa.of(41L, "Nome Pessoa 41", "12345678911"));
        PESSOAS.add(Pessoa.of(42L, "Nome Pessoa 42", "12345678911"));
        PESSOAS.add(Pessoa.of(43L, "Nome Pessoa 43", "12345678911"));
        PESSOAS.add(Pessoa.of(44L, "Nome Pessoa 44", "12345678911"));
        PESSOAS.add(Pessoa.of(45L, "Nome Pessoa 45", "12345678911"));
        PESSOAS.add(Pessoa.of(46L, "Nome Pessoa 46", "12345678911"));
        PESSOAS.add(Pessoa.of(47L, "Nome Pessoa 47", "12345678911"));
        PESSOAS.add(Pessoa.of(48L, "Nome Pessoa 48", "12345678911"));
        PESSOAS.add(Pessoa.of(49L, "Nome Pessoa 49", "12345678911"));
        PESSOAS.add(Pessoa.of(50L, "Nome Pessoa 50", "12345678911"));
    }

    public static List<Pessoa> getPessoas() {
        return PESSOAS;
    }
}