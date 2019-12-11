package Suscripcion;

import producto.Producto;

import java.util.Calendar;

public class SuscripcionAnual extends Suscripcion implements ICostoSuscripcion{


    public SuscripcionAnual(Producto producto, Integer cantidadSemanal){
        super(producto, cantidadSemanal);
        _calendar = Calendar.getInstance();
        _inicio = _calendar;
        _calendar.add(Calendar.YEAR, 1);
        _fin = _calendar;
    }


    //calculo de costo anual

    public double calcularCosto() {
       double costoDeProducto = _producto.devolverPrecio();
       double costoAnual = 12*_cantidadMensual *_producto.devolverPrecio();
        return costoAnual;
    }
}
