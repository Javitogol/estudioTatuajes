package EstudioTatuajes.controlador;

import java.util.ArrayList;

import EstudioTatuajes.modelo.APIModelo;
import EstudioTatuajes.modelo.Cliente;
import EstudioTatuajes.modelo.Estudio;

public class ConsultaControlador implements ConsultaControlardorInterfaz{

	@Override
	public String[][] consultarCliente() {
		APIModelo api= APIModelo.getIntancia();
		return api.consultarClientes();
		
	}
	
}
