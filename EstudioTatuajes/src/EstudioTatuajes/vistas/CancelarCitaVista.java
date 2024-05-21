package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import EstudioTatuajes.controlador.CancelarCitaControlador;
import EstudioTatuajes.controlador.CancelarCitaControlador;
import javax.swing.JButton;

public class CancelarCitaVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField nombretextField;
    private JTextField edadtextField;
    private JTextField telefonotextField;
    private JTextField correotextField;
    private JTextField senalDineroField; // Campo para la se�al de dinero
    private JTextField codigoClienteField; // Campo para el c�digo de cliente

    /**
     * Create the panel.
     */
    public CancelarCitaVista() {
        setLayout(null);

        JLabel TituloLabel = new JLabel("Cancelar Cita");
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

        JLabel senalDineroLabel = new JLabel("Se�al Dinero:");
        senalDineroLabel.setBounds(48, 236, 90, 22);
        add(senalDineroLabel);

        JLabel codigoClienteLabel = new JLabel("C�digo Cliente:");
        codigoClienteLabel.setBounds(48, 269, 90, 22);
        add(codigoClienteLabel);

        dniTestField = new JTextField();
        dniTestField.setBounds(148, 71, 86, 20);
        add(dniTestField);
        dniTestField.setColumns(10);

        nombretextField = new JTextField();
        nombretextField.setBounds(148, 103, 86, 20);
        add(nombretextField);
        nombretextField.setColumns(10);

        edadtextField = new JTextField();
        edadtextField.setBounds(148, 137, 86, 20);
        add(edadtextField);
        edadtextField.setColumns(10);

        telefonotextField = new JTextField();
        telefonotextField.setBounds(148, 169, 86, 20);
        add(telefonotextField);
        telefonotextField.setColumns(10);

        correotextField = new JTextField();
        correotextField.setBounds(148, 203, 86, 20);
        add(correotextField);
        correotextField.setColumns(10);

        senalDineroField = new JTextField();
        senalDineroField.setBounds(148, 237, 86, 20);
        add(senalDineroField);
        senalDineroField.setColumns(10);

        codigoClienteField = new JTextField();
        codigoClienteField.setBounds(148, 270, 86, 20);
        add(codigoClienteField);
        codigoClienteField.setColumns(10);

        JButton cancelarCitaButton = new JButton("Cancelar Cita");
        cancelarCitaButton.setBounds(187, 320, 120, 23);
        add(cancelarCitaButton);

        cancelarCitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancelando cita...");
                try {
                    String dni = dniTestField.getText();
                    String nombre = nombretextField.getText();
                    String edad = edadtextField.getText();
                    String telefono = telefonotextField.getText();
                    String correo = correotextField.getText();

                    // Validar si el campo de se�al de dinero est� vac�o
                    String senalDineroText = senalDineroField.getText().trim();
                    double senalDinero = 0; // Valor predeterminado en caso de campo vac�o
                    if (!senalDineroText.isEmpty()) { // Verificar si el texto no est� vac�o
                        senalDinero = Double.parseDouble(senalDineroText);
                    }

                    int codigoCliente = Integer.parseInt(codigoClienteField.getText());

                    CancelarCitaControlador cancelarCita = new CancelarCitaControlador();
                    cancelarCita.cancelarCita(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: Aseg�rate de que todos los campos num�ricos est�n correctamente llenados.");
                }
            }
        });
    }
}
