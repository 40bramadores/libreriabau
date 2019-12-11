package kiosko;

import java.util.ArrayList;
import java.util.HashMap;

public class Kiosko {

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void AgregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void RemoverCliente(String nombre){
        for (Cliente c: cliente) {
            if(c.nombre == nombre){
                clientes.remove(c);
            }
        }
    }


}
