package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class PonerResenaControlador {

    public void ponerResena(String dni, String resena) {
        // Llamar al método de la APIModelo para almacenar la reseña
        APIModelo.getIntancia().ponerResena(dni, resena);
        System.out.println("Reseña almacenada para el cliente con DNI: " + dni);
    }
}
