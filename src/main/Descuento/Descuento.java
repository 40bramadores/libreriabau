package Descuento;

import Suscripcion.SuscripcionAnual;
import Suscripcion.SuscripcionMensual;
import kiosko.Factura;

public class Descuento {
    private double C_Anual = 0.2;
    private double C_Resto = 0.05;

    private double calculardescuento(double monto, double descuento) {
        return monto - (monto * descuento);
    }

    public double aplicardescuento(SuscripcionAnual suscripcion) {
        return this.calculardescuento(suscripcion.calcularcosto(),this.C_Anual);
    }

    public double aplicardescuento(SuscripcionMensual suscripcion) {
        return this.calculardescuento(suscripcion.calcularcosto(),this.C_Resto);
    }

    public double aplicardescuento(NoSuscripto suscripcion) {
        return this.calculardescuento(suscripcion.calcularcosto(),this.C_Resto);
    }

    public double aplicardescuento(Factura factura) {

        return this.calculardescuento(factura.calcular(),this.C_Resto);
    }

}