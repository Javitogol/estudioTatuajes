package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class PonerResenaControlador {

    public void ponerResena(String dni, String resena) {
        APIModelo.getIntancia().ponerResena(dni, resena);
        System.out.println("Reseña almacenada para el cliente con DNI: " + dni);
    }
}
