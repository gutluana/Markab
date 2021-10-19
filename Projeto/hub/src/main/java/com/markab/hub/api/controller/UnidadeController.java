package com.markab.hub.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.markab.hub.domain.model.Unidade;
import com.markab.hub.domain.model.Enum.StatusPadrao;
import com.markab.hub.domain.model.Enum.TipoUnidade;
import com.markab.hub.domain.service.CadastroUnidadeService;

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
@RequestMapping("/unidade")
public class UnidadeController {
    List<Unidade> listaUnidades = new ArrayList<Unidade>();
    boolean isCarregado = false;

    @Autowired
    CadastroUnidadeService servico;

    public void carregaLista(){
        if(isCarregado == false ){

            Unidade casa = new Unidade();
            casa.setId_unidade(1);
            casa.setNome("Casa do Cesar");
            casa.setStatus(StatusPadrao.ATIVO);
            casa.setEndereco("Rua: bla bla, n 20");
            casa.setNumero("10");
            casa.setCep("13198930");
            casa.setData_ativacao("20-02-2020");
            casa.setData_finalizacao("-");
            casa.setId_usuario(1);
            casa.setTipo_unidade(TipoUnidade.CASA);
            
            Unidade empresa = new Unidade();
            empresa.setId_unidade(1);
            empresa.setNome("Empresa do Cesar");
            empresa.setStatus(StatusPadrao.ATIVO);
            empresa.setEndereco("Rua: bla bla, n 20");
            empresa.setNumero("10");
            empresa.setCep("13198930");
            empresa.setData_ativacao("20-02-2020");
            empresa.setData_finalizacao("-");
            empresa.setId_usuario(1);
            empresa.setTipo_unidade(TipoUnidade.EMPRESA);

            listaUnidades.add(casa);
            listaUnidades.add(empresa);
        
            isCarregado = true;
        }
    };

    @GetMapping("/all")
    public List<Unidade> getAll(){
        carregaLista();
        return listaUnidades;
    };

    @GetMapping("/{id}")
    public Unidade findOne(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaUnidades.size(); i++){
            int id_unidade = listaUnidades.get(i).getId_unidade();
            if(id_unidade == id){
                return listaUnidades.get(i);
            }
        }
        return null;
    };

    @PostMapping
    public ResponseEntity<?> adicionar(@RequestBody Unidade unidade){
        listaUnidades.add(unidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(servico.adicionar(unidade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaUnidades.size(); i++){
            int idUnidade = listaUnidades.get(i).getId_unidade();
            if(idUnidade == id){
                listaUnidades.remove(i);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade " + listaUnidades.get(i).getNome() + " deletada com sucesso!");
            }
        }
        return null;
    }; 
}
