package loginfile;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Coursesenrolledadmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coursesenrolledadmin frame = new Coursesenrolledadmin();
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
	public Coursesenrolledadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT WISE SUBJECTS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(386, 34, 373, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("S.NO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(267, 139, 61, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CODE");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(401, 142, 75, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SUBJECT NAME");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(563, 139, 155, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CREDITS");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(773, 136, 98, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("1.");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(282, 206, 46, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("2.");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(282, 282, 46, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("3.");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(282, 348, 46, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("4.");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(282, 416, 46, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("5.");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(282, 484, 46, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("6.");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(282, 546, 46, 13);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminfile window = new Adminfile();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(26, 619, 98, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("CDC-\r\n204");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(401, 206, 75, 13);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("CDC");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(610, 195, 134, 35);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("1");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(811, 206, 46, 13);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("CSE-202");
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(401, 282, 75, 13);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("MAT-141");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(401, 348, 75, 13);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("CSE-205");
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(401, 417, 75, 13);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("CSE-203");
		lblNewLabel_17.setForeground(Color.WHITE);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(401, 485, 75, 13);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("CSE-204");
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(401, 547, 67, 13);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("WT");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(610, 282, 98, 13);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("DM");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(610, 348, 46, 13);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("OOP");
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(610, 417, 46, 13);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("FLAT");
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(610, 485, 46, 13);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("COA");
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(610, 547, 46, 13);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("4");
		lblNewLabel_24.setForeground(Color.WHITE);
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_24.setBounds(811, 282, 46, 13);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("3");
		lblNewLabel_25.setForeground(Color.WHITE);
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_25.setBounds(811, 348, 46, 13);
		contentPane.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("4");
		lblNewLabel_26.setForeground(Color.WHITE);
		lblNewLabel_26.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_26.setBounds(811, 417, 76, 13);
		contentPane.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("3");
		lblNewLabel_27.setForeground(Color.WHITE);
		lblNewLabel_27.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_27.setBounds(811, 484, 46, 13);
		contentPane.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("4");
		lblNewLabel_28.setForeground(Color.WHITE);
		lblNewLabel_28.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_28.setBounds(811, 546, 46, 13);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon("C:\\Users\\suhitha\\Desktop\\WhatsApp Image 2020-04-26 at 4.31.13 PM.jpeg"));
		lblNewLabel_29.setBounds(10, 10, 1080, 677);
		contentPane.add(lblNewLabel_29);
	}

}
