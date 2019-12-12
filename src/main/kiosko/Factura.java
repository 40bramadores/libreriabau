package kiosko;

import Descuento.Descuento;

import java.time.LocalDate;
import java.util.ArrayList;


public class Factura {

    private LocalDate fecha;
    private ArrayList<Compra> compras = new ArrayList<Compra>();
    private double montoTotal;
    private boolean clienteAntiguo;


    public Factura(ArrayList<Compra> compras, boolean clienteAntiguo ){
        this.compras = compras;
        this.clienteAntiguo = clienteAntiguo;
        this.montoTotal = 0;
        this.fecha = LocalDate.now();
    }

    public void MostrarFactura(){
        // Devuelve la lista de producto
        for (Compra p : compras){
            System.out.println(p.getProducto());
            System.out.println(p.devolverPrecio());
        }
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void calcularTotal() {
        for (Compra p : compras){
            this.montoTotal += p.devolverPrecio();
        }

        if (this.clienteAntiguo){
            Descuento MiDescuento = new Descuento();
            this.montoTotal = MiDescuento.aplicardescuento(this);
        }
    }

    public void agregarCompra (Compra MiCompra){
        this.compras.add(MiCompra);
    }

    public Factura cerrarFactura (){
        return this;
    }

}
