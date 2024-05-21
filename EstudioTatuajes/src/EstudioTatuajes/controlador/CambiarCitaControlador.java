package EstudioTatuajes.controlador;

import EstudioTatuajes.accesodatos.CambiarCitaControladorInterfaz;
import EstudioTatuajes.modelo.APIModelo;

public class CambiarCitaControlador implements CambiarCitaControladorInterfaz {

    @Override
    public void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
            int codigoCliente, String nuevaFecha, String nuevaHora) {
        System.out.println("Llamando al controlador de cambiar cita");

        APIModelo api = APIModelo.getIntancia();
        api.cambiarCita(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente, nuevaFecha, nuevaHora);
    }

	@Override
	public void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
			int codigoCliente) {
		 System.out.println("Llamando al controlador de cambiar cita");

	        APIModelo api = APIModelo.getIntancia();
	        String nuevaFecha = null;
			String nuevaHora = null;
			api.cambiarCita(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente, nuevaFecha, nuevaHora);
	}
}
