package kiosko;

import producto.Producto;

public class Compra {

    private Producto _producto;
    private Integer _cantidad;

    public Compra(Producto _producto, Integer _cantidad) {
        this._producto = _producto;
        this._cantidad = _cantidad;
    }

    public Producto getProducto() {
        return _producto;
    }

    public Integer getCantidad() {
        return _cantidad;
    }

    public double devolverPrecio(){
        return _producto.devolverPrecio()*_cantidad;
    }
}
