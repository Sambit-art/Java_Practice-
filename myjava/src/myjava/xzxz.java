package myjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class xzxz {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xzxz window = new xzxz();
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
	public xzxz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelloWorld = new JLabel("HELLO WORLD");
		lblHelloWorld.setBounds(136, 46, 142, 31);
		frame.getContentPane().add(lblHelloWorld);
		
		JButton btnClick = new JButton("Submit");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 String gettext=textField.getText();
			 lblHelloWorld.setText("You Entered    "+gettext);
			 textField.setText("");
			}
		});
		btnClick.setBackground(new Color(51, 255, 153));
		btnClick.setBounds(148, 166, 89, 23);
		frame.getContentPane().add(btnClick);
		
		textField = new JTextField();
		textField.setBounds(109, 97, 169, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
