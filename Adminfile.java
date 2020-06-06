package loginfile;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Adminfile {
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminfile window = new Adminfile();
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
	public Adminfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.setBounds(100, 100, 1203, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN SECTION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(462, 36, 395, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("STUDENT DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studetailsadmin frame = new Studetailsadmin();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(479, 180, 196, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("COURSES ENROLLED");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coursesenrolledadmin frame = new Coursesenrolledadmin();
				frame.setVisible(true);	
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_6.setBounds(479, 371, 196, 35);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("LOG OUT");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginfile window = new Loginfile();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnNewButton_8.setBounds(996, 572, 158, 41);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_4 = new JButton("ADD EXAM RESULT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Examstu frame = new Examstu();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_4.setBounds(479, 285, 196, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("FEE DETAILS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedetailsadmin frame = new Feedetailsadmin();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(479, 472, 196, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\suhitha\\Downloads\\Webp.net-resizeimage (3).jpg"));
		lblNewLabel_1.setBounds(10, 10, 1191, 627);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
}