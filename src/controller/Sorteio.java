package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JTextField;
public class Sorteio implements ActionListener {

	private JButton btnJogar;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtNumero3;

	public Sorteio(JTextField txtNumero1,JTextField txtNumero2,JTextField txtNumero3, JButton btnJogar) {
		this.txtNumero1 = txtNumero1;
		this.txtNumero2 = txtNumero2;
		this.txtNumero3 = txtNumero3;
		this.btnJogar = btnJogar;
	}
	
	private void botaoJogar(){
		Thread t1 = new ThreadNumeros(txtNumero1, btnJogar);
		Thread t2 = new ThreadNumeros(txtNumero2, btnJogar);
		Thread t3 = new ThreadNumeros(txtNumero3, btnJogar);
		t1.start();
		t2.start();
		t3.start();
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botaoJogar();
	}
}
