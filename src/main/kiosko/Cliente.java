package kiosko;

public class Cliente {

    String nombre;
    String direccion;

    CuentaCorriente cuenta;

    ArrayList<Suscripcion> suscripciones = new ArrayList<Suscripcion>();

    public void Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
}