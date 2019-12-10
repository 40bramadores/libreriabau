package kiosko;

import java.util.ArrayList;

public class Factura {

    ArrayList<Producto> productos = new ArrayList<Producto>();

    public void MostrarFactura(){

        // Devuelve la lista de producto
        for ( Producto p : productos){
            System.out.println(p.nombre);
            System.out.println(p.precio);
        }
    }
}
