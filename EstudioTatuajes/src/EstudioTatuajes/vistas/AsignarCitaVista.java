package EstudioTatuajes.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import EstudioTatuajes.modelo.APIModelo;

public class AsignarCitaVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField dniTextField;
    private JTextField fechaTextField;
    private JTextField horaTextField;

    /**
     * Create the panel.
     */
    public AsignarCitaVista() {
        setLayout(null);
        
        JLabel asignarCitaLabel = new JLabel("Asignar Cita");
        asignarCitaLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
        asignarCitaLabel.setBounds(157, 33, 146, 20);
        add(asignarCitaLabel);
        
        JLabel lblDni = new JLabel("DNI:");
        lblDni.setBounds(78, 87, 46, 14);
        add(lblDni);
        
        dniTextField = new JTextField();
        dniTextField.setBounds(176, 84, 127, 20);
        add(dniTextField);
        dniTextField.setColumns(10);
        
        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(78, 131, 46, 14);
        add(lblFecha);
        
        fechaTextField = new JTextField();
        fechaTextField.setBounds(176, 128, 127, 20);
        add(fechaTextField);
        fechaTextField.setColumns(10);
        
        JLabel lblHora = new JLabel("Hora:");
        lblHora.setBounds(78, 176, 46, 14);
        add(lblHora);
        
        horaTextField = new JTextField();
        horaTextField.setBounds(176, 173, 127, 20);
        add(horaTextField);
        horaTextField.setColumns(10);
        
        JButton btnAsignar = new JButton("Asignar");
        btnAsignar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dni = dniTextField.getText();
                String fecha = fechaTextField.getText();
                String hora = horaTextField.getText();
                
                APIModelo.getIntancia().asignarCita(dni, fecha, hora);
            }
        });
        btnAsignar.setBounds(157, 219, 89, 23);
        add(btnAsignar);

    }
}
