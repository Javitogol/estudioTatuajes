package EstudioTatuajes.modelo;

import java.util.ArrayList;

public class APIModelo {
	
	private Estudio estudio = new Estudio();
	
	private static APIModelo instancia = new APIModelo();;

	private APIModelo() {
		estudio = new Estudio ();
	}
	
	public static APIModelo getIntancia() {
		return instancia;
	}
	
	public void altaCliente(String dni, String nombre, String edad /* y demas...*/) {
		Cliente  cliente1= new Cliente (/*Los datos de cliente*/);
		estudio.altaCliente(cliente1);
	}
	
	public String  [] [] consultarClientes () {
		ArrayList<Cliente> clientes = estudio.consultaCliente();
		String [] [] clientesArray = new String [clientes.size()][8];
		for (int i=0; i<clientes.size(); i++) {
			clientesArray[i][0]=clientes.get(i).getDni(); /* Da fallo pork no lo tenemos creado */
			clientesArray[i][1]=clientes.get(i).getNombre(); /* Da fallo pork no lo tenemos creado */
			clientesArray[i][2]=clientes.get(i).getEdad(); /* Da fallo pork no lo tenemos creado */
			/* IGUAL CON LOS DEMAS ATRIBUTOS */
		}
		return clientesArray;
	}
}
