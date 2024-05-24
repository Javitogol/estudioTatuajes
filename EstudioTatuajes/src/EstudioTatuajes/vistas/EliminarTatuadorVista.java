package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EliminarTatuadorVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoTatuadorField;

    /**
     * Create the panel.
     */
    public EliminarTatuadorVista() {
        setLayout(null);

        JLabel tituloLabel = new JLabel("Eliminar Tatuador");
        tituloLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        tituloLabel.setBounds(100, 22, 250, 28);
        add(tituloLabel);

        JLabel codigoTatuadorLabel = new JLabel("Código Tatuador:");
        codigoTatuadorLabel.setBounds(48, 70, 150, 22);
        add(codigoTatuadorLabel);

        codigoTatuadorField = new JTextField();
        codigoTatuadorField.setBounds(200, 71, 150, 20);
        add(codigoTatuadorField);
        codigoTatuadorField.setColumns(10);

        JButton eliminarTatuadorButton = new JButton("Eliminar Tatuador");
        eliminarTatuadorButton.setBounds(150, 150, 150, 23);
        add(eliminarTatuadorButton);

        eliminarTatuadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoTatuador = codigoTatuadorField.getText();

                if (!codigoTatuador.isEmpty()) {
                    try {
                        System.out.println("Tatuador eliminado correctamente.");
                    } catch (NumberFormatException ex) {
                        System.out.println("Error: El código del tatuador debe ser un número.");
                    }
                } else {
                    System.out.println("Por favor, completa todos los campos.");
                }
            }
        });
    }
}
