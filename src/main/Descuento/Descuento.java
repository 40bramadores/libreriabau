package Descuento;

import Suscripcion.SuscripcionAnual;
import kiosko.Factura;

public class Descuento {
    private double C_Anual = 0.2;
    private double C_Resto = 0.05;

    private double calculardescuento(double monto, double descuento) {
        return monto - (monto * descuento);
    }

    public double aplicardescuento(SuscripcionAnual suscripcion) {
        return this.calculardescuento(suscripcion.calcularCosto(),this.C_Anual);
    }

    public double aplicardescuento(Factura miFactura) {
        return this.calculardescuento(miFactura.getMontoTotal(),this.C_Resto);
    }

}