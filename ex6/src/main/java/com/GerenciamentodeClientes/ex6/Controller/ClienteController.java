package com.GerenciamentodeClientes.ex6.Controller;

import com.GerenciamentodeClientes.ex6.Model.ClienteModel;
import com.GerenciamentodeClientes.ex6.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Cliente")
public class ClienteController {
    Autowired
    private ClienteService service;

    @PostMapping
    public ClienteModel criar(@RequestBody ClienteModel clienteModel){
        return service.criar(clienteModel);
    }

    @GetMapping
    public List<ClienteModel>listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<ClienteModel>buscaPorId(@PathVariable Long id){
        return service.buscaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void dedeletar(@PathVariable Long id){
        service.deletar(id);
    }
}
