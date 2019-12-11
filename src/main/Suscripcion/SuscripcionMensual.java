package Suscripcion;

import producto.Producto;

import java.util.Calendar;

public class SuscripcionMensual extends Suscripcion implements ICostoSuscripcion {

    public SuscripcionMensual(Producto producto, Integer cantidadMensual) {
        super(producto, cantidadMensual);
        _calendar = Calendar.getInstance();
        _inicio = _calendar;
        _calendar.add(Calendar.MONTH, 1);
        _fin = _calendar;
    }

    //calculo de costo mensual

    public double calcularCosto() {
        double costoDeProducto = _producto.devolverPrecio();
        double costoMensual = _cantidadMensual * _producto.devolverPrecio();
        return costoMensual;

    }


}
