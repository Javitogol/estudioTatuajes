package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.Tatuador;

public class MarcarEstadoTatuadorControlador {

    // Método para marcar el estado del tatuador
    public static void marcarEstadoTatuador(int codigoTatuador, String nuevoEstado) {
        // Lógica para actualizar el estado del tatuador
        // Por ejemplo, buscar el tatuador por su código y actualizar su estado

        Tatuador tatuador = buscarTatuadorPorCodigo(codigoTatuador);
        if (tatuador != null) {
            tatuador.setEstado(nuevoEstado);
            System.out.println("Estado del tatuador actualizado correctamente.");
        } else {
            System.out.println("Tatuador no encontrado.");
        }
    }

    // Método ficticio para buscar un tatuador por su código
    private static Tatuador buscarTatuadorPorCodigo(int codigoTatuador) {
        // Aquí debes implementar la lógica para buscar un tatuador por su código
        // Este es solo un ejemplo ficticio

        // Suponiendo que tienes una lista de tatuadores
        // Por simplicidad, este método siempre devuelve un nuevo tatuador con el código proporcionado
        return new Tatuador("Nombre", "DNI", 5, "Estilo", true, "Teléfono", "Correo", codigoTatuador, "FechaInicio", "FechaFin");
    }
}
