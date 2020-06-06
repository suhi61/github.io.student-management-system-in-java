package loginfile;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.io.*;
//import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.sql.*;
public class Adminreg {

	JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JPasswordField P1;
	private JTextField T5;
	private JTextField T6;
	private JTextField textField_5;
	private JTextField T4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminreg window = new Adminreg();
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
	public Adminreg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1279, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN REGISTRATION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(459, 50, 377, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(118, 201, 78, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(118, 261, 62, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(118, 315, 62, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(118, 383, 78, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(668, 203, 62, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(666, 261, 46, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(666, 315, 62, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		T1 = new JTextField();
		T1.setBounds(258, 198, 211, 19);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(258, 261, 205, 19);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(258, 313, 205, 19);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		P1 = new JPasswordField();
		P1.setBounds(258, 381, 211, 19);
		frame.getContentPane().add(P1);
		
		T5 = new JTextField();
		T5.setBounds(813, 261, 180, 19);
		frame.getContentPane().add(T5);
		T5.setColumns(10);
		
		T6 = new JTextField();
		T6.setBounds(813, 313, 230, 147);
		frame.getContentPane().add(T6);
		T6.setColumns(10);
		
		T4 = new JTextField();
		T4.setBounds(813, 201, 180, 19);
		frame.getContentPane().add(T4);
		T4.setColumns(10);
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				/* 
				  String a = T1.getText().toString();
				 
				String b = T2.getText().toString();
				String c = T3.getText().toString();
				@SuppressWarnings("deprecation")
				String g = P1.getText().toString();
				String h = T4.getText().toString();
				String i = T5.getText().toString();
				String k = T6.getText().toString();
				
				
				try {
					File file = new File("C:\\users\\suhitha\\Desktop\\Adminreg");
					FileWriter fw= new FileWriter (file,true);
					fw.write(a+"\n");
					fw.write(b+"\n");
					fw.write(c+"\n");
					fw.write(g+"\n");
					fw.write(h+"\n");
					fw.write(i+"\n");
					fw.write(k+"\n");
					fw.write("------------------------\n");
					
					fw.close();
					JOptionPane.showMessageDialog(null,"you are successfully registered");
					System.exit(0);
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"Please enter all the information needed");
					System.exit(0);
				}
				*/
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					PreparedStatement ps=con.prepareStatement("insert into admin_registration(UserName,Name,Email,Password,Gender,Phone,Address)values(?,?,?,?,?,?,?)");
				    ps.setString(1, T1.getText());
				    ps.setString(2, T2.getText());
				    ps.setString(3, T3.getText());
				    ps.setString(4, P1.getText());
				    ps.setString(5, T4.getText());
				    ps.setString(6, T5.getText());
				    ps.setString(7, T6.getText());
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("You are successfully registered");
				    	JOptionPane.showMessageDialog(frame,"You are successfully registered");
				    }
				    else {
				    	System.out.println("registration failed");
				    	JOptionPane.showMessageDialog(frame,"registration failed");
						System.exit(0);
				    }
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
				
				
			}
		});
			
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(555, 563, 142, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(813, 201, 173, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginfile window = new Loginfile();
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(46, 660, 120, 42);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\Webp.net-resizeimage.jpg"));
		lblNewLabel_8.setBounds(10, 23, 1226, 687);
		frame.getContentPane().add(lblNewLabel_8);
	}
}
