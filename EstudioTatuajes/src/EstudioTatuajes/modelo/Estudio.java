package EstudioTatuajes.modelo;

import java.util.ArrayList;

public class Estudio {
	
	private ArrayList<Cliente> clientes = new ArrayList <Cliente>();
	
	public void altaCliente (Cliente cliente) {
		clientes.add(cliente);
	}
	
	public ArrayList <Cliente> consultaCliente () {
		return clientes;
	}
}
