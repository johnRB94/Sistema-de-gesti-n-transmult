package com.transmult.inventario.Service;

import org.springframework.stereotype.Service;

import com.transmult.inventario.Model.Usuario;
import com.transmult.inventario.Repository.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Optional<Usuario> validarCredenciales(String usuario, String contraseña) {
        return usuarioRepository.findByUsuarioAndContraseña(usuario, contraseña);
    }
}