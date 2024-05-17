package EstudioTatuajes.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import EstudioTatuajes.vistas.AltaClienteVista;
import EstudioTatuajes.vistas.ConsultaVista;

public class TatuajeMenu extends JFrame implements ActionListener{
	
	private JMenuItem altaClienteMenuItem;
	private JMenuItem cambiarCitMeniItem;
	private JMenuItem calcelarCitMeniItem;
	private JMenuItem reseña;
	private JMenuItem consultaJMenuItem;

	
	public TatuajeMenu () {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 550, 412);
		
		setTitle("TATTO PARADISE");
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
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

		JMenu informesJMenu=new JMenu("Informes");
		menuBar.add(informesJMenu);
		consultaJMenuItem = new JMenuItem("Consulta clientes");
		informesJMenu.add(consultaJMenuItem);
		consultaJMenuItem.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==altaClienteMenuItem) {
			System.out.println("Alta");
			AltaClienteVista altaClienteVista = new AltaClienteVista();
			setContentPane(altaClienteVista);
			setVisible(true);
		}
		else if (e.getSource()==cambiarCitMeniItem) {
			System.out.println("Cambiar cita");
		}
		else if (e.getSource()==calcelarCitMeniItem) {
			System.out.println("Cancelar cita");
		}
		else if (e.getSource()==reseña) {
			System.out.println("Poner reseña");
		}
		else if (e.getSource()==consultaJMenuItem) {
			System.out.println("Consulta");
			ConsultaVista consultaVista = new ConsultaVista();
			setContentPane(consultaVista);
			setVisible(true);
		}
	}
}
