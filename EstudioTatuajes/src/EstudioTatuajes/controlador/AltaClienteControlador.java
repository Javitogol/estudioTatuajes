package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;
import EstudioTatuajes.modelo.Cliente;
import EstudioTatuajes.modelo.Estudio;

public class AltaClienteControlador implements AltaClienteControladorInterfaz{

	public void altaCliente (String dni /*todos sus datos digamos*/) {
		System.out.println("LLamo al controlador del alta cliente");
		
		APIModelo api= APIModelo.getIntancia();
		api.altaCliente(dni, dni, dni);
	}
}
