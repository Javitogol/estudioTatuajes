package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class CancelarCitaControlador {

    public void cancelarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero, int codigoCliente) {
        APIModelo.getIntancia().cancelarCita(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente);
    }
}
