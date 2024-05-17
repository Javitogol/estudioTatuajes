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
    /*FALTA CODIDO CLIENTE*/ 
    /*FALTA SEÑAL DINERO*/ 
    
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
        /*FALTA CODIDO CLIENTE*/ 
        /*FALTA SEÑAL DINERO*/ 
        
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
        /*FALTA CODIDO CLIENTE*/ 
        /*FALTA SEÑAL DINERO*/ 
        
        JButton altaClienteButton = new JButton("ALTA");
        altaClienteButton.setBounds(187, 249, 89, 23);
        add(altaClienteButton);

        altaClienteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Dando alta cliente...");
                String dni=dniTestField.getText();
                String nombre=nombretextField.getText();
                String edad= edadtextField.getText();
                String telefono= telefonotextField.getText();
                String correo = correotextField.getText();
                /*FALTA CODIDO CLIENTE*/ 
                /*FALTA SEÑAL DINERO*/ 
                System.out.println("Dni:" +dni+ " , nombre:"+ edad+ " , telefono:"+ telefono+ " , correo:"+ correo
                		/*FALTA CODIDO CLIENTE*/ 
                	    /*FALTA SEÑAL DINERO*/ );
                AltaClienteControladorInterfaz altaCliente = new AltaClienteControlador();
                altaCliente.altaCliente(dni /*nombre, edad, telefono... etc*/);
            }
            
        });
    } 
} 