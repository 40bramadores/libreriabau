import kiosko.Kiosko;

import java.util.Scanner;

public class Main {
    Kiosko kiosko = new Kiosko();
    public static void main(String[] args) {
        int lock=1;
        int menu=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Sistema de kiosko \n");
        System.out.println("Opciones disponibles \n\n");
        System.out.println("1- Crear Cliente \n");
        System.out.println("2- Borrar Cliente \n");
        System.out.println("3- Agregar suscripcion \n");
        System.out.println("4- Quitar suscripcion \n");
        System.out.println("5- Crear compra \n");
        System.out.println("6- Listar clientes \n");
        System.out.println("7- Listar productos \n");

        while (lock != 0) {
            System.out.println("Seleccione una opcion:");
            menu = myObj.nextInt();
            switch(menu) {
                default:
                    lock = 0;
                    break;
                case 1:
                    System.out.println("Opcion 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opcion 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opcion 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opcion 4 seleccionada");
                    break;
                case 5:
                    System.out.println("Opcion 5 seleccionada");
                    break;
                case 6:
                    System.out.println("Opcion 6 seleccionada");
                    break;
                case 7:
                    System.out.println("Opcion 7 seleccionada");
                    break;
            }
        }
    }
}
