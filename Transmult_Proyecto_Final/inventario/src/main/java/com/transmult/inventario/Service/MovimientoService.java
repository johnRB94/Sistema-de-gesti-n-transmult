package com.transmult.inventario.Service;

import org.springframework.stereotype.Service;

import com.transmult.inventario.Model.Movimiento;
import com.transmult.inventario.Repository.MovimientoRepository;

import java.util.List;

@Service
public class MovimientoService {

    private final MovimientoRepository movimientoRepository;

    public MovimientoService(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public List<Movimiento> listarTodos() {
        return movimientoRepository.findAll();
    }

    public Movimiento guardar(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }
}