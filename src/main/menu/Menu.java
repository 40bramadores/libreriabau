package menu;

import kiosko.Compra;
import kiosko.Kiosko;
import producto.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public Menu(Kiosko kiosko) {
        int lock=1;
        int lock2=1;
        int menu=0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Sistema de kiosko");
        System.out.println("Opciones disponibles");
        System.out.println("1- Crear Clientes");
        System.out.println("2- Borrar Clientes");
        System.out.println("3- Agregar suscripcion");
        System.out.println("4- Quitar suscripcion");
        System.out.println("5- Crear compra");
        System.out.println("6- Listar clientes");
        System.out.println("7- Listar productos");
        System.out.println("8- Crear producto");
        System.out.println("9- Eliminar producto");
        System.out.println("10- Buscar producto");
        System.out.println("11- Calcular gasto mensual");
        System.out.println("12- Calcular gasto anual");

        while (lock != 0) {

            System.out.println("Seleccione una opcion:");

            menu = myObj.nextInt();

            switch(menu) {

                default:
                    System.out.println("Elija una opcion de 1 a 8");
                    lock = 0;
                    break;
                case 1:
                    while(lock2 != 0) {
                        System.out.println("Escriba el nombre del cliente[(S) SALIR]:");
                        String nombre = myObj.next();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada");
                            lock2 = 0;
                        } else {
                            System.out.println("Escriba la direccion del cliente:");
                            String direccion = myObj.next();
                            kiosko.agregarCliente(nombre,direccion);
                            System.out.println("Cliente creado");
                        }
                    }
                    lock2 = 1;
                    break;
                case 2:
                    while(lock2 != 0) {
                        System.out.println("Escriba el nombre del cliente [(S) SALIR]:");
                        String nombre = myObj.next();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada");
                            lock2 = 0;
                        } else {
                            kiosko.removerCliente(nombre);
                            System.out.println("Cliente eliminado");
                        }
                    }
                    lock2 = 1;
                    break;
                case 3:
                    System.out.println("Agregar suscripcion");
                    break;
                case 4:
                    System.out.println("Quitar suscripcion");
                    break;
                case 5:
                    try {
                        System.out.println("Escriba el nombe del cliente:");
                        String nombre = myObj.next();
                        while (lock2 != 0) {
                            ArrayList<Compra> compras = new ArrayList<Compra>();
                            System.out.println("Escriba el nombre del producto [(S) ENVIAR]:");
                            String producto = myObj.next();
                            if (producto.compareTo("S") == 0 || producto.compareTo("s") == 0) {
                                if(compras.size() >= 1) {
                                    kiosko.comprar(nombre, compras);
                                    System.out.println("Compras enviadas");
                                    lock2 = 0;
                                } else {
                                    System.out.println("Operacion cancelada");
                                    lock2 = 0;
                                }
                            } else {
                                System.out.println("Escriba la Cantidad:");
                                String cantidad = myObj.next();
                                int cantidadp = Integer.parseInt(cantidad);
                                Producto productobj = kiosko.buscarProducto(producto);
                                Compra compra = new Compra(productobj, cantidadp);
                                compras.add(compra);
                            }
                        }
                        lock2 = 1;
                    } finally {System.out.println("nose");}
                    break;
                case 6:
                    try {
                        System.out.println("Listando Clientes:");
                        String[] clientes = kiosko.listarClientes();
                        for(int i=0; i < clientes.length; i++){
                            System.out.println(clientes[i]);
                        }
                    } finally {System.out.println("");}
                    break;
                case 7:
                    try {
                        System.out.println("Listando clientes:");
                        String[] productos = kiosko.listarProductos();
                        for(int i=0; i < productos.length; i++){
                            System.out.println(productos[i]);
                        }
                    } finally {System.out.println("");}
                    break;
                case 8:
                    try {
                        System.out.println("Escriba el nombre del producto:");
                        String nombre = myObj.next();
                        System.out.println("Tipos de producto:");
                        System.out.println("1- Libro");
                        System.out.println("2- Articulo de libreria");
                        System.out.println("3- Producto periodico");
                        System.out.println("Escriba el tipo del producto:");
                        String tipo = myObj.next();
                        Integer tipop = Integer.parseInt(tipo);
                        if (tipop == 1 || tipop == 2 || tipop == 3) {
                            System.out.println("Escriba el precio del producto:");
                            String precio = myObj.next();
                            double preciop = Double.parseDouble(precio);
                            System.out.println("Producto agregado");
                            kiosko.agregarProducto(nombre, tipop, preciop);
                        } else {
                            System.out.println("Tipo de producto invalido");
                        }
                    } finally {
                        System.out.println("Nose");
                    }
                    lock2 = 1;
                    break;
                case 9:
                    while(lock2 != 0) {
                        System.out.println("Escriba el nombre del producto [(S) SALIR]:");
                        String nombre = myObj.next();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada");
                            lock2 = 0;
                        } else {
                            System.out.println("Producto eliminado");
                            kiosko.borrarProducto(nombre);
                        }
                    }
                    lock2 = 1;
                    break;
                case 10:
                        System.out.println("Escriba el nombre del producto [(S) SALIR]:");
                        String nombre = myObj.next();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada");
                        } else {
                            System.out.println("Producto:");
                            System.out.println(kiosko.buscarProducto(nombre));
                        }
                    lock2 = 1;
                    break;
                case 11: //gasto mensual
                    try {
                        System.out.println("Escriba el nombre del cliente:");
                        String nombre = myObj.next();
                        System.out.println("Escriba el mes[1-12]:");
                        String fecha = myObj.next();
                        Integer fechap = Integer.parseInt(fecha);
                        if(fechap <= 12 && fechap >= 1) {
                            System.out.println("Lo gastado el mes" + fechap + "es: " + kiosko.calcularGastoAnual(nombre,fechap));
                        } else {
                            System.out.println("Mes invalido");
                        }
                    } finally {System.out.println("");}
                    break;
                case 12: //gasto anual
                    try {
                        System.out.println("Escriba el nombre del cliente:");
                        String nombre = myObj.next();
                        System.out.println("Escriba el año[1960--2019]:");
                        String fecha = myObj.next();
                        Integer fechap = Integer.parseInt(fecha);
                        if(fechap <= 2019 && fechap >= 1960) {
                            System.out.println("Lo gastado el año" + fechap + "es: " + kiosko.calcularGastoAnual(nombre,fechap));
                        } else {
                            System.out.println("Mes invalido");
                        }
                    } finally {System.out.println("");}
                    break;
            }
        }
    }
    /*public static void printCliente(String nombre) {
        System.out.println(nombre);
    }
    public static void printProducto(String producto) {
        System.out.println(producto);
    }*/
}
