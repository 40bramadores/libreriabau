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
    }

    public void Suscribirse(Suscripcion suscripcion){
        suscripciones.add(suscripcion);
    }

    public void Desuscribirse(Suscripcion suscripcion){
        if(suscripciones.contains(suscripcion)){
            suscripciones.remove(suscripcion);
        }
    }
}
