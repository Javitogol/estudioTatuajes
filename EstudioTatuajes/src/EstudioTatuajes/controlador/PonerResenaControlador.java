package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.APIModelo;

public class PonerResenaControlador {

    public void ponerResena(String dni, String resena) {
        // Llamar al m�todo de la APIModelo para almacenar la rese�a
        APIModelo.getIntancia().ponerResena(dni, resena);
        System.out.println("Rese�a almacenada para el cliente con DNI: " + dni);
    }
}
