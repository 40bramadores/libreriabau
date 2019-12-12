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
        System.out.println("Sistema de kiosko \n");
        System.out.println("Opciones disponibles \n\n");
        System.out.println("1- Crear Clientes \n");
        System.out.println("2- Borrar Clientes \n");
        System.out.println("3- Agregar suscripcion \n");
        System.out.println("4- Quitar suscripcion \n");
        System.out.println("5- Crear compra \n");
        System.out.println("6- Listar clientes \n");
        System.out.println("7- Listar productos \n");
        System.out.println("8- Crear producto \n");
        System.out.println("9- Eliminar producto \n");

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
                        System.out.println("Crear clientes (S) salir (En nombre)\n");
                        System.out.println("Escriba el nombre del cliente: \n");
                        String nombre = myObj.nextLine();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada \n");
                            lock2 = 0;
                        } else {
                            System.out.println("Escriba la direccion del cliente: \n");
                            String direccion = myObj.nextLine();
                            kiosko.agregarCliente(nombre,direccion);
                            System.out.println("Cliente creado \n");
                        }
                    }
                    lock2 = 1;
                    break;
                case 2:
                    while(lock2 != 0) {
                        System.out.println("Remover clientes (S) salir (En nombre)\n");
                        System.out.println("Escriba el nombre del cliente: \n");
                        String nombre = myObj.nextLine();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada \n");
                            lock2 = 0;
                        } else {
                            kiosko.removerCliente(nombre);
                            System.out.println("Cliente eliminado \n");
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
                        System.out.println("Escriba el nombe del cliente: \n");
                        String nombre = myObj.nextLine();
                        while (lock2 != 0) {
                            ArrayList<Compra> compras = new ArrayList<Compra>();
                            System.out.println("Crear compra (S) enviar (En producto)\n");
                            System.out.println("Escriba el nombre del producto: \n");
                            String producto = myObj.nextLine();
                            if (producto.compareTo("S") == 0 || producto.compareTo("s") == 0) {
                                kiosko.comprar(nombre, compras);
                                System.out.println("Compras enviadas \n");
                                lock2 = 0;
                            } else {
                                System.out.println("Escriba la Cantidad: \n");
                                int cantidad = myObj.nextInt();
                                Producto productobj = kiosko.buscarProducto(producto);
                                Compra compra = new Compra(productobj, cantidad);
                                compras.add(compra);
                            }
                        }
                        lock2 = 1;
                    } finally {System.out.println("nose");}
                    break;
                case 6:
                    System.out.println("Listndo clientes: \n");
                    //kiosko.listarClientes(this);
                    break;
                case 7:
                    System.out.println("Listando productos: \n");
                    //kiosko.listarProductos(this);
                    break;
                case 8:
                    while(lock2 != 0) {
                        System.out.println("Agregar Productos (S) salir (En nombre)\n");
                        System.out.println("Escriba el nombre del producto: \n");
                        String nombre = myObj.nextLine();
                        System.out.println("Tipos de producto: \n");
                        System.out.println("1- Libro \n");
                        System.out.println("2- Articulo de libreria\n");
                        System.out.println("3- Producto periodico\n");
                        System.out.println("Escriba el tipo del producto: \n");
                        Integer tipo = myObj.nextInt();
                        System.out.println("Escriba el precio del producto: \n");
                        double precio = myObj.nextDouble();
                        if(tipo == 1 || tipo == 2 || tipo == 3) {
                            if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                                System.out.println("Operacion cancelada \n");
                                lock2 = 0;
                            } else {
                                System.out.println("Producto agregado \n");
                                kiosko.agregarProducto(nombre,tipo,precio);
                            }
                        } else {
                            System.out.println("Operacion cancelada tipo de producto invalido\n");
                            lock2 = 0;
                        }
                    }
                    lock2 = 1;
                    break;
                case 9:
                    while(lock2 != 0) {
                        System.out.println("Remover Productos (S) salir (En nombre)\n");
                        System.out.println("Escriba el nombre del producto: \n");
                        String nombre = myObj.nextLine();
                        if( nombre.compareTo("S") == 0 || nombre.compareTo("s") == 0 ) {
                            System.out.println("Operacion cancelada \n");
                            lock2 = 0;
                        } else {
                            System.out.println("Producto borrado \n");
                            kiosko.borrarProducto(nombre);
                        }
                    }
                    lock2 = 1;
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
