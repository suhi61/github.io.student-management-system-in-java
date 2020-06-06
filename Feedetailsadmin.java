package loginfile;

import java.awt.Component;
//import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Feedetailsadmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedetailsadmin frame = new Feedetailsadmin();
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
	public Feedetailsadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1245, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEE DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(523, 50, 197, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(114, 172, 46, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("StudentID");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(114, 237, 90, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Section");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(114, 301, 90, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fee paid");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(114, 368, 90, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fee due");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(114, 439, 90, 13);
		contentPane.add(lblNewLabel_5);
		
		T1 = new JTextField();
		T1.setBounds(228, 170, 166, 21);
		contentPane.add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(228, 234, 166, 21);
		contentPane.add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(228, 299, 166, 19);
		contentPane.add(T3);
		T3.setColumns(10);
		
		T4 = new JTextField();
		T4.setBounds(228, 366, 166, 19);
		contentPane.add(T4);
		T4.setColumns(10);
		
		T5 = new JTextField();
		T5.setBounds(228, 437, 166, 19);
		contentPane.add(T5);
		T5.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					PreparedStatement ps=con.prepareStatement("insert into fee_details values(?,?,?,?,?)");
				    ps.setString(1, T1.getText());
				    ps.setString(2, T2.getText());
				    ps.setString(3, T3.getText());
				    ps.setString(4, T4.getText());
				    ps.setString(5, T5.getText());
				    
				    
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("Details are successfully added");
				    	JOptionPane.showMessageDialog(frame,"Details are successfully added");
				    }
				    else {
				    	System.out.println("failed");
						System.exit(0);
				    }
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(722, 198, 117, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					String queryString="Update fee_details set Name='"+T1.getText()+"' ,Fee paid='"+T4.getText()+"' , Fee due='"+T5.getText()+"' where Name= '"+T1.getText()+"' ";
					PreparedStatement ps=con.prepareStatement(queryString);
				   
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("Details are successfully updated");
				    	JOptionPane.showMessageDialog(frame,"Details are updated");
				    }
				    else {
				    	System.out.println("failed");
						System.exit(0);
				    }
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);

				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(722, 304, 117, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					String queryString="delete from fee_details where Name='"+T1.getText()+"' ";
					PreparedStatement ps=con.prepareStatement(queryString);
				    
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("Details are successfully deleted");
				    	JOptionPane.showMessageDialog(frame,"DETAILS ARE DELETED");
				    }
						
				    else {
				    	System.out.println("failed");
						System.exit(0);
				    }
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
			}
			
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(722, 398, 117, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminfile window = new Adminfile();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setBounds(1035, 593, 117, 33);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\suhitha\\Downloads\\Webp.net-resizeimage (4).jpg"));
		lblNewLabel_6.setBounds(10, 10, 1221, 680);
		contentPane.add(lblNewLabel_6);
	}
}
