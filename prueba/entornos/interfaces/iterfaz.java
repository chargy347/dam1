package interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class iterfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBruh;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iterfaz frame = new iterfaz();
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
	public iterfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(22, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtBruh = new JTextField();
		txtBruh.setText("bruh");
		txtBruh.setBounds(22, 36, 86, 20);
		contentPane.add(txtBruh);
		txtBruh.setColumns(10);
		
		JLabel lblBruh = new JLabel("Contraseña");
		lblBruh.setBounds(22, 84, 86, 14);
		contentPane.add(lblBruh);
		
		passwordField = new JPasswordField();
		passwordField.setText("******");
		passwordField.setBounds(22, 104, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setBounds(22, 168, 89, 23);
		contentPane.add(btnNewButton);
		
		// ActionListener para el botón ENTRAR
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtBruh.getText();
				String contraseña = new String(passwordField.getPassword());
				
				// Condicional para verificar usuario y contraseña
				if (usuario.equals("juan") && contraseña.equals("123")) {
					System.out.println("Usuario y contraseña correctos. Hackeando la NASA...");
					System.exit(0); // Cerrar el programa
				} else {
					System.out.println("Usuario o contraseña incorrectos.");
				}
			}
		});
	}
}
