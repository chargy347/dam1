package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel background = new JPanel();
		background.setBorder(null);
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(-12, 0, 811, 477);
		contentPane.add(background);
		background.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DE LA EMPRESA");
		lblNewLabel.setBounds(545, 199, 225, 79);
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		background.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGO");
		lblNewLabel_1.setBounds(75, 40, 122, 49);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		background.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("INICIAR SESION");
		lblNewLabel_1_1.setBounds(75, 112, 257, 49);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		background.add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 255, 400, 1);
		background.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO");
		lblNewLabel_2.setBounds(75, 180, 122, 22);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		background.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_2_1.setBounds(75, 267, 122, 22);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		background.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(517, 11, 294, 466);
		textField.setBackground(new Color(0, 128, 255));
		background.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 213, 154, 31);
		background.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(75, 300, 154, 31);
		background.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(75, 404, 122, 41);
		background.add(panel);
		
		JButton btnNewButton = new JButton("ENTRAR");
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
	}
}
