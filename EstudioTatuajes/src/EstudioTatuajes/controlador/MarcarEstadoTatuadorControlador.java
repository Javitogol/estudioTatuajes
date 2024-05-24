package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.Tatuador;
import EstudioTatuajes.modelo.Estudio;

public class MarcarEstadoTatuadorControlador implements MarcarEstadoTatuadorInterfaz{

    private static Estudio estudio = new Estudio(); 

    public void marcarEstadoTatuador(int codigoTatuador, String nuevoEstado) {
        Tatuador tatuador = buscarTatuadorPorCodigo(codigoTatuador);
        if (tatuador != null) {
            tatuador.setEstado(nuevoEstado);
            System.out.println("Estado del tatuador actualizado correctamente.");
        } else {
            System.out.println("Tatuador no encontrado.");
        }
    }

    private static Tatuador buscarTatuadorPorCodigo(int codigoTatuador) {
        for (Tatuador tatuador : estudio.getTatuadores()) {
            if (tatuador.getCodigoTatuador() == codigoTatuador) {
                return tatuador;
            }
        }
        return null; 
    }
}
