package com.transmult.inventario.Config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import com.transmult.inventario.Model.Usuario;
import com.transmult.inventario.Repository.UsuarioRepository;

@Component
public class DataLoader {

    private final UsuarioRepository usuarioRepository;

    public DataLoader(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostConstruct
    public void cargarUsuarios() {
        if (usuarioRepository.count() == 0) {
            usuarioRepository.save(new Usuario(null, "admin", "admin123", "ADMIN"));
            usuarioRepository.save(new Usuario(null, "supervisor", "super123", "SUPERVISOR"));
            usuarioRepository.save(new Usuario(null, "almacenero", "almacen123", "ALMACENERO"));

        }
    }
}