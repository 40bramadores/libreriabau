package producto;

public abstract class Producto {

    protected String nombre;
    protected String tipo;
    protected Double precio;

    public Producto(String nombre, String tipo, Double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public double devolverPrecio(){
        return this.precio;

    }
}
