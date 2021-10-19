package com.markab.hub.domain.service;

import com.markab.hub.domain.model.Unidade;

import org.springframework.stereotype.Service;

@Service
public class CadastroUnidadeService {
    public Unidade adicionar(Unidade novaUnidade){
        return novaUnidade;
    }
}
