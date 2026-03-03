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

        // 👇 ACTUALIZAR FECHA DE ÚLTIMO ACCESO
        usuario.setUltimoAcceso(java.time.LocalDateTime.now());
        usuarioRepository.save(usuario);

        return User.builder()
                .username(usuario.getUsuario())
                .password(usuario.getContraseña())
                .roles(usuario.getRol().trim().toUpperCase())
                .build();
    }

}
