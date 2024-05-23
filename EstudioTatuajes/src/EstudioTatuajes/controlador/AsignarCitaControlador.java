package EstudioTatuajes.controlador;

public class AsignarCitaControlador implements AsignarCitaControladorInterfaz {

    public void asignarCita(String dni, String fecha, String hora) {
        // Aquí implementa la lógica para asignar la cita al cliente con el DNI proporcionado
        // Puedes llamar a los métodos necesarios del modelo para realizar la asignación
        System.out.println("Cita asignada para el cliente con DNI " + dni + " para el " + fecha + " a las " + hora);
    }
}
