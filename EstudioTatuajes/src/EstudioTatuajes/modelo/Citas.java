package EstudioTatuajes.modelo;


public class Citas {
	
	private int idCita;
    private String fecha;
    private Tatuador tatuador;
    private Cliente cliente;

    public Citas(int idCita, String fecha, Tatuador tatuador, Cliente cliente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.tatuador = tatuador;
        this.cliente = cliente;
    }

    public Citas(String nuevaFecha, String nuevaHora) {
		// TODO Auto-generated constructor stub
	}

	public void ConfirmarCita() {
        // Implementaci�n espec�fica
        System.out.println("Cita confirmada: " + toString());
    }

    public void CancelarCita() {
        // Implementaci�n espec�fica
        System.out.println("Cita cancelada: " + toString());
    }

    public void ReprogramarCita(String nuevaFecha) {
        this.fecha = nuevaFecha;
        System.out.println("Cita reprogramada para: " + nuevaFecha);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tatuador getTatuador() {
        return tatuador;
    }

    public void CalcularDuracion() {
        // Implementaci�n espec�fica
        System.out.println("Calculando duraci�n de la cita...");
    }

	@Override
	public String toString() {
		return "Citas [idCita=" + idCita + ", fecha=" + fecha + ", tatuador=" + tatuador + ", cliente=" + cliente + "]";
	}

}