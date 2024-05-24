package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import EstudioTatuajes.controlador.ConsultaControlardorInterfaz;
import EstudioTatuajes.controlador.ConsultaControlador;

public class ConsultaVista extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public ConsultaVista() {
        setLayout(null);
        
        JLabel titulolNewLabel = new JLabel("Consulta");
        titulolNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        titulolNewLabel.setBounds(179, 31, 128, 33);
        add(titulolNewLabel);

        ConsultaControlardorInterfaz consulta = new ConsultaControlador();
        String[][] clientes = consulta.consultarCliente();

        final String[] cabeceraTabla = { "DNI", "NOMBRE" };

        JTable tablaClientes = new JTable(clientes, cabeceraTabla) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaClientes.setGridColor(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(tablaClientes);
        scrollPane.setBounds(29, 75, 400, 200);
        add(scrollPane);
    }
}
