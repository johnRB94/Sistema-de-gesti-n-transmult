package com.transmult.inventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transmult.inventario.Model.Producto;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Optional<Producto> findByCodigo(String codigo);
}