package com.transmult.inventario.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transmult.inventario.Model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {

    List<Movimiento> findByDescripcionContainingIgnoreCase(String descripcion);
}
