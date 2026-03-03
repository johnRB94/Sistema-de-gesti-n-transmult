package com.transmult.inventario.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.transmult.inventario.Model.Movimiento;
import com.transmult.inventario.Model.Producto;
import com.transmult.inventario.Repository.MovimientoRepository;

@Service
public class MovimientoService {

    private final MovimientoRepository movimientoRepository;
    private final ProductoService productoService;

    public MovimientoService(MovimientoRepository movimientoRepository,
            ProductoService productoService) {
        this.movimientoRepository = movimientoRepository;
        this.productoService = productoService;
    }

    public List<Movimiento> listarTodos() {
        return movimientoRepository.findAll();
    }

    public void guardarConValidacion(Movimiento movimiento) {

        if (movimiento.getEntrada() < 0 || movimiento.getSalida() < 0) {
            throw new IllegalStateException("No se permiten cantidades negativas.");
        }

        if (movimiento.getEntrada() == 0 && movimiento.getSalida() == 0) {
            throw new IllegalStateException("Debe ingresar una cantidad en entrada o salida.");
        }

        Producto producto = productoService
                .obtenerPorCodigo(movimiento.getCodigo())
                .orElseThrow(() -> new IllegalStateException("Producto no encontrado"));

        int stockActual = producto.getInventario();
        int salida = movimiento.getSalida();

        // 🚫 VALIDACIÓN CLAVE
        if (salida > stockActual) {
            throw new IllegalStateException(
                    "La cantidad de salida no puede ser mayor al stock disponible (" + stockActual + ")");
        }

        // Completar datos del producto
        movimiento.setDescripcion(producto.getDescripcion());
        movimiento.setMarca(producto.getMarca());
        movimiento.setUnidad(producto.getUnidad());

        // Guardar movimiento
        movimientoRepository.save(movimiento);

        // Actualizar inventario (ya validado)
        productoService.actualizarInventario(
                movimiento.getCodigo(),
                movimiento.getEntrada(),
                movimiento.getSalida());
    }

    public long contarMovimientos() {
        return movimientoRepository.count();

    }

    public List<Movimiento> buscarPorDescripcion(String descripcion) {
        return movimientoRepository.findByDescripcionContainingIgnoreCase(descripcion);
    }

}

