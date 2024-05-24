package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class AsignarCitaControlador implements AsignarCitaControladorInterfaz {

    @Override
    public void asignarCita(String dni, String fecha, String hora) {
        APIModelo api = APIModelo.getIntancia();
        api.asignarCita(dni, fecha, hora);
        System.out.println("Cita asignada para el cliente con DNI " + dni + " para el " + fecha + " a las " + hora);
    }
}
