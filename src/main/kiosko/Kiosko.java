package kiosko;

import Suscripcion.Suscripcion;
import Suscripcion.SuscripcionAnual;
import Suscripcion.SuscripcionMensual;
import producto.ArticuloDeLibreria;
import producto.Libro;
import producto.Producto;
import producto.ProductosPeriodicos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Kiosko {

    HashMap<String,Producto> productos = new HashMap<String,Producto>();
    HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();
    private ArrayList<Compra> _carrito = new ArrayList<Compra>();

    public void agregarCliente(String nombre, String direccion){
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
                productos.put(producto.getNombre(), producto);
                break;

            case 2:
                producto = new ArticuloDeLibreria(nombre, "Articulo de Libreria", precio);
                productos.put(producto.getNombre(), producto);
                break;

            case 3:
                producto = new ProductosPeriodicos(nombre, "Productos periodicos", precio);
                productos.put(producto.getNombre(), producto);
                break;

            default:
                return;

        }


    }

    public Producto buscarProducto(String nombreDeProducto){ return productos.get(nombreDeProducto); }

    public String[] listarProductos(){
        Set<String> nombreProductos = productos.keySet();
        String[] arr = nombreProductos.toArray(new String[nombreProductos.size()]);
        return arr;
    }

    public String[] listarClientes(){
        Set<String> nombreClientes = clientes.keySet();
        String[] arr = nombreClientes.toArray(new String[nombreClientes.size()]);
        return arr;
    }

    public void borrarProducto(String nombreDeProducto){
       productos.remove(nombreDeProducto);
    }

    public Cliente getCliente(String nombre){
        return clientes.get(nombre);
    }

    public void agregarSuscripcion(String nombreCliente, String nombreProducto, Integer tipoSuscripcion){
        Cliente cliente = getCliente(nombreCliente);
        Producto producto = buscarProducto(nombreProducto);

        if(producto.getTipo() != "Productos periodicos") {
           return;
        }

        agregarSuscripcion(producto);

    }

    public void agregarSuscripcion(SuscripcionAnual suscripcion){

    }

    public void agregarSuscripcion(SuscripcionMensual suscripcion){

    }

    public void quitarSuscripcion(Suscripcion suscripcion){

    }

    public void comprar(String nombre, ArrayList<Compra> carrito){
        boolean clienteAntiguo;
        Cliente cliente;

        clienteAntiguo = clientes.containsKey(nombre);

        if(clienteAntiguo){
            cliente = clientes.get(nombre);
        } else {cliente = new Cliente(nombre, "");}


        Factura factura= new Factura(carrito, clienteAntiguo);
        factura.calcularTotal();

        cliente.comprar(factura);

    }
}
