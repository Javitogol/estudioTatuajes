package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import EstudioTatuajes.modelo.Tatuador;

public class AltaTatuadorVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField nombretextField;
    private JTextField experienciatextField;
    private JTextField estilotextField;
    private JTextField telefonotextField;
    private JTextField correotextField;
    private JTextField fechaInicioField;
    private JTextField fechaFinField;
    private JTextField codigoTatuadorField;

    /**
     * Create the panel.
     */
    public AltaTatuadorVista() {
        setLayout(null);

        JLabel TituloLabel = new JLabel("Alta Tatuador");
        TituloLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        TituloLabel.setBounds(165, 22, 126, 28);
        add(TituloLabel);

        JLabel dniLabel = new JLabel("DNI:");
        dniLabel.setBounds(48, 70, 90, 22);
        add(dniLabel);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(48, 103, 90, 22);
        add(nombreLabel);

        JLabel experienciaLabel = new JLabel("Experiencia:");
        experienciaLabel.setBounds(48, 136, 90, 22);
        add(experienciaLabel);

        JLabel estiloLabel = new JLabel("Estilo:");
        estiloLabel.setBounds(48, 169, 90, 22);
        add(estiloLabel);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoLabel.setBounds(48, 202, 90, 22);
        add(telefonoLabel);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setBounds(48, 235, 90, 22);
        add(correoLabel);

        JLabel fechaInicioLabel = new JLabel("Fecha Inicio:");
        fechaInicioLabel.setBounds(48, 268, 90, 22);
        add(fechaInicioLabel);

        JLabel fechaFinLabel = new JLabel("Fecha Fin:");
        fechaFinLabel.setBounds(48, 301, 90, 22);
        add(fechaFinLabel);

        JLabel codigoTatuadorLabel = new JLabel("Código Tatuador:");
        codigoTatuadorLabel.setBounds(48, 334, 90, 22);
        add(codigoTatuadorLabel);

        dniTestField = new JTextField();
        dniTestField.setBounds(148, 71, 86, 20);
        add(dniTestField);
        dniTestField.setColumns(10);

        nombretextField = new JTextField();
        nombretextField.setBounds(148, 103, 86, 20);
        add(nombretextField);
        nombretextField.setColumns(10);

        experienciatextField = new JTextField();
        experienciatextField.setBounds(148, 137, 86, 20);
        add(experienciatextField);
        experienciatextField.setColumns(10);

        estilotextField = new JTextField();
        estilotextField.setBounds(148, 169, 86, 20);
        add(estilotextField);
        estilotextField.setColumns(10);

        telefonotextField = new JTextField();
        telefonotextField.setBounds(148, 202, 86, 20);
        add(telefonotextField);
        telefonotextField.setColumns(10);

        correotextField = new JTextField();
        correotextField.setBounds(148, 235, 86, 20);
        add(correotextField);
        correotextField.setColumns(10);

        fechaInicioField = new JTextField();
        fechaInicioField.setBounds(148, 268, 86, 20);
        add(fechaInicioField);
        fechaInicioField.setColumns(10);

        fechaFinField = new JTextField();
        fechaFinField.setBounds(148, 301, 86, 20);
        add(fechaFinField);
        fechaFinField.setColumns(10);

        codigoTatuadorField = new JTextField();
        codigoTatuadorField.setBounds(148, 334, 86, 20);
        add(codigoTatuadorField);
        codigoTatuadorField.setColumns(10);

        JButton altaTatuadorButton = new JButton("ALTA");
        altaTatuadorButton.setBounds(187, 370, 89, 23);
        add(altaTatuadorButton);

        altaTatuadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("Dando alta tatuador...");
                    String dni = dniTestField.getText();
                    String nombre = nombretextField.getText();
                    int experiencia = Integer.parseInt(experienciatextField.getText());
                    String estilo = estilotextField.getText();
                    boolean disponibilidad = true; 
                    String telefono = telefonotextField.getText();
                    String correo = correotextField.getText();
                    String fechaInicio = fechaInicioField.getText();
                    String fechaFin = fechaFinField.getText();
                    int codigoTatuador = Integer.parseInt(codigoTatuadorField.getText());

                    Tatuador tatuador = new Tatuador(nombre, dni, experiencia, estilo, disponibilidad, telefono, correo, codigoTatuador, fechaInicio, fechaFin);
                    tatuador.altaTatuador();
                } catch (NumberFormatException ex) {
                    System.out.println("Error en la conversión de números: " + ex.getMessage());
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        });
    }
}
