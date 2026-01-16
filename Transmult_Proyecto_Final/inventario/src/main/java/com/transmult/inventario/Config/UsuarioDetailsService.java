package com.transmult.inventario.Config;

import com.transmult.inventario.Model.Usuario;
import com.transmult.inventario.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;


@Service("usuarioDetailsService")
public class UsuarioDetailsService implements UserDetailsService {

    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsuario(nombreUsuario)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

                System.out.println("ROL DEL USUARIO: " + usuario.getRol());

        return User.builder()
                .username(usuario.getUsuario())
                .password(usuario.getContraseña()) // No encriptado, usar NoOp en dev
                .roles(usuario.getRol().trim().toUpperCase()) // Asegura que tenga formato correcto
                .build();
    }
    
}