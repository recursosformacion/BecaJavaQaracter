package curso.g17.swing20Eventos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrEventoMouseBasico {

	static  int counter=1;
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Eventos");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		Container panel = ventana.getContentPane();

		// Añadir Boton
		JButton jbtContador = new JButton("Pulsar - 0");
	    JButton jbtCierre = new JButton("Cerrar");
	    ventana.setLayout(new FlowLayout());
	    panel.add(jbtCierre);
	    panel.add(jbtContador);

	    //Utilizar clase anonima para realizar accion
	    jbtContador.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent event) {	
	    	  System.out.println(event.getActionCommand());
	    	  jbtContador.setText("Pulsar - " + counter++);
	      }	
	    });
	    
	    //Añadir Acion a evento, directamente
	   
			
	    // Añadir MouseListener n
	    jbtCierre.addMouseListener(new MouseListener() {
	      @Override
	      public void mouseClicked(MouseEvent e) {
	    	  System.out.println("Click");
	      }

	      @Override
	      public void mousePressed(MouseEvent e) {
	    	  System.out.println("Pulsado");
	      }

	      @Override
	      public void mouseReleased(MouseEvent e) {
	    	  System.out.println("Soltado");
	      }

	      @Override
	      public void mouseEntered(MouseEvent e) {
	    	  jbtCierre.setText("Llego el raton!");
	      }

	      @Override
	      public void mouseExited(MouseEvent e) {
	    	  jbtCierre.setText("Se fue el raton!");
	      }
	    });
		ventana.setSize(300, 200);
		ventana.setVisible(true);
	}
}









