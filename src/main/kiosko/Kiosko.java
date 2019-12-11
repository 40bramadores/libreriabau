package kiosko;

import Suscripcion.Suscripcion;
import Suscripcion.SuscripcionAnual;
import Suscripcion.SuscripcionMensual;

import java.util.ArrayList;

public class Kiosko {

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void AgregarCliente(String nombre, String direccion){
        Cliente nuevo_cliente = new Cliente(nombre,direccion);
        clientes.add(nuevo_cliente);
    }

    public void RemoverCliente(String nombre){
        for (Cliente c: clientes) {
            if(c.nombre == nombre){
                clientes.remove(c);
            }
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
