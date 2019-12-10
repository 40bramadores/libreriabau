package Suscripcion;

import java.util.Calendar;

public class SuscripcionMensual extends Suscripcion implements ICostoSuscripcion {

    public SuscripcionMensual(Producto producto, Integer cantidadSemanal) {
    super(producto, cantidadSemanal);
    _calendar = Calendar.getInstance();
    _inicio = _calendar;
    _calendar.add(Calendar.MONTH, 1);
    _fin = _inicio;
    }

    public double calcularCosto() {
        double costoDeProducto = _producto.devolverPrecio();
        double costoMensual = 4*_cantidadSemanal*costoDeProducto;
        return costoMensual;

    }
}
