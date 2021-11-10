package com.markab.hub.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.markab.hub.domain.model.Enum.StatusPadrao;
import com.markab.hub.domain.model.Enum.TipoUnidade;

import lombok.Data;

@Data
@Entity
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_unidade;
    private String nome;
    private StatusPadrao status;
    private String endereco;
    private String numero;
    private String cep;
    private String data_ativacao;
    private String data_finalizacao;
    private Long id_usuario;
    private TipoUnidade tipo_unidade;

    //construtor
    public Unidade(){

    }

    /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */

}
