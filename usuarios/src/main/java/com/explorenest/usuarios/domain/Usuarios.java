package com.explorenest.usuarios.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuarios {
    @Id
    private Integer id;
    private String name;
    private String password;
    private Integer rol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
}
