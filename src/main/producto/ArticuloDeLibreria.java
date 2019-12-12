package producto;

public class ArticuloDeLibreria extends Producto {


    public ArticuloDeLibreria(String nombre, String tipo, Double precio) {
        super(nombre, tipo, precio);
    }

    public double devolverPrecio(){
        double totalConIva = precio + precio * (Iva.porcentaje / 100);
        return totalConIva;

    }
}
