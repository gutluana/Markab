package com.markab.hub.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.markab.hub.domain.model.Componente;
import com.markab.hub.domain.model.Enum.StatusPadrao;
import com.markab.hub.domain.model.Enum.TipoComponente;
import com.markab.hub.domain.service.CadastroComponenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/componente")
public class ComponenteController {
    List<Componente> listaComponentes = new ArrayList<Componente>();
    boolean isCarregado = false;

    @Autowired
    CadastroComponenteService service;

    public void carregaLista(){
        if(isCarregado == false){
            
            Componente ventilador = new Componente();
            ventilador.setId_componente(1L);
            ventilador.setNome("Ventilador");
            ventilador.setStatus(StatusPadrao.ATIVO);
            ventilador.setTipo_componente(TipoComponente.VENTILADOR);
            ventilador.setId_area(1L);

            Componente fogao = new Componente();
            fogao.setId_componente(2L);
            fogao.setNome("Fogão");
            fogao.setStatus(StatusPadrao.ATIVO);
            fogao.setTipo_componente(TipoComponente.FOGAO);
            fogao.setId_area(1L);

            Componente tv = new Componente();
            tv.setId_componente(3L);
            tv.setNome("TV");
            tv.setStatus(StatusPadrao.ATIVO);
            tv.setTipo_componente(TipoComponente.TV);
            tv.setId_area(1L);

            listaComponentes.add(ventilador);
            listaComponentes.add(fogao);
            listaComponentes.add(tv);

            isCarregado = true;
        }
    };

    @GetMapping("/all")
    public List<Componente> getAll(){
        carregaLista();
        return listaComponentes;
    };

    @GetMapping("/{id}")
    public Componente findOne(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaComponentes.size(); i++){
            Long id_componente = listaComponentes.get(i).getId_componente();
            if(id_componente == id){
                return listaComponentes.get(i);
            }
        }
            return null;
    };
        

        @PostMapping
        public ResponseEntity<?> adicionar(@RequestBody Componente componente){
            listaComponentes.add(componente);
            return ResponseEntity.status(HttpStatus.CREATED).body(service.adicionar(componente));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> remover(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaComponentes.size(); i++){
            Long id_componente = listaComponentes.get(i).getId_componente();
            if(id_componente == id){
                listaComponentes.remove(i);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Componente " + listaComponentes.get(i).getNome() + " deletado com sucesso!");
            }

        }

        return null;
    };



}
