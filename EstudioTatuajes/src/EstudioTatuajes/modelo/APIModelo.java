package EstudioTatuajes.modelo;

import java.util.ArrayList;

public class APIModelo {

    private Estudio estudio = new Estudio();

    private static APIModelo instancia = new APIModelo();

    private APIModelo() {
        estudio = new Estudio();
    }

    public static APIModelo getIntancia() {
        return instancia;
    }

    public void altaCliente(String dni, String nombre, String edad, String telefono, String correo, double senalDinero, int codigoCliente) {
        Cliente cliente1 = new Cliente(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente);
        estudio.altaCliente(cliente1);
    }

    public String[][] consultarClientes() {
        ArrayList<Cliente> clientes = estudio.consultaCliente();
        String[][] clientesArray = new String[clientes.size()][7]; // Cambiar tamaño si es necesario
        for (int i = 0; i < clientes.size(); i++) {
            clientesArray[i][0] = clientes.get(i).getDni();
            clientesArray[i][1] = clientes.get(i).getNombre();
            clientesArray[i][2] = clientes.get(i).getEdad();
            clientesArray[i][3] = clientes.get(i).getTelefono();
            clientesArray[i][4] = clientes.get(i).getCorreo();
            clientesArray[i][5] = String.valueOf(clientes.get(i).getSenalDinero());
            clientesArray[i][6] = String.valueOf(clientes.get(i).getCodigoCliente());
        }
        return clientesArray;
    }

    public void cambiarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
                            int codigoCliente, String nuevaFecha, String nuevaHora) {
      
        ArrayList<Cliente> clientes = estudio.consultaCliente();

        
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                Citas nuevaCita = new Citas(nuevaFecha, nuevaHora);
                cliente.addCita(nuevaCita); 
                System.out.println("Cita cambiada para el cliente con DNI: " + dni);
                break;
            }
        }
    }

    public void cancelarCita(String dni, String nombre, String edad, String telefono, String correo, double senalDinero,
            int codigoCliente) {
        ArrayList<Cliente> clientes = estudio.consultaCliente();

        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                cliente.cancelarCita();
                System.out.println("Cita cancelada para el cliente con DNI: " + dni);
                break;
            }
        }
    }

    public void ponerResena(String dni, String resena) {
        ArrayList<Cliente> clientes = estudio.consultaCliente();

        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                cliente.setResena(resena);
                System.out.println("Reseña agregada para el cliente con DNI: " + dni);
                break;
            }
        }
    }


}
