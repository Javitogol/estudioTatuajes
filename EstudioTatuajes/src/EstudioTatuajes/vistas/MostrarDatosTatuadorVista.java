package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import EstudioTatuajes.modelo.Tatuador;

public class MostrarDatosTatuadorVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTestField;
    private JTextField nombretextField;
    private JTextField experienciatextField;
    private JTextField estilotextField;
    private JTextField telefonotextField;
    private JTextField codigoTatuadorField;

    /**
     * Create the panel.
     */
    public MostrarDatosTatuadorVista() {
        setLayout(null);

        JLabel MostrarDatosTatuadorLabel = new JLabel("Mostrar datos ");
        MostrarDatosTatuadorLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        MostrarDatosTatuadorLabel.setBounds(153, 21, 209, 28);
        add(MostrarDatosTatuadorLabel);

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

        JLabel codigoTatuadorLabel = new JLabel("Código Tatuador:");
        codigoTatuadorLabel.setBounds(48, 235, 90, 22);
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

        codigoTatuadorField = new JTextField();
        codigoTatuadorField.setBounds(148, 236, 86, 20);
        add(codigoTatuadorField);
        codigoTatuadorField.setColumns(10);

        JButton MostrarDatosButton = new JButton("MOSTRAR DATOS");
        MostrarDatosButton.setBounds(165, 302, 140, 22);
        add(MostrarDatosButton);

        MostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("Mostrando datos tatuador...");
                    String dni = dniTestField.getText();
                    String nombre = nombretextField.getText();
                    int experiencia = Integer.parseInt(experienciatextField.getText());
                    String estilo = estilotextField.getText();
                    boolean disponibilidad = true; 
                    String telefono = telefonotextField.getText();
                    int codigoTatuador = Integer.parseInt(codigoTatuadorField.getText());

                    Tatuador tatuador = new Tatuador(nombre, dni, experiencia, estilo, disponibilidad, telefono, telefono, codigoTatuador, telefono, telefono );
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
