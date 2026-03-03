package com.transmult.inventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transmult.inventario.Model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
   static List<Producto> findAllByOrderByIdDesc() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAllByOrderByIdDesc'");
}
   
    Optional<Producto> findByCodigo(String codigo);
    
}
