package EstudioTatuajes.modelo;

import java.util.ArrayList;

public class Cliente {

    private String dni;
    private String nombre;
    private String edad;
    private String telefono;
    private String correo;
    private double senalDinero;
    private int codigoCliente;
    private ArrayList<Citas> citas;
	private String resena;

    public Cliente(String dni, String nombre, String edad, String telefono, String correo, double senalDinero, int codigoCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.senalDinero = 50;
        this.codigoCliente = codigoCliente;
        this.citas = new ArrayList<>();
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public double getSenalDinero() {
        return senalDinero;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public ArrayList<Citas> getCitas() {
        return citas;
    }

    // Setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSenalDinero(double senalDinero) {
        this.senalDinero = senalDinero;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    // Métodos para manejar citas
    public void addCita(Citas nuevaCita) {
        this.citas.add(nuevaCita);
    }
    
    public void cambiarCita(int indiceCita, Citas nuevaCita) {
        if (indiceCita >= 0 && indiceCita < citas.size()) {
            citas.set(indiceCita, nuevaCita);
        } else {
            System.out.println("Índice de cita inválido.");
        }
    }

    public void updateCita(int index, Citas nuevaCita) {
        if (index >= 0 && index < citas.size()) {
            citas.set(index, nuevaCita);
        }
    }

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + ", correo="
				+ correo + ", senalDinero=" + senalDinero + ", codigoCliente=" + codigoCliente + ", citas=" + citas
				+ "]";
	}

	public void setCitas(ArrayList<Citas> citas2) {
		this.citas=citas;
		
	}

	public void cancelarCita() {
	    if (!citas.isEmpty()) {
	        citas.remove(citas.size() - 1);
	        System.out.println("Cita cancelada para el cliente con DNI: " + dni);
	    } else {
	        System.out.println("El cliente no tiene citas para cancelar.");
	    }
	}

	public void setResena(String resena) {
	    this.resena = resena;
	    System.out.println("Reseña agregada para el cliente con DNI: " + dni);
	}


}
