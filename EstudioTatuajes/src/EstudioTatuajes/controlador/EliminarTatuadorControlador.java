package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class EliminarTatuadorControlador {

    public static void eliminarTatuador(int codigoTatuador) {
        APIModelo.getIntancia().eliminarTatuador(codigoTatuador);
    }
}
