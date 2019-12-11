package kiosko;

import java.util.ArrayList;

public class CuentaCorriente {

    ArrayList<Factura> facturas = new ArrayList<Factura>();

    public void agregarFactura(Factura factura){
        facturas.add(factura);
    }

    public Double calcularGastoMensual(){
        //getMontoTotal();
    }

    public Double calcularGastoAnual(){

    }
}
