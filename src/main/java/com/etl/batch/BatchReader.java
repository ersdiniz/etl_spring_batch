package com.etl.batch;

import java.util.List;

import org.springframework.batch.item.ItemReader;

import com.etl.model.Pessoa;
import com.etl.model.PessoaMock;

public class BatchReader implements ItemReader<Pessoa> {

    private int execucoes = 0;

    @Override
    public Pessoa read() throws Exception {
        final List<Pessoa> pessoas = PessoaMock.getPessoas();
        if (execucoes < pessoas.size()) {
            return pessoas.get(execucoes++);
        }
        execucoes = 0;
        return null;
    }
}