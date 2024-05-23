package EstudioTatuajes.controlador;

public class AsignarCitaControlador implements AsignarCitaControladorInterfaz {

    public void asignarCita(String dni, String fecha, String hora) {
        // Aqu� implementa la l�gica para asignar la cita al cliente con el DNI proporcionado
        // Puedes llamar a los m�todos necesarios del modelo para realizar la asignaci�n
        System.out.println("Cita asignada para el cliente con DNI " + dni + " para el " + fecha + " a las " + hora);
    }
}
