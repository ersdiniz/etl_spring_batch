package com.etl.batch;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.batch.item.ItemProcessor;

import com.etl.model.Pessoa;
import com.etl.model.PessoaHash;

public class BatchProcessor implements ItemProcessor<Pessoa, PessoaHash> {

    @Override
    public PessoaHash process(final Pessoa item) throws Exception {
        return PessoaHash.of(item, new HashCodeBuilder().append(item.getNome()).build());
    }
}