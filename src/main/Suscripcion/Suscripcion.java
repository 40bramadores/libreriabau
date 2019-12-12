package Suscripcion;

import producto.Producto;

import java.util.Calendar;

public abstract class Suscripcion {

    protected Calendar _calendar;
    protected Calendar _inicio;
    protected Calendar _fin;
    protected Producto _producto;
    protected Integer _cantidadMensual;

    public Suscripcion(Producto producto, Integer cantidadMensual){
        this._producto = producto;
        this._cantidadMensual = cantidadMensual;
    }


    public abstract double calcularCosto();

    //Getters


    public Producto getProducto() {
        return _producto;
    }

    public Calendar getInicio() {
        return _inicio;
    }

    public Calendar getFin() {
        return _fin;
    }

    public Integer getCantidadSemanal() {
        return _cantidadMensual;
    }


}
