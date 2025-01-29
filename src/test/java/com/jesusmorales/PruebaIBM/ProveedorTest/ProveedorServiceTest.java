package com.jesusmorales.PruebaIBM.ProveedorTest;

import com.jesusmorales.PruebaIBM.Models.Proveedor;
import com.jesusmorales.PruebaIBM.Repository.ProveedorRepository;
import com.jesusmorales.PruebaIBM.Services.ProveedorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProveedorServiceTest {


    @Mock
    private ProveedorRepository proveedorRepository;

    @InjectMocks
    private ProveedorServiceImpl proveedorService;

    /*
     * Test para verificar que el método findByIdCliente funciona correctamente cuando existen resultados.
     * Este test simula un proveedor y luego verifica que la consulta con el mismo idCliente
     * devuelve el proveedor correcto.
     * */
    @Test
    void testFindByIdCliente() {
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre("Test Proveedor");
        proveedor.setFechaDeAlta(LocalDate.now());
        proveedor.setIdCliente(10L);

        Mockito.when(proveedorRepository.findByIdCliente(10L)).thenReturn(Arrays.asList(proveedor));

        List<Proveedor> result = proveedorService.getProveedor(10L); // Asumimos que el método está en un servicio

        Assertions.assertEquals(1, result.size(), "Debe devolver un proveedor");
        Assertions.assertEquals("Test Proveedor", result.get(0).getNombre(), "El nombre del proveedor debe ser el correcto");
    }

    /*
     * Test para verificar que el método findByIdCliente retorna una lista vacía cuando no existen proveedores
     * con el idCliente especificado.
     * */
    @Test
    void testFindByIdClienteNoResults() {
        Mockito.when(proveedorRepository.findByIdCliente(99L)).thenReturn(Collections.emptyList());

        List<Proveedor> result = proveedorService.getProveedor(99L);

        Assertions.assertTrue(result.isEmpty(), "La lista debe estar vacía si no existen proveedores");
    }

}
