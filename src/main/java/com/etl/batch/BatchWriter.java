package com.etl.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.etl.model.PessoaHash;

public class BatchWriter implements ItemWriter<PessoaHash> {

    @Override
    public void write(final List<? extends PessoaHash> items) throws Exception {
        items.forEach(System.out::println);
    }
}