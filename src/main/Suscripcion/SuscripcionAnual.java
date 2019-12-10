package Suscripcion;

import java.util.Calendar;

public class SuscripcionAnual extends Suscripcion implements ICostoSuscripcion{

    SuscripcionAnual instance = new SuscripcionAnual();

    public SuscripcionAnual(Producto producto, Integer cantidadSemanal){
        super(producto, cantidadSemanal);
        _calendar = Calendar.getInstance();
        _inicio = _calendar;
        _calendar.add(Calendar.YEAR, 1);
        _fin = _inicio;
    }

    public double calcularCosto() {
       double costoDeProducto = _producto.devolverPrecio();
       double costoAnual = 48*_cantidadSemanal*costoDeProducto;
        return costoAnual;
    }
}
