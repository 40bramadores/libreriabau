package Suscripcion;

import java.util.Calendar;
import java.util.Date;

public abstract class Suscripcion {

    protected Calendar _calendar;
    protected Calendar _inicio;
    protected Calendar _fin;
    protected Producto _producto;
    protected Integer _cantidadSemanal;

    public Suscripcion(Producto producto, Integer cantidadSemanal){
        this._producto = producto;
        this._cantidadSemanal= cantidadSemanal;
    }


    public abstract double calcularCosto();



}
