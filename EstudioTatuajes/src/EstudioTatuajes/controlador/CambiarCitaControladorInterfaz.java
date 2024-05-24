package EstudioTatuajes.controlador;

public interface CambiarCitaControladorInterfaz {
    void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
                     int codigoCliente, String nuevaFecha, String nuevaHora);

    void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
                     int codigoCliente);
}
