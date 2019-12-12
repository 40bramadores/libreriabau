package producto;

public class ArticuloDeLibreria extends Producto {

    private Iva iva;

    public ArticuloDeLibreria(String nombre, String tipo, Double precio) {
        super(nombre, tipo, precio);
        this.iva = iva;

    }

    public double devolverPrecio(){
        double totalConIva = precio + precio * (iva.getPorcentaje() / 100);
        return totalConIva;

    }
}
