package swing_practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frm{
	public static JFrame jf;
	private static JPanel contentPane1;
	private JPanel panel2;
	private static JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jf=new JFrame();
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					jf.setBounds(100, 100, 450, 300);
					contentPane1 = new JPanel();
					contentPane1.setPreferredSize(new Dimension(235, 100));
					contentPane1.setBackground(Color.RED);
					JPanel contentPane2 = new JPanel();
					contentPane2.setPreferredSize(new Dimension(200,100));
					contentPane2.setBackground(Color.BLUE);
//					setContentPane(contentPane1);
					jf.getContentPane().add(contentPane1,BorderLayout.WEST);
					jf.getContentPane().add(contentPane2,BorderLayout.EAST);
					contentPane1.setLayout(null);
					JButton btn1=new JButton("Click me");
					btn1.setBounds(14, 5, 71, 23);
					contentPane1.add(btn1);
					JButton btn2=new JButton("Click me 2");
					btn2.setBounds(127, 5, 79, 23);
					contentPane1.add(btn2);
					
					textField = new JTextField();
					textField.setBounds(56, 94, 86, 20);
					contentPane1.add(textField);
					textField.setColumns(10);
					
					JLabel lblUsername = new JLabel("Username");
					lblUsername.setBounds(67, 54, 75, 14);
					contentPane1.add(lblUsername);
					
					JLabel out = new JLabel("");
					out.setBounds(31, 183, 175, 23);
					contentPane1.add(out);
					
					JButton btn3=new JButton("Click me to remove");
					btn3.setBounds(38, 64, 123, 23);
					btn3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							contentPane1.remove(btn2);
							contentPane1.revalidate();
							contentPane1.repaint();
						}
					});
					contentPane2.setLayout(null);
					contentPane2.add(btn3);
					
					JButton btn4=new JButton("Click me to Forward");
					btn4.setBounds(34, 171, 127, 23);
					btn4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
//							contentPane1.add(btn2);
							String username=textField.getText();
							contentPane1.removeAll();
							out.setText("your username is  "+username);
							contentPane1.add(out);
							contentPane1.revalidate();
							contentPane1.repaint();
							
						}
					});
					contentPane2.add(btn4);
					
					jf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setVisible(boolean b) {
		jf.setVisible(true);
		
	}
}
