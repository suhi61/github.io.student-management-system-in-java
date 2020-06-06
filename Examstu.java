package loginfile;


import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
//import java.io.File;
//port java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.sql.*;
import java.awt.Color;


public class Examstu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField T1;
	private JTextField T3;
	private JTextField T4;
	private JTextField T5;
	private JTextField T6;
	private JTextField T7;
	private JTextField T8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examstu frame = new Examstu();
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
	public Examstu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1176, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXAM MARKS DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(438, 51, 383, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(85, 252, 104, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Subject wise marks");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(654, 161, 322, 26);
		contentPane.add(lblNewLabel_3);
		
		T1 = new JTextField();
		T1.setBounds(192, 250, 159, 19);
		contentPane.add(T1);
		T1.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(561, 221, 96, 19);
		contentPane.add(T3);
		T3.setColumns(10);
		
		T4 = new JTextField();
		T4.setBounds(561, 278, 96, 19);
		contentPane.add(T4);
		T4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DM");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(476, 341, 46, 13);
		contentPane.add(lblNewLabel_6);
		
		T5 = new JTextField();
		T5.setBounds(561, 341, 96, 19);
		contentPane.add(T5);
		T5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("OOP");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(822, 223, 46, 13);
		contentPane.add(lblNewLabel_7);
		
		T6 = new JTextField();
		T6.setBounds(920, 221, 96, 19);
		contentPane.add(T6);
		T6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("FLAT");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(822, 280, 46, 13);
		contentPane.add(lblNewLabel_8);
		
		T7 = new JTextField();
		T7.setBounds(920, 280, 96, 19);
		contentPane.add(T7);
		T7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("COA");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(822, 341, 46, 13);
		contentPane.add(lblNewLabel_9);
		
		T8 = new JTextField();
		T8.setBounds(920, 339, 96, 19);
		contentPane.add(T8);
		T8.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				/*
				 String a = T1.getText().toString();
				 
				String b = T2.getText().toString();
				String c = T3.getText().toString();
				String d = T4.getText().toString();
				String f = T5.getText().toString();
				String g = T6.getText().toString();
				String h = T7.getText().toString();
				String i = T8.getText().toString();
				
				
				try {
					File file = new File("C:\\users\\suhitha\\Desktop\\Examstuadmin");
					FileWriter fw= new FileWriter (file,true);
					fw.write(a+"\n");
					fw.write(b+"\n");
					fw.write(c+"\n");
					fw.write(d+"\n");
					fw.write(f+"\n");
					fw.write(g+"\n");
					fw.write(h+"\n");
					fw.write(i+"\n");
					fw.write("------------------------\n");
					
					fw.close();
					JOptionPane.showMessageDialog(null,"DATA added successfully");
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
					PreparedStatement ps=con.prepareStatement("insert into exam_details values(?,?,?,?,?,?,?)");
				    ps.setString(1, T1.getText());
				    ps.setString(2, T3.getText());
				    ps.setString(3, T4.getText());
				    ps.setString(4, T5.getText());
				    ps.setString(5, T6.getText());
				    ps.setString(6, T7.getText());
				    ps.setString(7, T8.getText());
				    
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("Details are successfully added");
						JOptionPane.showMessageDialog(frame,"Details are successfully added");
				    }
				    else {
				    	System.out.println("failed");
				    	JOptionPane.showMessageDialog(frame,"please fill all the details");
						System.exit(0);
				    }
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBounds(709, 446, 129, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminfile window = new Adminfile();
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(998, 577, 104, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("CDC");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(476, 223, 46, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("WT");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(476, 280, 46, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					@SuppressWarnings("unused")
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					T1.setText("");
					T3.setText("");
					T4.setText("");
					T5.setText("");
					T6.setText("");
					T7.setText("");
					T8.setText("");
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_2.setBounds(709, 526, 129, 35);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\WhatsApp Image 2020-04-26 at 3.50.15 PM.jpeg"));
		lblNewLabel_2.setBounds(-17, 10, 1179, 786);
		contentPane.add(lblNewLabel_2);
			}
		}
