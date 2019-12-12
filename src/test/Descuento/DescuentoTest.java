package Descuento;


import Suscripcion.*;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import producto.ProductosPeriodicos;

import static org.junit.jupiter.api.Assertions.*;

class DescuentoTest {

    @Test
    void aplicardescuento() {
        String nombre = ("100 años de soledad");
        String tipo = ("Libro");
        int precio = 800;
        int cantidad = 1;
        ProductosPeriodicos producto = new ProductosPeriodicos(nombre,tipo,precio);
        SuscripcionAnual suscripcion = new SuscripcionAnual(producto, cantidad);

        Descuento descuento = new Descuento();

        double descuentoaplicado = descuento.aplicardescuento(suscripcion);
        double descuentoesperado = precio*cantidad*0.20;

        assertEquals(descuentoaplicado,descuentoesperado);
    }
}