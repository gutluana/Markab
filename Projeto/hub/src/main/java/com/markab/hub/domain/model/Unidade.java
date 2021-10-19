package com.markab.hub.domain.model;

import com.markab.hub.domain.model.Enum.StatusPadrao;
import com.markab.hub.domain.model.Enum.TipoUnidade;

import lombok.Data;

@Data
public class Unidade {
    private int id_unidade;
    private String nome;
    private StatusPadrao status;
    private String endereco;
    private String numero;
    private String cep;
    private String data_ativacao;
    private String data_finalizacao;
    private int id_usuario;
    private TipoUnidade tipo_unidade;

    //construtor
    public Unidade(){

    }

    /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */

}
