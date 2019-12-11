package kiosko;

import producto.Producto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Factura {

    private Date mes;
    private ArrayList<Compra> productos = new ArrayList<Compra>();
    private double montoTotal;

    public Factura(){
        this.mes = new Date();
        this.montoTotal = 0;


    }
    public void MostrarFactura(){
        // Devuelve la lista de producto
        for ( Compra p : productos){
            System.out.println(p.getProducto());
            System.out.println(p.devolverPrecio());
        }
    }

    public double getMontoTotal() {
        return montoTotal;
    }


    public void calcularTotal(boolean descuento) {
        for (Compra p : productos){
            this.montoTotal += p.devolverPrecio();
        }

        if (descuento){

        }

    }


}
