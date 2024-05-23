package EstudioTatuajes.controlador;

import EstudioTatuajes.modelo.Tatuador;
import java.util.ArrayList;
import java.util.List;

public class AltaTatuadorControlador implements AltaTatuadorControladorInterfaz {

    private static List<Tatuador> tatuadores = new ArrayList<>();

    public static boolean agregarTatuador(Tatuador tatuador) {
        for (Tatuador t : tatuadores) {
            if (t.getCodigoTatuador() == tatuador.getCodigoTatuador()) {
                return false;
            }
        }
        tatuadores.add(tatuador);
        return true;
    }

    public static List<Tatuador> obtenerTatuadores() {
        return tatuadores;
    }

    public static boolean tatuadorExiste(int codigoTatuador) {
        for (Tatuador t : tatuadores) {
            if (t.getCodigoTatuador() == codigoTatuador) {
                return true;
            }
        }
        return false;
    }

	@Override
	public void altaTatuador(String nombre, String dni, int experiencia, String estilo, boolean disponibilidad,
			String telefono, String correo, int codigoTatuador, String fechaInicio, String fechaFin) {
		
	}
}
