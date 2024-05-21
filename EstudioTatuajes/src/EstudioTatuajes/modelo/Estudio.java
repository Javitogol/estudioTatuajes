package EstudioTatuajes.modelo;

import java.util.ArrayList;

public class Estudio {
	
    private ArrayList<Cliente> clientes;
    private ArrayList<Tatuador> tatuadores;
    private ArrayList<Citas> citas;

    public Estudio() {
        this.clientes = new ArrayList<>();
        this.tatuadores = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void altaCliente(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("Cliente añadido: " + cliente.toString());
    }

    public ArrayList<Cliente> consultaCliente() {
        return clientes;
    }

    public void AnadirTatuador(Tatuador tatuador) {
        this.tatuadores.add(tatuador);
        System.out.println("Tatuador añadido: " + tatuador.toString());
    }

    public void AnadirCita(Citas cita) {
        this.citas.add(cita);
        System.out.println("Cita añadida: " + cita.toString());
    }
}