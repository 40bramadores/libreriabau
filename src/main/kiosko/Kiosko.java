package kiosko;

import Suscripcion.Suscripcion;
import Suscripcion.SuscripcionAnual;
import Suscripcion.SuscripcionMensual;
import producto.Producto;

import java.util.ArrayList;
import java.util.HashMap;

public class Kiosko {

    HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();
    private ArrayList<Compra> _carrito = new ArrayList<Compra>();

    public void aregarCliente(String nombre, String direccion){
        Cliente nuevo_cliente = new Cliente(nombre,direccion);
        clientes.put(nuevo_cliente.nombre,nuevo_cliente);
    }

    public void removerCliente(String nombre){
        if(clientes.containsKey(nombre)){
            clientes.remove(nombre);
        }
    }

    public void calcularGastoMensual(){

    }

    public void calcularGastoAnual(){

    }

    public void agregarSuscripcion(SuscripcionAnual suscripcion){

    }

    public void agregarSuscripcion(SuscripcionMensual suscripcion){

    }

    public void quitarSuscripcion(Suscripcion suscripcion){

    }

    public void comprar(Cliente cliente, ArrayList<Compra> _carrito){
    boolean clienteAntiguo;

    /*if(clienteAntiguo){
        AgregarCliente(cliente.nombre, );
    }
    */
    clienteAntiguo = clientes.containsKey(cliente.nombre);

    Factura factura= new Factura(_carrito)


    }
}
