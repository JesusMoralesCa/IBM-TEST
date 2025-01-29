package com.jesusmorales.PruebaIBM.Services;

import com.jesusmorales.PruebaIBM.Models.Proveedor;
import com.jesusmorales.PruebaIBM.Repository.ProveedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProveedorServiceImpl implements IProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> getProveedor(Long idCliente) {
        return proveedorRepository.findByIdCliente(idCliente);
    }

}