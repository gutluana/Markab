package com.markab.hub.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.markab.hub.domain.model.Area;
import com.markab.hub.domain.model.Enum.TipoArea;
import com.markab.hub.domain.service.CadastroAreaService;


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
@RequestMapping("/area")
public class AreaController {

    List<Area> listaAreas = new ArrayList<Area>();
    boolean isCarregado = false;

    @Autowired
    CadastroAreaService servico;

    public void carregaLista(){
        if(isCarregado == false ){

            Area quarto = new Area();
            quarto.setId_area(1);
            quarto.setNome("Quarto");
            quarto.setTipo(TipoArea.QUARTO);
            quarto.setId_unidade(1);
           
            Area banheiro = new Area();
            banheiro.setId_area(2);
            banheiro.setNome("Banheiro");
            banheiro.setTipo(TipoArea.BANHEIRO);
            banheiro.setId_unidade(1);

            Area sala = new Area();
            sala.setId_area(3);
            sala.setNome("Sala");
            sala.setTipo(TipoArea.SALA);
            sala.setId_unidade(1);

            Area cozinha = new Area();
            cozinha.setId_area(4);
            cozinha.setNome("Cozinha");
            cozinha.setTipo(TipoArea.COZINHA);
            cozinha.setId_unidade(1);

            Area quarto1 = new Area();
            quarto1.setId_area(5);
            quarto1.setNome("Quarto 2");
            quarto1.setTipo(TipoArea.QUARTO);
            quarto1.setId_unidade(1);
           
            

            listaAreas.add(quarto);
            listaAreas.add(banheiro);
            listaAreas.add(sala);
            listaAreas.add(cozinha);

            isCarregado = true;
        }
    };

    @GetMapping("/all")
    public List<Area> getAll(){
        carregaLista();
        return listaAreas;
    };
    
    @GetMapping("/{id}")
    public Area findOne(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaAreas.size(); i++){
            int idArea = listaAreas.get(i).getId_area();
            if(idArea == id){
                return listaAreas.get(i);
            }
        }
        return null;
    };
       
        @PostMapping
        public ResponseEntity<?> adicionar(@RequestBody Area area){
            listaAreas.add(area);
            return ResponseEntity.status(HttpStatus.CREATED).body(servico.adicionar(area));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> remover(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaAreas.size(); i++){
            int idArea = listaAreas.get(i).getId_area();
            if(idArea == id){
                listaAreas.remove(i);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Area " + listaAreas.get(i).getNome() + " deletada com sucesso!");
            }
        }

        return null;
    };
}
