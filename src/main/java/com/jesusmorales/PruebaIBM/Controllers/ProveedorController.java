package com.jesusmorales.PruebaIBM.Controllers;

import com.jesusmorales.PruebaIBM.Models.Proveedor;
import com.jesusmorales.PruebaIBM.Services.IProveedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
@RequiredArgsConstructor
public class ProveedorController {

    private final IProveedorService proveedorService;

    @GetMapping("/{idCliente}")
    public ResponseEntity<List<Proveedor>> obtenerProveedores(@PathVariable Long idCliente) {
        List<Proveedor> proveedores = proveedorService.getProveedor(idCliente);
        return ResponseEntity.ok(proveedores);
    }
}
