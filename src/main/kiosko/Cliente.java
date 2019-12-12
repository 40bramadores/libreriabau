package kiosko;

import Suscripcion.Suscripcion;

import java.util.ArrayList;

public class Cliente {

    String nombre;
    String direccion;

    CuentaCorriente cuenta;

    ArrayList<Suscripcion> suscripciones = new ArrayList<Suscripcion>();

    public Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = new CuentaCorriente();
    }

    public void suscribirse(Suscripcion suscripcion){
        suscripciones.add(suscripcion);
    }

    public void desuscribirse(Suscripcion suscripcion){
        if(suscripciones.contains(suscripcion)){
            suscripciones.remove(suscripcion);
        }
    }

    public void comprar(Factura factura){
        cuenta.agregarFactura(factura);
    }
}
