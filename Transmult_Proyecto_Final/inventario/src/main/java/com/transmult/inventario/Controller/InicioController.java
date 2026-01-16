package com.transmult.inventario.Controller;

import org.springframework.security.core.Authentication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/inicio")
    public String mostrarInicio(Model model, Authentication auth) {

        String usuario = auth.getName();

        model.addAttribute("usuario", usuario);

        return "inicio";
    }
}
