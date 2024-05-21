package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import EstudioTatuajes.controlador.PonerResenaControlador;
import EstudioTatuajes.controlador.PonerResenaControladorInterfaz;
import javax.swing.JButton;

public class PonerResenaVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField resenaTextField; // Nuevo campo para la reseña

    /**
     * Create the panel.
     */
    public PonerResenaVista() {
        setLayout(null);

        JLabel TituloLabel = new JLabel("Poner Reseña");
        TituloLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        TituloLabel.setBounds(165, 22, 126, 28);
        add(TituloLabel);

        JLabel dniLabel = new JLabel("DNI:");
        dniLabel.setBounds(48, 70, 90, 22);
        add(dniLabel);

        JLabel resenaLabel = new JLabel("Reseña:"); // Etiqueta para la reseña
        resenaLabel.setBounds(48, 103, 90, 22);
        add(resenaLabel);

        dniTestField = new JTextField();
        dniTestField.setBounds(118, 71, 86, 20);
        add(dniTestField);
        dniTestField.setColumns(10);

        resenaTextField = new JTextField(); // Campo de entrada para la reseña
        resenaTextField.setBounds(118, 104, 250, 150);
        add(resenaTextField);
        resenaTextField.setColumns(10);

        JButton ponerResenaButton = new JButton("Poner Reseña");
        ponerResenaButton.setBounds(187, 320, 130, 23);
        add(ponerResenaButton);

        ponerResenaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Poniendo reseña...");
                String dni = dniTestField.getText();
                String resena = resenaTextField.getText(); // Obtener la reseña

                PonerResenaControlador ponerResena = new PonerResenaControlador();
                ponerResena.ponerResena(dni, resena);
            }

        });
    }
}
