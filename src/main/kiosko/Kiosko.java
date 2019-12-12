package kiosko;

import Suscripcion.Suscripcion;
import Suscripcion.SuscripcionAnual;
import Suscripcion.SuscripcionMensual;
import producto.ArticuloDeLibreria;
import producto.Libro;
import producto.Producto;
import producto.ProductosPeriodicos;

import java.util.ArrayList;
import java.util.HashMap;

public class Kiosko {
    HashMap<String,Producto> productos = new HashMap<String,Producto>();
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

    public void agregarProducto(String nombre, Integer tipo, double precio){
        Producto producto;
        switch (tipo){
            case 1:
                producto = new Libro(nombre, "Libro", precio);
                break;

            case 2:
                producto = new ArticuloDeLibreria(nombre, "Articulo de Libreria", precio);
                break;

            case 3:
                producto = new ProductosPeriodicos(nombre, "Productos prediodicos", precio);
                break;

        }

        productos.put(producto.nombre, producto);
        

    }

    public void agregarSuscripcion(SuscripcionAnual suscripcion){

    }

    public void agregarSuscripcion(SuscripcionMensual suscripcion){

    }

    public void quitarSuscripcion(Suscripcion suscripcion){

    }

    public void comprar(String nombre, ArrayList<Compra> _carrito){
    boolean clienteAntiguo;
    Cliente cliente;

    clienteAntiguo = clientes.containsKey(nombre);

    if(clienteAntiguo){
        cliente = clientes.get(nombre)
    } else {cliente = new Cliente(nombre, "")}




    Factura factura= new Factura(_carrito)


    }
}
