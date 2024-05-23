package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import EstudioTatuajes.controlador.MarcarEstadoTatuadorControlador;

public class MarcarEstadoTatuadorVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoTatuadorField;
    private JTextField estadoTextField;

    /**
     * Create the panel.
     */
    public MarcarEstadoTatuadorVista() {
        setLayout(null);

        JLabel tituloLabel = new JLabel("Marcar Estado Tatuador");
        tituloLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        tituloLabel.setBounds(100, 22, 250, 28);
        add(tituloLabel);

        JLabel codigoTatuadorLabel = new JLabel("Código Tatuador:");
        codigoTatuadorLabel.setBounds(48, 70, 150, 22);
        add(codigoTatuadorLabel);

        JLabel estadoLabel = new JLabel("Nuevo Estado:");
        estadoLabel.setBounds(48, 103, 150, 22);
        add(estadoLabel);

        codigoTatuadorField = new JTextField();
        codigoTatuadorField.setBounds(200, 71, 150, 20);
        add(codigoTatuadorField);
        codigoTatuadorField.setColumns(10);

        estadoTextField = new JTextField();
        estadoTextField.setBounds(200, 104, 150, 20);
        add(estadoTextField);
        estadoTextField.setColumns(10);

        JButton marcarEstadoButton = new JButton("Marcar Estado");
        marcarEstadoButton.setBounds(150, 150, 150, 23);
        add(marcarEstadoButton);

        marcarEstadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el código del tatuador y el nuevo estado
                String codigoTatuador = codigoTatuadorField.getText();
                String nuevoEstado = estadoTextField.getText();

                // Verificar si los campos no están vacíos
                if (!codigoTatuador.isEmpty() && !nuevoEstado.isEmpty()) {
                    try {
                        // Llamar al método del controlador para actualizar el estado del tatuador
                        MarcarEstadoTatuadorControlador.marcarEstadoTatuador(Integer.parseInt(codigoTatuador), nuevoEstado);

                        // Mostrar un mensaje de éxito
                        System.out.println("Estado del tatuador marcado correctamente.");
                    } catch (NumberFormatException ex) {
                        System.out.println("Error: El código del tatuador debe ser un número.");
                    }
                } else {
                    // Mostrar un mensaje de error si algún campo está vacío
                    System.out.println("Por favor, completa todos los campos.");
                }
            }
        });
    }
}
