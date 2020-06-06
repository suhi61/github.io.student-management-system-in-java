package loginfile;

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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Feedetails_student extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField T2;
	private JTextField textField_1;
	private JTextField T4;
	private JTextField T5;
	private JTextField T6;
	private JTextField T3;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedetails_student frame = new Feedetails_student();
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
	public Feedetails_student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1227, 729);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEE DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(503, 70, 214, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(780, 184, 46, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("StudentID");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(780, 250, 83, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Section");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(780, 314, 77, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fee paid");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(780, 385, 83, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fee due");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setBounds(780, 445, 83, 29);
		contentPane.add(lblNewLabel_5);
		
		T2 = new JTextField();
		T2.setBounds(918, 183, 130, 19);
		contentPane.add(T2);
		T2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(626, 261, 130, -17);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		T4 = new JTextField();
		T4.setBounds(918, 313, 130, 19);
		contentPane.add(T4);
		T4.setColumns(10);
		
		T5 = new JTextField();
		T5.setBounds(918, 387, 130, 19);
		contentPane.add(T5);
		T5.setColumns(10);
		
		T6 = new JTextField();
		T6.setBounds(918, 452, 130, 19);
		contentPane.add(T6);
		T6.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studentpage window = new Studentpage();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(1016, 620, 117, 39);
		contentPane.add(btnNewButton);
		
		T3 = new JTextField();
		T3.setBounds(918, 248, 130, 19);
		contentPane.add(T3);
		T3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(202, 375, 46, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Name");
		lblNewLabel_7.setForeground(Color.MAGENTA);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_7.setBounds(92, 245, 66, 19);
		contentPane.add(lblNewLabel_7);
		
		T1 = new JTextField();
		T1.setBounds(225, 248, 141, 19);
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
						T3.setText(rs.getString("StudentID"));
						T4.setText(rs.getString("Section"));
						T5.setText(rs.getString("Fee paid"));
						T6.setText(rs.getString("Fee due"));
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
					PreparedStatement ps=con.prepareStatement("select * from fee_details where Name=?");
					ps.setString(1, s);
				   rs=ps.executeQuery();
				    
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
				return rs;
				 }
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(126, 314, 117, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\suhitha\\Downloads\\Webp.net-resizeimage (8).jpg"));
		lblNewLabel_8.setBounds(10, 10, 1203, 682);
		contentPane.add(lblNewLabel_8);
	}
}
