package loginfile;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Loginfile {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginfile window = new Loginfile();
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
	
	public Loginfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 911, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(250, 131, 150, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(424, 136, 216, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel temp2JLabel = new JLabel("Select any option");
		temp2JLabel.setVisible(false);
		temp2JLabel.setBounds(200,230,150,20);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(150,230,200,20);
		panel2.setVisible(false);
		panel2.add(temp2JLabel);

		lblNewLabel_1.setBounds(250, 191, 121, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton r1 = new JRadioButton("Admin");
		r1.setBackground(Color.ORANGE);
		r1.setForeground(new Color(0, 0, 0));
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected());
				{
					r1.setSelected(true);
					
					}
			}
		});
		r1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		r1.setBounds(303, 251, 101, 33);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Student");
		r2.setBackground(Color.ORANGE);
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(r2.isSelected());
				{
					r2.setSelected(true);
					r1.setSelected(false);
				}
			}
		});
		r2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		r2.setBounds(488, 251, 121, 33);
		frame.getContentPane().add(r2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		passwordField.setBounds(424, 189, 216, 19);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Student Management System - April 2020");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(488, 528, 234, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LOG IN FORM");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_3.setBounds(303, 38, 316, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("CREATE AN ACCOUNT?");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Regform window = new Regform();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(10, 517, 290, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//if(idString.equals("AP1234")&& passwordString.equals("srm"))
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					 Statement st=con.createStatement();
					
					@SuppressWarnings("deprecation")
					String sqlString="Select * from login where UserName='"+textField.getText()+"' and Password='"+passwordField.getText().toString()+"'";
					ResultSet rs= st.executeQuery(sqlString);
					if(rs.next()) {
						
						JOptionPane.showMessageDialog(frame,"you are successfully logined");
					if(r1.isSelected())
					{
						Adminfile window = new Adminfile();
						window.frame.setVisible(true);
					}
					
					else if(r2.isSelected())
					{
						Studentpage window = new Studentpage();
						window.frame.setVisible(true);
						
					}
					}
					else
					{
						JOptionPane.showMessageDialog(frame,"INVALID DETAILS");
					}
					con.close();
				}
					
				 catch (Exception e2) {
					 System.out.print(e2);
				 }
					// TODO: handle exception
				}
				
		});
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(358, 324, 150, 38);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(Color.ORANGE);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\WhatsApp Image 2020-04-26 at 10.13.43 AM.jpeg"));
		lblNewLabel_4.setBounds(-149, -21, 1036, 640);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(751, 82, 46, 13);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
