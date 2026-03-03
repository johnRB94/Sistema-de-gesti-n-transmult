package com.transmult.inventario.Controller;

import java.util.List;

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
    public String listarMovimientos(
            @RequestParam(required = false) String buscar,
            @RequestParam(required = false) String nuevo,
            Model model) {

                List<Movimiento> movimientos;

    if (buscar != null && !buscar.isEmpty()) {
        movimientos = movimientoService.buscarPorDescripcion(buscar);
    } else {
        movimientos = movimientoService.listarTodos();
    }
        model.addAttribute("movimientos", movimientoService.listarTodos());
        model.addAttribute("productos", productoService.listarTodos());
        model.addAttribute("totalMovimientos", movimientoService.contarMovimientos());
        return "movimientos";
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
