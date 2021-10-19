package com.markab.hub.domain.model;

import com.markab.hub.domain.model.Enum.StatusPadrao;
import com.markab.hub.domain.model.Enum.TipoComponente;


import lombok.Data;


@Data
public class Componente {
    private int id_componente;
    private String nome;
    private StatusPadrao status; 
    private TipoComponente tipo_componente;
    private int id_area;

    //construtor
    public Componente(){

    }

     /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */

}
