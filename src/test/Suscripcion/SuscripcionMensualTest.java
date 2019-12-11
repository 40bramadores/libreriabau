package Suscripcion;

import org.junit.jupiter.api.Test;
import producto.*;

import static org.junit.jupiter.api.Assertions.*;

class SuscripcionMensualTest {

   @Test
   public void calcularCosto(){
        Producto producto = new ProductosPeriodicos("caras", "periodico", 100);
        Suscripcion suscripcion = new SuscripcionMensual(producto, 3);
        Integer _cantidadMensual = 3;
        double valorEsperado = producto.devolverPrecio()*_cantidadMensual;

        double valorCalculado = suscripcion.calcularCosto();

        assertEquals(valorEsperado, valorCalculado);

    }
}