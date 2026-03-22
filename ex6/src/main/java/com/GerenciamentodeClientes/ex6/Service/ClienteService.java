package com.GerenciamentodeClientes.ex6.Service;

import com.GerenciamentodeClientes.ex6.Model.ClienteModel;
import com.GerenciamentodeClientes.ex6.Repository.ClienteRepositorio;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepositorio repositorio;


    public ClienteModel criar(ClienteModel clienteModel){
        return  repositorio.save(clienteModel);
    }


    public List<ClienteModel> listar(){
        return repositorio.findAll();
    }

    public Optional<ClienteModel>buscaPorId(Long id){
        return repositorio.findById(id);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
