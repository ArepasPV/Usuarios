package com.explorenest.usuarios.repository;

import com.explorenest.usuarios.domain.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
Usuarios findOneByName(String name);
}
