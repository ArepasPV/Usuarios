package com.explorenest.usuarios.service;

import com.explorenest.usuarios.domain.Usuarios;
import com.explorenest.usuarios.repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsuariosService {
    private UsuariosRepository repository;
    public List<Usuarios> getUsuarios(){
        return repository.findAll();
    }

    public Usuarios getUsuarios(String name){
        return repository.findOneByName(name);
    }
}
