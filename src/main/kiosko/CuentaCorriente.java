package kiosko;

import java.time.LocalDate;
import java.util.ArrayList;

public class CuentaCorriente {

    ArrayList<Factura> facturas = new ArrayList<Factura>();

    public void agregarFactura(Factura factura){
        facturas.add(factura);
    }

    public Double calcularGastoMensual(LocalDate mes){

        Double monto_mensual = 0.0;
        for(Factura factura : facturas){

            if( mes.getMonth() == factura.getFecha().getMonth()
            &&  mes.getYear() == factura.getFecha().getYear()){
                monto_mensual += factura.getMontoTotal();
            }
        }
        return monto_mensual;
    }

    public Double calcularGastoAnual(LocalDate anual){
        Double monto_anual = 0.0;
        for(Factura factura : facturas){

            if( anual.getYear() == factura.getFecha().getYear()){
                monto_anual += factura.getMontoTotal();
            }
        }
        return monto_anual;
    }
}
