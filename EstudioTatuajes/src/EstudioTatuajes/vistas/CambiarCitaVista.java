package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import EstudioTatuajes.controlador.CambiarCitaControlador;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class CambiarCitaVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField nombretextField;
    private JTextField edadtextField;
    private JTextField telefonotextField;
    private JTextField correotextField;
    private JTextField senalDineroField; 
    private JTextField codigoClienteField; 
    private JTextField nuevaFechaCitaField; 
    private JTextField nuevaHoraCitaField; 

    /**
     * Create the panel.
     */
    public CambiarCitaVista() {
        setLayout(null);

        JLabel TituloLabel = new JLabel("Cambiar Cita");
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

        JLabel senalDineroLabel = new JLabel("Señal Dinero:");
        senalDineroLabel.setBounds(48, 236, 90, 22);
        add(senalDineroLabel);

        JLabel codigoClienteLabel = new JLabel("Código Cliente:");
        codigoClienteLabel.setBounds(48, 269, 90, 22);
        add(codigoClienteLabel);

        JLabel nuevaFechaCitaLabel = new JLabel("Nueva Fecha:");
        nuevaFechaCitaLabel.setBounds(48, 302, 90, 22);
        add(nuevaFechaCitaLabel);

        JLabel nuevaHoraCitaLabel = new JLabel("Nueva Hora:");
        nuevaHoraCitaLabel.setBounds(48, 335, 90, 22);
        add(nuevaHoraCitaLabel);

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

        nuevaFechaCitaField = new JTextField();
        nuevaFechaCitaField.setBounds(148, 303, 86, 20);
        add(nuevaFechaCitaField);
        nuevaFechaCitaField.setColumns(10);

        nuevaHoraCitaField = new JTextField();
        nuevaHoraCitaField.setBounds(148, 336, 86, 20);
        add(nuevaHoraCitaField);
        nuevaHoraCitaField.setColumns(10);

        JButton cambiarCitaButton = new JButton("Cambiar Cita");
        cambiarCitaButton.setBounds(187, 380, 120, 23);
        add(cambiarCitaButton);
        
        JLabel PrintCambiarCitaLabel = new JLabel("");
        PrintCambiarCitaLabel.setIcon(new ImageIcon(System.getProperty("user.home") + "\\git\\estudioTataujes\\EstudioTatuajes\\IMG\\CuchilloCaraChica (1).jpg"));
        PrintCambiarCitaLabel.setBounds(318, 106, 170, 239);
        add(PrintCambiarCitaLabel);

        cambiarCitaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cambiando cita...");
                String dni = dniTestField.getText();
                String nombre = nombretextField.getText();
                String edad = edadtextField.getText();
                String telefono = telefonotextField.getText();
                String correo = correotextField.getText();
                double senalDinero = Double.parseDouble(senalDineroField.getText());
                int codigoCliente = Integer.parseInt(codigoClienteField.getText());
                String nuevaFecha = nuevaFechaCitaField.getText();
                String nuevaHora = nuevaHoraCitaField.getText();

                CambiarCitaControlador cambiarCita = new CambiarCitaControlador();
                cambiarCita.cambiarCita(dni, nombre, edad, telefono, correo, senalDinero, codigoCliente, nuevaFecha, nuevaHora);
            }
        });
    }
}
