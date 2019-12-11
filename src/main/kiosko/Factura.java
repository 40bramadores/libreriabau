package kiosko;

import producto.Producto;

import java.util.ArrayList;

public class Factura {

    ArrayList<Producto> productos = new ArrayList<Producto>();

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
