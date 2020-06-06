package loginfile;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Regform {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regform window = new Regform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Regform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(621, 91, 265, 29);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGISTER AS ADMIN");
		btnNewButton.setBounds(610, 229, 254, 45);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminreg window = new Adminreg();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_2 = new JButton("REGISTER AS STUDENT");
		btnNewButton_2.setBounds(610, 334, 254, 45);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studentreg window = new Studentreg();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("OR CLICK HERE TO LOGIN");
		btnNewButton_4.setBounds(46, 529, 236, 38);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginfile window = new Loginfile();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\Webp.net-resizeimage.jpg"));
		lblNewLabel_1.setBounds(10, 10, 1076, 585);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
