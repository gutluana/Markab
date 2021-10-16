package com.markab.hub.domain.model;

import com.markab.hub.domain.model.Enum.TipoArea;

import lombok.Data;


@Data
public class Area {
    private int id_area;
    private String nome;
    private TipoArea tipo;
    private int id_unidade;


    //construtor
    public Area(){

    }

     /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */
}
