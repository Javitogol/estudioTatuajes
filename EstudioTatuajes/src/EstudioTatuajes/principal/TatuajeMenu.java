package EstudioTatuajes.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import EstudioTatuajes.vistas.AltaClienteVista;
import EstudioTatuajes.vistas.AltaTatuadorVista;
import EstudioTatuajes.vistas.AsignarCitaVista;
import EstudioTatuajes.vistas.CambiarCitaVista;
import EstudioTatuajes.vistas.CancelarCitaVista; 
import EstudioTatuajes.vistas.ConsultaVista;
import EstudioTatuajes.vistas.MostrarDatosTatuadorVista;
import EstudioTatuajes.vistas.PonerResenaVista;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class TatuajeMenu extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    private JMenuItem altaClienteMenuItem;
    private JMenuItem cambiarCitMeniItem;
    private JMenuItem calcelarCitMeniItem;
    private JMenuItem reseña;
    private JMenuItem consultaJMenuItem;
    private JMenuItem altaTatuadorMenuItem;
    private JMenuItem mostrarDatosTatuadorMenuItem;
    private JMenuItem marcarEstadoTatuadorMenuItem;
    private JMenuItem eliminarTatuadorMenuItem;
    private JMenuItem asignarCitaMenuItem;
    private JLabel label;
    private JLabel FondoLabel;

    public TatuajeMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 537, 458);
        setTitle("TATTO PARADISE");
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Menú Cliente
        JMenu clienteMenu = new JMenu("Cliente");
        menuBar.add(clienteMenu);
        altaClienteMenuItem = new JMenuItem("Alta Cliente");
        clienteMenu.add(altaClienteMenuItem);
        altaClienteMenuItem.addActionListener(this);
        cambiarCitMeniItem = new JMenuItem("Cambiar Cita");
        clienteMenu.add(cambiarCitMeniItem);
        cambiarCitMeniItem.addActionListener(this);
        calcelarCitMeniItem = new JMenuItem("Cancelar Cita");
        clienteMenu.add(calcelarCitMeniItem);
        calcelarCitMeniItem.addActionListener(this);
        reseña = new JMenuItem("Poner reseña");
        clienteMenu.add(reseña);
        reseña.addActionListener(this);
        
        // Menú Tatuador
        JMenu tatuadorMenu = new JMenu("Tatuador");
        menuBar.add(tatuadorMenu);
        altaTatuadorMenuItem = new JMenuItem("Alta Tatuador");
        tatuadorMenu.add(altaTatuadorMenuItem);
        altaTatuadorMenuItem.addActionListener(this);
        mostrarDatosTatuadorMenuItem = new JMenuItem("Mostrar Datos Tatuador");
        tatuadorMenu.add(mostrarDatosTatuadorMenuItem);
        mostrarDatosTatuadorMenuItem.addActionListener(this);
        marcarEstadoTatuadorMenuItem = new JMenuItem("Marcar Estado Tatuador");
        tatuadorMenu.add(marcarEstadoTatuadorMenuItem);
        marcarEstadoTatuadorMenuItem.addActionListener(this);
        eliminarTatuadorMenuItem = new JMenuItem("Eliminar Tatuador");
        tatuadorMenu.add(eliminarTatuadorMenuItem);
        eliminarTatuadorMenuItem.addActionListener(this);
        asignarCitaMenuItem = new JMenuItem("Asignar Cita");
        tatuadorMenu.add(asignarCitaMenuItem);
        asignarCitaMenuItem.addActionListener(this);
        
        
        JMenu informesJMenu = new JMenu("Informes");
        menuBar.add(informesJMenu);
        consultaJMenuItem = new JMenuItem("Consulta clientes");
        informesJMenu.add(consultaJMenuItem);
        consultaJMenuItem.addActionListener(this);
        
        label = new JLabel("");
        getContentPane().add(label, BorderLayout.CENTER);
        
        FondoLabel = new JLabel("");
        FondoLabel.setIcon(new ImageIcon(System.getProperty("user.home") + "\\git\\estudioTataujes\\EstudioTatuajes\\IMG\\fotoEmpresa (2).jpg"));
        getContentPane().add(FondoLabel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == altaClienteMenuItem) {
            System.out.println("Alta");
            AltaClienteVista altaClienteVista = new AltaClienteVista();
            setContentPane(altaClienteVista);
            revalidate();
            repaint();
        } else if (e.getSource() == cambiarCitMeniItem) {
            System.out.println("Cambiar cita");
            CambiarCitaVista cambiarCitaVista = new CambiarCitaVista();
            setContentPane(cambiarCitaVista);
            revalidate();
            repaint();
        } else if (e.getSource() == calcelarCitMeniItem) {
            System.out.println("Cancelar cita");
            CancelarCitaVista cancelarCitaVista = new CancelarCitaVista(); 
            setContentPane(cancelarCitaVista);
            revalidate(); 
            repaint(); 
        } else if (e.getSource() == reseña) {
            System.out.println("Poner reseña");
            PonerResenaVista ponerResenaVista = new PonerResenaVista();
            setContentPane(ponerResenaVista);
            revalidate();
            repaint();
        } else if (e.getSource() == consultaJMenuItem) {
            System.out.println("Consulta");
            ConsultaVista consultaVista = new ConsultaVista();
            setContentPane(consultaVista);
            revalidate();
            repaint();
        } else if (e.getSource() == altaTatuadorMenuItem) {
            System.out.println("Alta Tatuador");
            AltaTatuadorVista altaTatuadorVista = new AltaTatuadorVista();
            setContentPane(altaTatuadorVista);
            revalidate();
            repaint();
        
        }else if (e.getSource() == asignarCitaMenuItem) {
            System.out.println("Asignar Cita");
            AsignarCitaVista asignarCitaVista = new AsignarCitaVista();
            setContentPane(asignarCitaVista);
            revalidate();
            repaint();
        } else if (e.getSource() == mostrarDatosTatuadorMenuItem) {
            System.out.println("Mostrar Datos Tatuador");
            MostrarDatosTatuadorVista mostrarDatosTatuadorVista = new MostrarDatosTatuadorVista();
            setContentPane(mostrarDatosTatuadorVista);
            revalidate();
            repaint();
        }


    }   
}
