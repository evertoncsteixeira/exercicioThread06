package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.Sorteio;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Cassino extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtNumero3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cassino frame = new Cassino();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cassino() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero1 = new JTextField();
		txtNumero1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero1.setText("1");
		txtNumero1.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtNumero1.setEditable(false);
		txtNumero1.setBounds(28, 59, 89, 88);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero2.setText("1");
		txtNumero2.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtNumero2.setEditable(false);
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(135, 59, 89, 88);
		contentPane.add(txtNumero2);
		
		txtNumero3 = new JTextField();
		txtNumero3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero3.setText("1");
		txtNumero3.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtNumero3.setEditable(false);
		txtNumero3.setColumns(10);
		txtNumero3.setBounds(246, 59, 89, 88);
		contentPane.add(txtNumero3);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(335, 192, 89, 23);
		contentPane.add(btnJogar);
		
		JLabel lblGanhou = new JLabel("");
		lblGanhou.setBounds(28, 196, 196, 19);
		contentPane.add(lblGanhou);
		
		Sorteio jogatina = new Sorteio(txtNumero1, txtNumero2, txtNumero3, btnJogar);
		btnJogar.addActionListener(jogatina);
	}
}
