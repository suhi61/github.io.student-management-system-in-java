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
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;

public class Studetailsadmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T7;
	private JTextField T8;
	private JTextField T4;
	private JTextField T6;
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studetailsadmin frame = new Studetailsadmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Studetailsadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1281, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("STUDENT PROFILE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(492, 52, 377, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(115, 173, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("StudentID");
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(113, 261, 64, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(115, 218, 46, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Section");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(113, 306, 46, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(115, 348, 96, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(115, 391, 46, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(115, 441, 46, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(115, 486, 77, 13);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminfile window = new Adminfile();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(1113, 640, 107, 38);
		contentPane.add(btnNewButton);
		
		T1 = new JTextField();
		T1.setBounds(223, 171, 213, 19);
		contentPane.add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(223, 216, 213, 19);
		contentPane.add(T2);
		T2.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(223, 261, 213, 19);
		contentPane.add(T3);
		T3.setColumns(10);
		
		JTextField T5 = new JTextField();
		T5.setBounds(223, 346, 213, 19);
		contentPane.add(T5);
		T5.setColumns(10);
		
		T7 = new JTextField();
		T7.setBounds(223, 439, 176, 19);
		contentPane.add(T7);
		T7.setColumns(10);
		
		T8 = new JTextField();
		T8.setBounds(223, 486, 213, 178);
		contentPane.add(T8);
		T8.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 /*
				String a = T1.getText().toString(); 
				String b = T2.getText().toString();
				String c = T3.getText().toString();
				String h = T4.getText().toString();
				String i = T5.getText().toString();
				String k = T6.getText().toString();
				String l = T7.getText().toString();
				String m = T8.getText().toString();
				String n = T9.getText().toString();
				
				@SuppressWarnings("deprecation")
				String g = passwordField.getText().toString();
				
				try {
					File file = new File("C:\\users\\suhitha\\Desktop\\Studentdetailsadmin");
					FileWriter fw= new FileWriter (file,true);
					fw.write(a+"\n");
					fw.write(b+"\n");
					fw.write(c+"\n");
					fw.write(h+"\n");
					fw.write(i+"\n");
					fw.write(k+"\n");
					fw.write(l+"\n");
					fw.write(m+"\n");
					fw.write(n+"\n");
					fw.write(g+"\n");
					
					fw.write("------------------------\n");
					
					fw.close();
					JOptionPane.showMessageDialog(null,"you have successfully added the data");
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
					PreparedStatement ps=con.prepareStatement("insert into student_details values(?,?,?,?,?,?,?,?)");
				    ps.setString(1, T1.getText());
				    ps.setString(2, T2.getText());
				    ps.setString(3, T3.getText());
				    ps.setString(4, T4.getText());
				    ps.setString(5, T5.getText());
				    ps.setString(6, T6.getText());
				    ps.setString(7, T7.getText());
				    ps.setString(8, T8.getText());
				    
				    int x =ps.executeUpdate();
				    if(x>0) {
				    	System.out.println("Details are successfully added");
				    	JOptionPane.showMessageDialog(frame,"DETAILS ARE added");
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
		btnNewButton_1.setBounds(773, 247, 132, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					String queryString="Update student_details set Name='"+T1.getText()+"' ,Section='"+T4.getText()+"' ,  Phone='"+T7.getText()+"' where Name= '"+T1.getText()+"' ";
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
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(773, 377, 132, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
					String queryString="delete from student_details where Name='"+T1.getText()+"' ";
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
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_3.setBounds(773, 506, 132, 38);
		contentPane.add(btnNewButton_3);
		
		T4 = new JTextField();
		T4.setBounds(223, 304, 213, 19);
		contentPane.add(T4);
		T4.setColumns(10);
		
		T6 = new JTextField();
		T6.setBounds(223, 389, 176, 19);
		contentPane.add(T6);
		T6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\suhitha\\Downloads\\Webp.net-resizeimage (2).jpg"));
		lblNewLabel_11.setBounds(0, 10, 1257, 692);
		contentPane.add(lblNewLabel_11);
	}
}



