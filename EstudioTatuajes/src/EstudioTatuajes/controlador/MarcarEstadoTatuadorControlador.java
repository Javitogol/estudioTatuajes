package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.Tatuador;

public class MarcarEstadoTatuadorControlador {

    // M�todo para marcar el estado del tatuador
    public static void marcarEstadoTatuador(int codigoTatuador, String nuevoEstado) {
        // L�gica para actualizar el estado del tatuador
        // Por ejemplo, buscar el tatuador por su c�digo y actualizar su estado

        Tatuador tatuador = buscarTatuadorPorCodigo(codigoTatuador);
        if (tatuador != null) {
            tatuador.setEstado(nuevoEstado);
            System.out.println("Estado del tatuador actualizado correctamente.");
        } else {
            System.out.println("Tatuador no encontrado.");
        }
    }

    // M�todo ficticio para buscar un tatuador por su c�digo
    private static Tatuador buscarTatuadorPorCodigo(int codigoTatuador) {
        // Aqu� debes implementar la l�gica para buscar un tatuador por su c�digo
        // Este es solo un ejemplo ficticio

        // Suponiendo que tienes una lista de tatuadores
        // Por simplicidad, este m�todo siempre devuelve un nuevo tatuador con el c�digo proporcionado
        return new Tatuador("Nombre", "DNI", 5, "Estilo", true, "Tel�fono", "Correo", codigoTatuador, "FechaInicio", "FechaFin");
    }
}
