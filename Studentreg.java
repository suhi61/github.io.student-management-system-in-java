package loginfile;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.io.*;
//import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.sql.*;

public class Studentreg{

	JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T5;
	private JTextField T6;
	private JTextField T7;
	private JPasswordField p1;
	private JTextField T8;
	private JTextField T9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentreg window = new Studentreg();
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
	public Studentreg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1149, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(379, 44, 399, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(117, 165, 70, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(117, 217, 58, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(117, 267, 46, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("StudentID");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(117, 319, 70, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Section");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(117, 375, 58, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Date of Birth");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(544, 169, 85, 17);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Phone ");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(544, 271, 58, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(539, 321, 63, 21);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("REGISTER");
		btnNewButton_2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				/*
				String a = T1.getText().toString();
				String b = T2.getText().toString();
				String c = T3.getText().toString();
				String d = T4.getText().toString();
				String f = T8.getText().toString();
				@SuppressWarnings("deprecation")
				String g = p1.getText().toString();
				String h = T5.getText().toString();
				String i = T9.getText().toString();
				String k = T6.getText().toString();
				String l = T7.getText().toString();
				
				
				try {
					File file = new File("C:\\Users\\suhitha\\Desktop\\STUdent registration.txt");
					FileWriter fw= new FileWriter (file,true);
					fw.write(a+"\n");
					fw.write(b+"\n");
					fw.write(c+"\n");
					fw.write(d+"\n");
					fw.write(f+"\n");
					fw.write(g+"\n");
					fw.write(h+"\n");
					fw.write(i+"\n");
					fw.write(k+"\n");
					fw.write(l+"\n");
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
					PreparedStatement ps=con.prepareStatement("insert into student_registration values(?,?,?,?,?,?,?,?,?,?)");
				    ps.setString(1, T1.getText());
				    ps.setString(2, T2.getText());
				    ps.setString(3, T3.getText());
				    ps.setString(4, T4.getText());
				    ps.setString(5, T8.getText());
				    ps.setString(6, p1.getText());
				    ps.setString(7, T5.getText());
				    ps.setString(8, T9.getText());
				    ps.setString(9, T6.getText());
				    ps.setString(10,T7.getText());
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("You are successfully registered");
				    	JOptionPane.showMessageDialog(frame,"You are successfully registered");
				    }
				    else {
				    	System.out.println("registration failed");
						System.exit(0);
						JOptionPane.showMessageDialog(frame,"registration failed");
				    }
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(471, 540, 131, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		T1 = new JTextField();
		T1.setBounds(236, 167, 190, 19);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(236, 219, 190, 19);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(236, 269, 190, 19);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		T4 = new JTextField();
		T4.setBounds(236, 321, 190, 19);
		frame.getContentPane().add(T4);
		T4.setColumns(10);
		
		T5 = new JTextField();
		T5.setBounds(685, 167, 126, 19);
		frame.getContentPane().add(T5);
		T5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gender");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_10.setBounds(544, 222, 70, 16);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Enter password");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_11.setBounds(117, 417, 118, 21);
		frame.getContentPane().add(lblNewLabel_11);
		
		T6 = new JTextField();
		T6.setBounds(685, 269, 126, 19);
		frame.getContentPane().add(T6);
		T6.setColumns(10);
		
		T7 = new JTextField();
		T7.setBounds(685, 321, 241, 119);
		frame.getContentPane().add(T7);
		T7.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(236, 419, 190, 19);
		frame.getContentPane().add(p1);
		
		T8 = new JTextField();
		T8.setBounds(236, 377, 190, 19);
		frame.getContentPane().add(T8);
		T8.setColumns(10);
		
		T9 = new JTextField();
		T9.setBounds(685, 219, 126, 19);
		frame.getContentPane().add(T9);
		T9.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginfile window = new Loginfile();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(33, 592, 111, 40);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\Webp.net-resizeimage.jpg"));
		lblNewLabel_6.setBounds(0, 10, 1125, 632);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
