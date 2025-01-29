package com.jesusmorales.PruebaIBM.Services;

import com.jesusmorales.PruebaIBM.Models.Proveedor;

import java.util.List;

public interface IProveedorService {
    List<Proveedor> getProveedor(Long idCliente);
}

