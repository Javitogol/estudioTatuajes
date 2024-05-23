package EstudioTatuajes.controlador;

public interface AltaTatuadorControladorInterfaz {

    /**
     * Agrega un nuevo tatuador con todos sus datos al sistema.
     * @param nombre El nombre del tatuador.
     * @param dni El DNI del tatuador.
     * @param experiencia La experiencia del tatuador.
     * @param estilo El estilo del tatuador.
     * @param disponibilidad La disponibilidad del tatuador.
     * @param telefono El número de teléfono del tatuador.
     * @param correo El correo electrónico del tatuador.
     * @param codigoTatuador El código único del tatuador.
     * @param fechaInicio La fecha de inicio del tatuador.
     * @param fechaFin La fecha de fin del tatuador.
     */
    void altaTatuador(String nombre, String dni, int experiencia, String estilo, boolean disponibilidad, String telefono, String correo, int codigoTatuador, String fechaInicio, String fechaFin);
}
