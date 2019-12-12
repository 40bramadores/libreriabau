package producto;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticuloDeLibreriaTest {

    @Test
    public void CalculoPrecioConIvaTest (){
        Iva MiIva = new Iva (21.0);
        ArticuloDeLibreria producto = new ArticuloDeLibreria("Lapiz", "X", 100.0, MiIva);

        double montoEsperado = 121.0;

        assertEquals(montoEsperado, producto.devolverPrecio());
    }

}