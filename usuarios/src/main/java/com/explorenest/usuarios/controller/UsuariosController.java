package com.explorenest.usuarios.controller;

import com.explorenest.usuarios.domain.Usuarios;
import com.explorenest.usuarios.service.UsuariosService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {
    @Autowired
    private UsuariosService service;

    @GetMapping("list")
    public List<Usuarios>getUsuarios(){
        return service.getUsuarios();
    }
    @GetMapping("get")
    public Usuarios getUsuarios(@RequestParam("name")String name){
        return service.getUsuarios(name);
    }
}
