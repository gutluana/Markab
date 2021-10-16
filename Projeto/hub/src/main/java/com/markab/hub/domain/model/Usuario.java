package com.markab.hub.domain.model;

import java.sql.Date;
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
    private Date data_registro;

    public Usuario(){

    }

    
}
