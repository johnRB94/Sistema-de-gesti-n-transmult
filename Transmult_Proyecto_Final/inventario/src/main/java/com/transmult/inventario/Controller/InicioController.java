package com.transmult.inventario.Controller;

import org.springframework.security.core.Authentication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.transmult.inventario.Service.UsuarioService;

@Controller
public class InicioController {

    private final UsuarioService usuarioService;

    public InicioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/inicio")
    public String mostrarInicio(Model model, Authentication auth) {

        String username = auth.getName();

        var usuario = usuarioService.buscarPorUsuario(username);

        model.addAttribute("usuario", username);
        model.addAttribute("totalUsuarios", usuarioService.contarUsuarios());
        model.addAttribute("ultimoAcceso", usuario.getUltimoAcceso());

        return "inicio";
    }
}

