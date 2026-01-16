package com.transmult.inventario.Service;

import org.springframework.stereotype.Service;

import com.transmult.inventario.Model.Producto;
import com.transmult.inventario.Repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    public Optional<Producto> obtenerPorCodigo(String codigo) {
        return productoRepository.findByCodigo(codigo);
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }

    public void actualizarInventario(String codigo, int entrada, int salida) {
        Optional<Producto> productoOpt = productoRepository.findByCodigo(codigo);
        if (productoOpt.isPresent()) {
            Producto producto = productoOpt.get();
            int nuevoStock = producto.getInventario() + entrada - salida;
            producto.setInventario(Math.max(nuevoStock, 0));
            productoRepository.save(producto);
        }
    }
}