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
           var cesar = new Usuario();
            cesar.setId_usuario(1L);
            cesar.setNome("Cesar Augusto");
            cesar.setStatus(StatusUsuario.ATIVO);
            cesar.setEndereco("Rua: bla bla, n 20");
            cesar.setNumero("10");
            cesar.setCep(13198930);
            cesar.setEmail("cesar.a@gmail.com");
            cesar.setTelefone(1920202020L);
            cesar.setCelular(199887720239L);
            cesar.setRg(47382987489L);
            cesar.setCpf(32092039202L);
            cesar.setCnpj(200449300000000L);
            cesar.setIe(33344422);
            cesar.setData_registro("1990-01-15");
            

             Usuario luana = new Usuario();
             luana.setId_usuario(2L);
             luana.setNome("Luana Gut");
             luana.setStatus(StatusUsuario.ATIVO);
             luana.setNumero("20");
             luana.setEndereco("Rua: bla bla, n 20");
             luana.setCep(13198930);
             luana.setEmail("luana.g@gmail.com");
             luana.setTelefone(19-20202020L);
             luana.setCelular(19-9887720239L);
             luana.setRg(47382987489L);
             luana.setCpf(320920392020202020L);
             luana.setCnpj(200449300000000L);
             luana.setIe(33344422);
             luana.setData_registro("2021-01-15");

                Usuario maria = new Usuario();
                maria.setId_usuario(3L);
                maria.setNome("Maria Borges");
                maria.setStatus(StatusUsuario.INATIVO);
                maria.setNumero("20");
                maria.setEndereco("Rua: bla bla, n 20");
                maria.setCep(13198930);
                maria.setEmail("maria.g@gmail.com");
                maria.setTelefone(1920202020L);
                maria.setCelular(199887720239L);
                maria.setRg(47382987489L);
                maria.setCpf(32092039202L);
                maria.setCnpj(44004493000000004L);
                maria.setIe(33344422);
                maria.setData_registro("2021-01-15");

                Usuario jose = new Usuario();
                jose.setId_usuario(4L);
                jose.setNome("Jose Ramiro");
                jose.setStatus(StatusUsuario.INATIVO);
                jose.setNumero("20");
                jose.setEndereco("Rua: bla bla, n 20");
                jose.setCep(13198930);
                jose.setEmail("jose.g@gmail.com");
                jose.setTelefone(1920202020L);
                jose.setCelular(19-9887720239L);
                jose.setRg(47382987489L);
                jose.setCpf(32092039202L);
                jose.setCnpj(2004493000000000L);
                jose.setIe(33344422);
                jose.setData_registro("2021-01-15");

             Usuario laura = new Usuario();
            laura.setId_usuario(5L);
            laura.setNome("Laura Gut");
            laura.setStatus(StatusUsuario.ATIVO);
            laura.setNumero("20");
            laura.setEndereco("Rua: bla bla, n 20");
            laura.setCep(13198930);
            laura.setEmail("laura.g@gmail.com");
            laura.setTelefone(1970202020L);
            laura.setCelular(199887720239L);
            laura.setRg(47382987489L);
            laura.setCpf(32092039202L);
            laura.setCnpj(200449300000000L);
            laura.setIe(33344422);
            laura.setData_registro("2021-01-15");

            Usuario gloria = new Usuario();
            gloria.setId_usuario(6L);
            gloria.setNome("Gloria Gut");
            gloria.setStatus(StatusUsuario.ATIVO);
            gloria.setNumero("20");
            gloria.setEndereco("Rua: bla bla, n 20");
            gloria.setCep(13198930);
            gloria.setEmail("gloria.g@gmail.com");
            gloria.setTelefone(1920202020L);
            gloria.setCelular(199887720239L);
            gloria.setRg(47382987489L);
            gloria.setCpf(32092039202L);
            gloria.setCnpj(200449300-000000L);
            gloria.setIe(33344422);
            gloria.setData_registro("2021-01-15");

            Usuario ramires = new Usuario();
            ramires.setId_usuario(7L);
            ramires.setNome("Ramires Gut");
            ramires.setStatus(StatusUsuario.ATIVO);
            ramires.setNumero("20");
            ramires.setEndereco("Rua: bla bla, n 20");
            ramires.setCep(13198930);
            ramires.setEmail("ramires.g@gmail.com");
            ramires.setTelefone(1920202020L);
            ramires.setCelular(199887720239L);
            ramires.setRg(47382987489L);
            ramires.setCpf(32092039202L);
            ramires.setCnpj(200449300000000L);
            ramires.setIe(33344422);
            ramires.setData_registro("2021-01-15");

            Usuario lucia = new Usuario();
            lucia.setId_usuario(8L);
            lucia.setNome("Lucia");
            lucia.setStatus(StatusUsuario.ATIVO);
            lucia.setNumero("20");
            lucia.setEndereco("Rua: bla bla, n 20");
            lucia.setCep(13198930);
            lucia.setEmail("lucia.g@gmail.com");
            lucia.setTelefone(1920202020L);
            lucia.setCelular(199887720239L);
            lucia.setRg(47382987489L);
            lucia.setCpf(32092039202L);
            lucia.setCnpj(200449300000000L);
            lucia.setIe(33344422);
            lucia.setData_registro("2021-01-15");

            Usuario raciff = new Usuario();
            raciff.setId_usuario(9L);
            raciff.setNome("Raciff");
            raciff.setStatus(StatusUsuario.ATIVO);
            raciff.setNumero("20");
            raciff.setEndereco("Rua: bla bla, n 20");
            raciff.setCep(13198930);
            raciff.setEmail("raciff.g@gmail.com");
            raciff.setTelefone(1920202020L);
            raciff.setCelular(199887720239L);
            raciff.setRg(47382987489L);
            raciff.setCpf(32092039202L);
            raciff.setCnpj(200449300000000L);
            raciff.setIe(33344422);
            raciff.setData_registro("2021-01-15");

            Usuario raffaela = new Usuario();
            raffaela.setId_usuario(10L);
            raffaela.setNome("Raffaela");
            raffaela.setStatus(StatusUsuario.ATIVO);
            raffaela.setNumero("20");
            raffaela.setEndereco("Rua: bla bla, n 20");
            raffaela.setCep(13198930);
            raffaela.setEmail("raffaela.g@gmail.com");
            raffaela.setTelefone(1920202020L);
            raffaela.setCelular(199887720239L);
            raffaela.setRg(47382987489L);
            raffaela.setCpf(32092039202L);
            raffaela.setCnpj(200449300000000L);
            raffaela.setIe(93334442);
            raffaela.setData_registro("2021-01-15");

       


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
            Long idUsuario = listaUsuarios.get(i).getId_usuario();
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
            Long idUsuario = listaUsuarios.get(i).getId_usuario();
            if(idUsuario == id){
                listaUsuarios.remove(i);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario " + listaUsuarios.get(i).getNome() + " deletado com sucesso!");
            }
        }
        return null;
    };

    
}
