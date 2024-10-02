package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class intefaz1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intefaz1 frame = new intefaz1();
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
	public intefaz1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("dos");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("dos");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTres = new JLabel("tres");
		lblTres.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTres);
		
		JLabel lblCuatro = new JLabel("cuatro");
		lblCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCuatro);
		
		JLabel lblCinco = new JLabel("cinco");
		lblCinco.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCinco);
	}

}
