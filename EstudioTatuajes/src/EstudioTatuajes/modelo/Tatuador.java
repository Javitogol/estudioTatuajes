package EstudioTatuajes.modelo;

public class Tatuador {
    private String nombre;
    private String dni;
    private int experiencia;
    private String estilo;
    private boolean disponibilidad;
    private String telefono;
    private String correo;
    private int codigoTatuador;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    public Tatuador(String nombre, String dni, int experiencia, String estilo, boolean disponibilidad, String telefono, String correo, int codigoTatuador, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.dni = dni;
        this.experiencia = experiencia;
        this.estilo = estilo;
        this.disponibilidad = disponibilidad;
        this.telefono = telefono;
        this.correo = correo;
        this.codigoTatuador = codigoTatuador;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = "activo";
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigoTatuador() {
        return codigoTatuador;
    }

    public void setCodigoTatuador(int codigoTatuador) {
        this.codigoTatuador = codigoTatuador;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void altaTatuador() {
        System.out.println("Tatuador " + nombre + " dado de alta con éxito.");
    }
}
