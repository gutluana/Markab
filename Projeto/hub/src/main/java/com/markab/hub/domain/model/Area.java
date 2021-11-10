package com.markab.hub.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.markab.hub.domain.model.Enum.TipoArea;

import lombok.Data;


@Data
@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_area;
    private String nome;
    private TipoArea tipo;
    private Long id_unidade;


    //construtor
    public Area(){

    }

     /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */
}
