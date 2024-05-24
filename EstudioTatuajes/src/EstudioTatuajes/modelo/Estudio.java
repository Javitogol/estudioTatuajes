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

    public Tatuador buscarTatuadorPorCodigo(int codigoTatuador) {
        for (Tatuador tatuador : tatuadores) {
            if (tatuador.getCodigoTatuador() == codigoTatuador) {
                return tatuador;
            }
        }
        return null;
    }

    public void marcarEstadoTatuador(int codigoTatuador, String nuevoEstado) {
        Tatuador tatuador = buscarTatuadorPorCodigo(codigoTatuador);
        if (tatuador != null) {
            tatuador.setEstado(nuevoEstado);
            System.out.println("Estado del tatuador actualizado correctamente.");
        } else {
            System.out.println("Tatuador no encontrado.");
        }
    }

    public ArrayList<Tatuador> getTatuadores() {
        return tatuadores;
    }

    
    public void eliminarTatuador(int codigoTatuador) {
        for (int i = 0; i < tatuadores.size(); i++) {
            Tatuador tatuador = tatuadores.get(i);
            if (tatuador.getCodigoTatuador() == codigoTatuador) {
                tatuadores.remove(i);
                System.out.println("Tatuador eliminado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró ningún tatuador con el código proporcionado.");
    }

}