package com.transmult.inventario.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.transmult.inventario.Model.Movimiento;
import com.transmult.inventario.Service.MovimientoService;
import com.transmult.inventario.Service.ProductoService;

@Controller
@RequestMapping("/movimientos")
public class MovimientoController {

    private final MovimientoService movimientoService;
    private final ProductoService productoService;

    public MovimientoController(MovimientoService movimientoService, ProductoService productoService) {
        this.movimientoService = movimientoService;
        this.productoService = productoService;
    }

    @GetMapping
    public String listarMovimientos(Model model) {
        model.addAttribute("movimientos", movimientoService.listarTodos());
        model.addAttribute("productos", productoService.listarTodos());
        return "movimientos"; // Thymeleaf: movimientos.html
    }

    @PostMapping("/guardar")
    public String guardarMovimiento(@ModelAttribute Movimiento movimiento, Model model) {

        try {
            movimientoService.guardarConValidacion(movimiento);
            return "redirect:/movimientos?exito";

        } catch (IllegalStateException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("movimientos", movimientoService.listarTodos());
            model.addAttribute("productos", productoService.listarTodos());
            return "movimientos";
        }
    }

}
