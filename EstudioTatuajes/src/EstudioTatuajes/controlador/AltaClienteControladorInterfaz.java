package EstudioTatuajes.controlador;

public interface AltaClienteControladorInterfaz {

    // M�todo para dar de alta un nuevo cliente con todos sus datos
    public void altaCliente(String dni, String nombre, String edad, String telefono, String correo, double senalDinero, int codigoCliente);
}
