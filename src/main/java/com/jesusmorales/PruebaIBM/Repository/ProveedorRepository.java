package com.jesusmorales.PruebaIBM.Repository;

import com.jesusmorales.PruebaIBM.Models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    List<Proveedor> findByIdCliente(Long idCliente);
}

