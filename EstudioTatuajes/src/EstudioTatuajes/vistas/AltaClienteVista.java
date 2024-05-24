package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import EstudioTatuajes.controlador.AltaClienteControlador;
import EstudioTatuajes.controlador.AltaClienteControladorInterfaz;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class AltaClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField nombretextField;
    private JTextField edadtextField;
    private JTextField telefonotextField;
    private JTextField correotextField;
    private JTextField senalDineroField; 
    private JTextField codigoClienteField; 

    /**
     * Create the panel.
     */
    public AltaClienteVista() {
        setLayout(null);

        JLabel TituloLabel = new JLabel("Alta cliente");
        TituloLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        TituloLabel.setBounds(165, 22, 126, 28);
        add(TituloLabel);

        JLabel dniLabel = new JLabel("DNI:");
        dniLabel.setBounds(36, 70, 90, 22);
        add(dniLabel);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(36, 103, 90, 22);
        add(nombreLabel);

        JLabel EdadLabel = new JLabel("Edad:");
        EdadLabel.setBounds(36, 136, 90, 22);
        add(EdadLabel);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setBounds(36, 203, 90, 22);
        add(correoLabel);

        JLabel telefonoLabel = new JLabel("Telefono:");
        telefonoLabel.setBounds(36, 169, 90, 22);
        add(telefonoLabel);

        JLabel senalDineroLabel = new JLabel("Señal Dinero:"); 
        senalDineroLabel.setBounds(36, 236, 90, 22);
        add(senalDineroLabel);

        JLabel codigoClienteLabel = new JLabel("Código Cliente:"); 
        codigoClienteLabel.setBounds(36, 268, 90, 22);
        add(codigoClienteLabel);

        dniTestField = new JTextField();
        dniTestField.setBounds(128, 71, 86, 20);
        add(dniTestField);
        dniTestField.setColumns(10);

        nombretextField = new JTextField();
        nombretextField.setBounds(128, 103, 86, 20);
        add(nombretextField);
        nombretextField.setColumns(10);

        edadtextField = new JTextField();
        edadtextField.setBounds(128, 137, 86, 20);
        add(edadtextField);
        edadtextField.setColumns(10);

        telefonotextField = new JTextField();
        telefonotextField.setBounds(128, 170, 86, 20);
        add(telefonotextField);
        telefonotextField.setColumns(10);

        correotextField = new JTextField();
        correotextField.setBounds(128, 204, 86, 20);
        add(correotextField);
        correotextField.setColumns(10);

        senalDineroField = new JTextField();
        senalDineroField.setBounds(128, 237, 86, 20);
        add(senalDineroField);
        senalDineroField.setColumns(10);

        codigoClienteField = new JTextField(); 
        codigoClienteField.setBounds(128, 269, 86, 20);
        add(codigoClienteField);
        codigoClienteField.setColumns(10);

        JButton altaClienteButton = new JButton("ALTA");
        altaClienteButton.setBounds(187, 320, 89, 23);
        add(altaClienteButton);
        
        JLabel PrintAltaClienteLabel = new JLabel("");
        PrintAltaClienteLabel.setIcon(new ImageIcon(System.getProperty("user.home") + "\\git\\estudioTataujes\\EstudioTatuajes\\IMG\\CuchilloCaraChica (1).jpg"));
        PrintAltaClienteLabel.setBounds(292, 70, 162, 221);
        add(PrintAltaClienteLabel);

        altaClienteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Dando alta cliente...");
                String dni = dniTestField.getText();
                String nombre = nombretextField.getText();
                String edad = edadtextField.getText();
                String telefono = telefonotextField.getText();
                String correo = correotextField.getText();
                
                double senalDinero = 0.0;
                int codigoCliente = 0;
                try {
                    if (!senalDineroField.getText().isEmpty()) {
                        senalDinero = Double.parseDouble(senalDineroField.getText());
                    }
                    if (!codigoClienteField.getText().isEmpty()) {
                        codigoCliente = Integer.parseInt(codigoClienteField.getText());
                    }
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    System.out.println("Error: Asegúrate de que todos los campos numéricos estén correctamente llenados.");
                    return;
                }

                AltaClienteControladorInterfaz altaCliente = new AltaClienteControlador();
                altaCliente.altaCliente(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente);
            }

        });
    }
}
