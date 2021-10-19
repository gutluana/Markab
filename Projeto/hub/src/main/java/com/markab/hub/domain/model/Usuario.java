package com.markab.hub.domain.model;

import lombok.Data;
import com.markab.hub.domain.model.Enum.StatusUsuario;

@Data 
public class Usuario {
    private int id_usuario;
    private String nome;
    private StatusUsuario status;
    private String endereco;
    private String numero;
    private String cep;
    private String email;
    private String telefone;
    private String celular;
    private String cpf;
    private String rg;
    private String cnpj;
    private String ie;
    private String data_registro;

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
