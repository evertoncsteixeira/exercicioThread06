package controller;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ThreadNumeros extends Thread {

	private JButton btnJogar;
	private JTextField txtNumero;

	
	public ThreadNumeros(JTextField txtNumero, JButton btnJogar) {
		this.txtNumero = txtNumero;

		this.btnJogar  = btnJogar;
	}
	
	private void girarNumero() {
		Random r = new Random();
		btnJogar.setVisible(false);
		int rodar = r.nextInt(149)+1;
		for (int i=0; i < rodar; i++) {
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			txtNumero.setText(Integer.toString(r.nextInt(6)+1));
		}
		
		btnJogar.setVisible(true);
	}
	
	@Override
	public void run() {
		girarNumero();
	}
}
