package kiosko;

import producto.Producto;

import java.util.ArrayList;
import java.util.Calendar;

public class Factura {

    Calendar mes;
    ArrayList<Producto> productos = new ArrayList<Producto>();

    public Factura(){

    }

    public void MostrarFactura(){

        // Devuelve la lista de producto
        for ( Producto p : productos){
            System.out.println(p.getNombre());
            System.out.println(p.devolverPrecio());
        }
    }

    public double calcular(){
        return 0;
    }
}
