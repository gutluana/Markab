package com.markab.hub.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.markab.hub.domain.model.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public void carregaLista(){
        Usuario cesar = new Usuario();
        cesar.setId_usuario(1);
        cesar.setNome("Cesar Augusto");
        cesar.setNumero("10");
        cesar.setEndereco("Rua: bla bla, n 20");

        Usuario luana = new Usuario();
        luana.setId_usuario(2);
        luana.setNome("Luana Gut");
        luana.setNumero("20");
        luana.setEndereco("Rua: bla bla, n 20");
        
        listaUsuarios.add(cesar);
        listaUsuarios.add(luana);
    };

    @GetMapping("/all")
    public List<Usuario> getAll(){
        carregaLista();
        return listaUsuarios;
    };

    @GetMapping("/{id}")
    public Usuario findOne(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaUsuarios.size(); i++){
            int idUsuario = listaUsuarios.get(i).getId_usuario();
            if(idUsuario == id){
                return listaUsuarios.get(i);
            }
        }
        return null;
    };

    
}
