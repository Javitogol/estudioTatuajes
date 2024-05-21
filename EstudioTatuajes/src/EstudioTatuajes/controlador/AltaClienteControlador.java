package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class AltaClienteControlador implements AltaClienteControladorInterfaz {

    public void altaCliente(String dni, String nombre, String edad, String telefono, String correo, double senalDinero, int codigoCliente) {
        System.out.println("Llamando al controlador del alta cliente");
        
        APIModelo api = APIModelo.getIntancia();
        api.altaCliente(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente);
    }
}
