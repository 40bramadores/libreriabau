package kiosko;

import Suscripcion.Suscripcion;
import Suscripcion.SuscripcionAnual;
import Suscripcion.SuscripcionMensual;

import java.util.ArrayList;
import java.util.HashMap;

public class Kiosko {

    HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();

    public void AgregarCliente(String nombre, String direccion){
        Cliente nuevo_cliente = new Cliente(nombre,direccion);
        clientes.put(nuevo_cliente.nombre,nuevo_cliente);
    }

    public void RemoverCliente(String nombre){
        if(clientes.containsKey(nombre)){
            clientes.remove(nombre);
        }
    }

    public void CalcularGastoMensual(){

    }

    public void CalcularGastoAnual(){

    }

    public void AgregarSuscricion(SuscripcionAnual suscripcion){

    }

    public void AgregarSuscricion(SuscripcionMensual suscripcion){

    }

    public void QuitarSuscripcion(Suscripcion suscripcion){

    }
}
