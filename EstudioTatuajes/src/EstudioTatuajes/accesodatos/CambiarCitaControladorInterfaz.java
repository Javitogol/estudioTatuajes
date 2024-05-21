package EstudioTatuajes.accesodatos;

public interface CambiarCitaControladorInterfaz {

	 public void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero, int codigoCliente);

	void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
			int codigoCliente, String nuevaFecha, String nuevaHora);
}
