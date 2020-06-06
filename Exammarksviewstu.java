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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;



public class Exammarksviewstu extends JFrame {

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
	private JTextField T9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exammarksviewstu  frame = new Exammarksviewstu ();
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
	public Exammarksviewstu () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1176, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXAM MARKS DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(442, 69, 287, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(79, 141, 104, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Subject wise marks");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_3.setBounds(447, 212, 322, 35);
		contentPane.add(lblNewLabel_3);
		
		T1 = new JTextField();
		T1.setBounds(188, 139, 159, 19);
		contentPane.add(T1);
		T1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CDC");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(131, 311, 71, 13);
		contentPane.add(lblNewLabel_4);
		
		T3 = new JTextField();
		T3.setBounds(226, 309, 96, 19);
		contentPane.add(T3);
		T3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("WT");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(131, 378, 46, 13);
		contentPane.add(lblNewLabel_5);
		
		T4 = new JTextField();
		T4.setBounds(226, 376, 96, 19);
		contentPane.add(T4);
		T4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DM");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(131, 441, 46, 13);
		contentPane.add(lblNewLabel_6);
		
		T5 = new JTextField();
		T5.setBounds(226, 435, 96, 19);
		contentPane.add(T5);
		T5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("OOP");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(731, 311, 46, 13);
		contentPane.add(lblNewLabel_7);
		
		T6 = new JTextField();
		T6.setBounds(836, 309, 96, 19);
		contentPane.add(T6);
		T6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("FLAT");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(731, 378, 46, 13);
		contentPane.add(lblNewLabel_8);
		
		T7 = new JTextField();
		T7.setBounds(836, 376, 96, 19);
		contentPane.add(T7);
		T7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("COA");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(731, 441, 46, 13);
		contentPane.add(lblNewLabel_9);
		
		T8 = new JTextField();
		T8.setBounds(836, 439, 96, 19);
		contentPane.add(T8);
		T8.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studentpage window = new Studentpage();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(44, 589, 104, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Function f=new Function();
			    ResultSet rs=null;
				rs=f.find(T1.getText());
				try {
					if(rs.next()) {
						T3.setText(rs.getString("CDC"));
						T4.setText(rs.getString("WT"));
						T5.setText(rs.getString("DM"));
						T6.setText(rs.getString("OOPS"));
						T7.setText(rs.getString("FLAT"));
						T8.setText(rs.getString("COA"));
						double[]R=new double[10];
						 
						R[0]=Double.parseDouble(T3.getText());
						R[1]=Double.parseDouble(T4.getText());
						R[2]=Double.parseDouble(T5.getText());
						R[3]=Double.parseDouble(T6.getText());
						R[4]=Double.parseDouble(T7.getText());
						R[5]=Double.parseDouble(T8.getText());
						
						R[6]=(R[0]+R[1]+R[2]+R[3]+R[3]+R[4]+R[5]);
						String TOTAL=String.format("%.0f", R[6]);
						T9.setText(TOTAL);
						
					}
					else {
						JOptionPane.showMessageDialog(null,"No data for this Student Name");
						
					}
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,e2.getMessage());
					
				}
				}
				 class Function{
					 ResultSet rs=null;
					 public ResultSet find(String s) {
						 try {
								Class.forName("com.mysql.jdbc.Driver");
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","");
								PreparedStatement ps=con.prepareStatement("select * from exam_details where Name =?" );
								ps.setString(1, s);
							    rs=ps.executeQuery();
							    /*while(rs.next()) {
							    	String nameString=rs.getString("Student Name");
							    	String cdcString=rs.getString("CDC");
							    	String wtString=rs.getString("WT");
							    	String dmString=rs.getString("DM");
							    	String oopsString=rs.getString("OOPS");
							    	String flatString=rs.getString("FLAT");
							    	String coaString=rs.getString("COA");
							    	
							    	System.out.println(nameString+" "+cdcString+" "+wtString+" "+dmString+" "+oopsString+" "+flatString+" "+coaString);
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
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(118, 193, 137, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(467, 509, 71, 13);
		contentPane.add(lblNewLabel_2);
		
		T9 = new JTextField();
		T9.setBounds(586, 507, 96, 19);
		contentPane.add(T9);
		T9.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\suhitha\\Downloads\\Webp.net-resizeimage (7).jpg"));
		lblNewLabel_10.setBounds(0, 10, 1205, 626);
		contentPane.add(lblNewLabel_10);
			}
		}
