package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class ConsultaControlador implements ConsultaControlardorInterfaz{

	@Override
	public String[][] consultarCliente() {
		APIModelo api= APIModelo.getIntancia();
		return api.consultarClientes();
		
	}
	
}
