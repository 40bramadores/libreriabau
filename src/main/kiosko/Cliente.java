package kiosko;

import Suscripcion.Suscripcion;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {

    String nombre;
    String direccion;

    CuentaCorriente cuenta;

    HashMap<String, Suscripcion> suscripciones = new HashMap<String, Suscripcion>();

    public Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = new CuentaCorriente();
    }

    public void suscribirse(Suscripcion suscripcion){
        String nombreProducto= suscripcion.getProducto().getNombre();
        suscripciones.put(nombreProducto,suscripcion);
    }

    public void desuscribirse(String nombreProducto){
        if(suscripciones.containsKey(nombreProducto)){
            suscripciones.remove(nombreProducto);
        } else{
            System.out.println("No existe la suscripcion");
            return;
        }
    }

    public void comprar(Factura factura){
        cuenta.agregarFactura(factura);
    }
}
