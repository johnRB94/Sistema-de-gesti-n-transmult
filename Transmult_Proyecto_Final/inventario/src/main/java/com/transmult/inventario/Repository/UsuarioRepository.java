package com.transmult.inventario.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.transmult.inventario.Model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsuarioAndContraseña(String usuario, String contraseña);
    Optional<Usuario> findByUsuario(String usuario);
}