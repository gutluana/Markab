package com.markab.hub.domain.model;

import lombok.Data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.markab.hub.domain.model.Enum.StatusUsuario;

@Data
@Entity 
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nome;
    private StatusUsuario status;
    private String endereco;
    private String numero;
    private int cep;
    private String email;
    private Long telefone;
    private Long celular;
    private Long cpf;
    private Long rg;
    private Long cnpj;
    private int ie;
    private Date data_registro;

    //construtor
    public Usuario(){

    }

  
    
    public void setData_registro(String string) {
    }

    /*
        Estou usando lombok para gerar os encapsulamentos de campos 
        criando os metodos  getters e setters em tempo de execução.
    */

    
}
