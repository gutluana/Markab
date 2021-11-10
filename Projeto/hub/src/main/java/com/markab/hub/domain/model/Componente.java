package com.markab.hub.domain.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.markab.hub.domain.model.Enum.StatusPadrao;
import com.markab.hub.domain.model.Enum.TipoComponente;


import lombok.Data;


@Data
@Entity
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_componente;
    private String nome;
    private StatusPadrao status; 
    private TipoComponente tipo_componente;
    private Long id_area;

    //construtor
    public Componente(){

    }

     /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */

}
