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

public class AltaClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField nombretextField;
    private JTextField edadtextField;
    private JTextField telefonotextField;
    private JTextField correotextField;
    private JTextField senalDineroField; // Nuevo campo para la se�al de dinero
    private JTextField codigoClienteField; // Nuevo campo para el c�digo de cliente

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
        dniLabel.setBounds(48, 70, 90, 22);
        add(dniLabel);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(48, 103, 90, 22);
        add(nombreLabel);

        JLabel EdadLabel = new JLabel("Edad:");
        EdadLabel.setBounds(48, 136, 90, 22);
        add(EdadLabel);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setBounds(48, 202, 90, 22);
        add(correoLabel);

        JLabel telefonoLabel = new JLabel("Telefono:");
        telefonoLabel.setBounds(48, 169, 90, 22);
        add(telefonoLabel);

        JLabel senalDineroLabel = new JLabel("Se�al Dinero:"); // Etiqueta para la se�al de dinero
        senalDineroLabel.setBounds(48, 236, 90, 22);
        add(senalDineroLabel);

        JLabel codigoClienteLabel = new JLabel("C�digo Cliente:"); // Etiqueta para el c�digo de cliente
        codigoClienteLabel.setBounds(48, 269, 90, 22);
        add(codigoClienteLabel);

        dniTestField = new JTextField();
        dniTestField.setBounds(118, 71, 86, 20);
        add(dniTestField);
        dniTestField.setColumns(10);

        nombretextField = new JTextField();
        nombretextField.setBounds(118, 103, 86, 20);
        add(nombretextField);
        nombretextField.setColumns(10);

        edadtextField = new JTextField();
        edadtextField.setBounds(118, 137, 86, 20);
        add(edadtextField);
        edadtextField.setColumns(10);

        telefonotextField = new JTextField();
        telefonotextField.setBounds(118, 169, 86, 20);
        add(telefonotextField);
        telefonotextField.setColumns(10);

        correotextField = new JTextField();
        correotextField.setBounds(118, 203, 86, 20);
        add(correotextField);
        correotextField.setColumns(10);

        senalDineroField = new JTextField(); // Campo de entrada para la se�al de dinero
        senalDineroField.setBounds(148, 237, 86, 20);
        add(senalDineroField);
        senalDineroField.setColumns(10);

        codigoClienteField = new JTextField(); // Campo de entrada para el c�digo de cliente
        codigoClienteField.setBounds(148, 270, 86, 20);
        add(codigoClienteField);
        codigoClienteField.setColumns(10);

        JButton altaClienteButton = new JButton("ALTA");
        altaClienteButton.setBounds(187, 320, 89, 23);
        add(altaClienteButton);

        altaClienteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Dando alta cliente...");
                String dni = dniTestField.getText();
                String nombre = nombretextField.getText();
                String edad = edadtextField.getText();
                String telefono = telefonotextField.getText();
                String correo = correotextField.getText();
                
                // Verificar si los campos de se�al de dinero y c�digo de cliente est�n vac�os
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
                    System.out.println("Error: Aseg�rate de que todos los campos num�ricos est�n correctamente llenados.");
                    return; // Salir del m�todo si hay un error de conversi�n
                }

                AltaClienteControladorInterfaz altaCliente = new AltaClienteControlador();
                altaCliente.altaCliente(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente);
            }

        });
    }
}
