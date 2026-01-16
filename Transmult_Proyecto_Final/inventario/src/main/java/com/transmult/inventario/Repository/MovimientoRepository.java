package com.transmult.inventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transmult.inventario.Model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}