package com.GerenciamentodeClientes.ex6.Repository;

import com.GerenciamentodeClientes.ex6.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<ClienteModel, Long> {
}
