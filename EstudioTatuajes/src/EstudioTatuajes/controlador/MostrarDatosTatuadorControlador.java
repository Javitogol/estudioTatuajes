package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class MostrarDatosTatuadorControlador implements MostrarDatosTatuadorControladorInterfaz {

    public void mostrarDatosTatuador(String dni, String nombre, int experiencia, String estilo, boolean disponibilidad,
                                     String telefono, String correo, int codigoTatuador, String fechaInicio, String fechaFin) {
        System.out.println("Llamando al controlador para mostrar datos del tatuador");
        
        APIModelo api = APIModelo.getIntancia();
        api.mostrarDatosTatuador(dni, nombre, experiencia, estilo, disponibilidad, telefono, correo, codigoTatuador, fechaInicio, fechaFin);
    }
}
