package com.markab.hub.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.markab.hub.domain.model.Usuario;
import com.markab.hub.domain.model.Enum.StatusUsuario;
import com.markab.hub.domain.service.CadastroUsuarioService;

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
@RequestMapping("/usuario")
public class UsuarioController {

    List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    boolean isCarregado = false;

    @Autowired
    CadastroUsuarioService servico;

    public void carregaLista(){
        if(isCarregado == false ){
            Usuario cesar = new Usuario();
            cesar.setId_usuario(1);
            cesar.setNome("Cesar Augusto");
            cesar.setStatus(StatusUsuario.ATIVO);
            cesar.setEndereco("Rua: bla bla, n 20");
            cesar.setNumero("10");
            cesar.setCep("13198930");
            cesar.setEmail("cesar.a@gmail.com");
            cesar.setTelefone("19-20202020");
            cesar.setCelular("19-9887720239");
            cesar.setRg("47382987489");
            cesar.setCpf("3209203920-2");
            cesar.setCnpj("200449300-0000/00");
            cesar.setIe("33344422");
            cesar.setData_registro("15-01-1990");
            

            Usuario luana = new Usuario();
            luana.setId_usuario(2);
            luana.setNome("Luana Gut");
            luana.setStatus(StatusUsuario.ATIVO);
            luana.setNumero("20");
            luana.setEndereco("Rua: bla bla, n 20");
            luana.setCep("13198930");
            luana.setEmail("luana.g@gmail.com");
            luana.setTelefone("19-20202020");
            luana.setCelular("19-9887720239");
            luana.setRg("47382987489");
            luana.setCpf("3209203920-2");
            luana.setCnpj("200449300-0000/00");
            luana.setIe("33344422");
            luana.setData_registro("15-01-1990");

            Usuario maria = new Usuario();
            maria.setId_usuario(3);
            maria.setNome("Maria Borges");
            maria.setStatus(StatusUsuario.INATIVO);
            maria.setNumero("20");
            maria.setEndereco("Rua: bla bla, n 20");
            maria.setCep("13198930");
            maria.setEmail("maria.g@gmail.com");
            maria.setTelefone("19-20202020");
            maria.setCelular("19-9887720239");
            maria.setRg("47382987489");
            maria.setCpf("3209203920-2");
            maria.setCnpj("200449300-0000/00");
            maria.setIe("33344422");
            maria.setData_registro("15-01-1990");

            Usuario jose = new Usuario();
            jose.setId_usuario(4);
            jose.setNome("Jose Ramiro");
            jose.setStatus(StatusUsuario.INATIVO);
            jose.setNumero("20");
            jose.setEndereco("Rua: bla bla, n 20");
            jose.setCep("13198930");
            jose.setEmail("jose.g@gmail.com");
            jose.setTelefone("19-20202020");
            jose.setCelular("19-9887720239");
            jose.setRg("47382987489");
            jose.setCpf("3209203920-2");
            jose.setCnpj("200449300-0000/00");
            jose.setIe("33344422");
            jose.setData_registro("15-01-1990");

            Usuario laura = new Usuario();
            laura.setId_usuario(5);
            laura.setNome("Laura Gut");
            laura.setStatus(StatusUsuario.ATIVO);
            laura.setNumero("20");
            laura.setEndereco("Rua: bla bla, n 20");
            laura.setCep("13198930");
            laura.setEmail("laura.g@gmail.com");
            laura.setTelefone("19-20202020");
            laura.setCelular("19-9887720239");
            laura.setRg("47382987489");
            laura.setCpf("3209203920-2");
            laura.setCnpj("200449300-0000/00");
            laura.setIe("33344422");
            laura.setData_registro("15-01-1990");

            Usuario gloria = new Usuario();
            gloria.setId_usuario(6);
            gloria.setNome("Gloria Gut");
            gloria.setStatus(StatusUsuario.ATIVO);
            gloria.setNumero("20");
            gloria.setEndereco("Rua: bla bla, n 20");
            gloria.setCep("13198930");
            gloria.setEmail("gloria.g@gmail.com");
            gloria.setTelefone("19-20202020");
            gloria.setCelular("19-9887720239");
            gloria.setRg("47382987489");
            gloria.setCpf("3209203920-2");
            gloria.setCnpj("200449300-0000/00");
            gloria.setIe("33344422");
            gloria.setData_registro("15-01-1990");

            Usuario ramires = new Usuario();
            ramires.setId_usuario(7);
            ramires.setNome("Ramires Gut");
            ramires.setStatus(StatusUsuario.ATIVO);
            ramires.setNumero("20");
            ramires.setEndereco("Rua: bla bla, n 20");
            ramires.setCep("13198930");
            ramires.setEmail("ramires.g@gmail.com");
            ramires.setTelefone("19-20202020");
            ramires.setCelular("19-9887720239");
            ramires.setRg("47382987489");
            ramires.setCpf("3209203920-2");
            ramires.setCnpj("200449300-0000/00");
            ramires.setIe("33344422");
            ramires.setData_registro("15-01-1990");

            Usuario lucia = new Usuario();
            lucia.setId_usuario(8);
            lucia.setNome("Lucia");
            lucia.setStatus(StatusUsuario.ATIVO);
            lucia.setNumero("20");
            lucia.setEndereco("Rua: bla bla, n 20");
            lucia.setCep("13198930");
            lucia.setEmail("lucia.g@gmail.com");
            lucia.setTelefone("19-20202020");
            lucia.setCelular("19-9887720239");
            lucia.setRg("47382987489");
            lucia.setCpf("3209203920-2");
            lucia.setCnpj("200449300-0000/00");
            lucia.setIe("33344422");
            lucia.setData_registro("15-01-1990");

            Usuario raciff = new Usuario();
            raciff.setId_usuario(9);
            raciff.setNome("Raciff");
            raciff.setStatus(StatusUsuario.ATIVO);
            raciff.setNumero("20");
            raciff.setEndereco("Rua: bla bla, n 20");
            raciff.setCep("13198930");
            raciff.setEmail("raciff.g@gmail.com");
            raciff.setTelefone("19-20202020");
            raciff.setCelular("19-9887720239");
            raciff.setRg("47382987489");
            raciff.setCpf("3209203920-2");
            raciff.setCnpj("200449300-0000/00");
            raciff.setIe("33344422");
            raciff.setData_registro("15-01-1990");

            Usuario raffaela = new Usuario();
            raffaela.setId_usuario(10);
            raffaela.setNome("Raffaela");
            raffaela.setStatus(StatusUsuario.ATIVO);
            raffaela.setNumero("20");
            raffaela.setEndereco("Rua: bla bla, n 20");
            raffaela.setCep("13198930");
            raffaela.setEmail("raffaela.g@gmail.com");
            raffaela.setTelefone("19-20202020");
            raffaela.setCelular("19-9887720239");
            raffaela.setRg("47382987489");
            raffaela.setCpf("3209203920-2");
            raffaela.setCnpj("200449300-0000/00");
            raffaela.setIe("33344422");
            raffaela.setData_registro("15-01-1990");

            Usuario allan = new Usuario();
            allan.setId_usuario(11);
            allan.setNome("Allan Bida");
            allan.setStatus(StatusUsuario.ATIVO);
            allan.setNumero("20");
            allan.setEndereco("Rua: bla bla, n 20");
            allan.setCep("13198930");
            allan.setEmail("allan.g@gmail.com");
            allan.setTelefone("19-20202020");
            allan.setCelular("19-9887720239");
            allan.setRg("47382987489");
            allan.setCpf("3209203920-2");
            allan.setCnpj("200449300-0000/00");
            allan.setIe("33344422");
            allan.setData_registro("15-01-1990");


            listaUsuarios.add(cesar);
            listaUsuarios.add(luana);
            listaUsuarios.add(maria);
            listaUsuarios.add(jose);
            listaUsuarios.add(laura);
            listaUsuarios.add(gloria);
            listaUsuarios.add(ramires);
            listaUsuarios.add(lucia);
            listaUsuarios.add(raciff);
            listaUsuarios.add(raffaela);
            listaUsuarios.add(allan);

            isCarregado = true;
        }
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

    @PostMapping
    public ResponseEntity<?> adicionar(@RequestBody Usuario usuario){
        listaUsuarios.add(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(servico.adicionar(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable int id){
        carregaLista();

        for(int i = 0; i<listaUsuarios.size(); i++){
            int idUsuario = listaUsuarios.get(i).getId_usuario();
            if(idUsuario == id){
                listaUsuarios.remove(i);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario " + listaUsuarios.get(i).getNome() + " deletado com sucesso!");
            }
        }
        return null;
    };

    
}
