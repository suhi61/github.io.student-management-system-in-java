package loginfile;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.FileNotFoundException;  // Import this class to handle errors
//import java.io.FileReader;
//import java.util.Scanner;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;

public class Studentprofile extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T6;
	private JTextField T8;
	private JTextField T9;
	private JTextField T5;
	private JTextField T7;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentprofile frame = new Studentprofile();
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
	public Studentprofile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1281, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT PROFILE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(492, 27, 377, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(446, 173, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("StudentID");
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(446, 263, 64, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(446, 218, 46, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Section");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(446, 306, 46, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(446, 348, 96, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(446, 395, 46, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(446, 441, 46, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(446, 486, 77, 13);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studentpage window = new Studentpage();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(1129, 647, 107, 38);
		contentPane.add(btnNewButton);
		
		T2 = new JTextField();
		T2.setBounds(595, 171, 213, 19);
		contentPane.add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(595, 216, 213, 19);
		contentPane.add(T3);
		T3.setColumns(10);
		
		T4 = new JTextField();
		T4.setBounds(595, 257, 213, 19);
		contentPane.add(T4);
		T4.setColumns(10);
		
		T6 = new JTextField();
		T6.setBounds(595, 346, 213, 19);
		contentPane.add(T6);
		T6.setColumns(10);
		
		T8 = new JTextField();
		T8.setBounds(593, 439, 176, 19);
		contentPane.add(T8);
		T8.setColumns(10);
		
		T9 = new JTextField();
		T9.setBounds(595, 486, 213, 178);
		contentPane.add(T9);
		T9.setColumns(10);
		
		T5 = new JTextField();
		T5.setBounds(595, 304, 213, 19);
		contentPane.add(T5);
		T5.setColumns(10);
		
		T7 = new JTextField();
		T7.setBounds(595, 389, 174, 19);
		contentPane.add(T7);
		T7.setColumns(10);
		
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(96, 532, 77, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(991, 98, 46, 13);
		contentPane.add(lblNewLabel_10);
		
		T1 = new JTextField();
		T1.setBounds(183, 530, 107, 19);
		contentPane.add(T1);
		T1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Function f=new Function();
				ResultSet rs=null;
				rs=f.find(T1.getText());
				try {
					if(rs.next()) {
						T2.setText(rs.getString("Name"));
						T3.setText(rs.getString("Email"));
						T4.setText(rs.getString("StudentID"));
						T5.setText(rs.getString("Section"));
						T6.setText(rs.getString("Date of birth"));
						T7.setText(rs.getString("Gender"));
						T8.setText(rs.getString("Phone"));
						T9.setText(rs.getString("Address"));
					}
					else {
						JOptionPane.showMessageDialog(null,"No data for this Name");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,e2.getMessage());
					// TODO: handle exception
				}
			}
			class Function{
				ResultSet rs=null;
				 public ResultSet find(String s) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					PreparedStatement ps=con.prepareStatement("select * from student_details where Name=?");
					ps.setString(1, s);
				   rs=ps.executeQuery();
				    /*while(rs.next()) {
				    	String nameString=rs.getString("Name");
				    	String emailString=rs.getString("Email");
				    	String idString=rs.getString("StudentID");
				    	String secString=rs.getString("Section");
				    	String dateString=rs.getString("Date of birth");
				    	String genderString=rs.getString("Gender");
				    	String phoneString=rs.getString("Phone");
				    	String addressString=rs.getString("Address");
				    	System.out.println(nameString+" "+emailString+" "+idString+" "+secString+" "+dateString+" "+genderString+" "+phoneString+" "+addressString);
				    }
				    */
				    
				    
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
				return rs;
				 }
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(128, 590, 107, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(570, 307, 46, 13);
		contentPane.add(lblNewLabel_11);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\WhatsApp Image 2020-04-26 at 1.42.09 PM.jpeg"));
		label.setBounds(10, 10, 1247, 715);
		contentPane.add(label);
	}
}
