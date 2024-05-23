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
        TituloLabel.setBounds(165, 22, 152, 28);
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
        resenaTextField.setBounds(118, 104, 251, 111);
        add(resenaTextField);
        resenaTextField.setColumns(10);

        JButton ponerResenaButton = new JButton("Poner Reseña");
        ponerResenaButton.setBounds(187, 359, 130, 23);
        add(ponerResenaButton);
        
        JLabel AgradecimientosLabel = new JLabel("\u00A1Gracias por tu rese\u00F1a!\r\n\r\n\r\n");
        AgradecimientosLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        AgradecimientosLabel.setBounds(48, 226, 180, 28);
        add(AgradecimientosLabel);
        
        JLabel Agradecimientos2Label = new JLabel("Agradecemos tu tiempo y tus comentarios. \r\n\r\n\r\n");
        Agradecimientos2Label.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Agradecimientos2Label.setBounds(48, 255, 251, 28);
        add(Agradecimientos2Label);
        
        JLabel Agradecimientos3Label = new JLabel("Tu opini\u00F3n es muy valiosa para nosotros y nos ayuda a mejorar cada d\u00EDa.");
        Agradecimientos3Label.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Agradecimientos3Label.setBounds(48, 282, 426, 28);
        add(Agradecimientos3Label);
        
        JLabel Agradecimientos4Label = new JLabel("\u00A1Esperamos verte pronto en TATTO PARADISE!");
        Agradecimientos4Label.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Agradecimientos4Label.setBounds(48, 310, 352, 26);
        add(Agradecimientos4Label);

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
