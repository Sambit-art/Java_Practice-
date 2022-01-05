import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class tut1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tut1 window = new tut1();
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
	public tut1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 656, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Enter First Number");
		textField.setBounds(89, 58, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter Second Number");
		textField_1.setColumns(10);
		textField_1.setBounds(356, 58, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setToolTipText("Result");
		textField_2.setColumns(10);
		textField_2.setBounds(233, 182, 113, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFirstNumber.setForeground(Color.WHITE);
		lblFirstNumber.setBounds(80, 28, 113, 14);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setForeground(Color.WHITE);
		lblSecondNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSecondNumber.setBounds(341, 30, 127, 14);
		frame.getContentPane().add(lblSecondNumber);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(Color.WHITE);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(259, 157, 65, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(89, 236, 509, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAddNumber = new JButton("Add Number");
		btnAddNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num1=Integer.parseInt(textField.getText());
					int num2=Integer.parseInt(textField_1.getText());
					int result=num1+num2;
					textField_2.setText(String.valueOf(result));
					
					
				} catch (Exception e) {
					lblNewLabel.setText(e.toString());
				}
			}
		});
		btnAddNumber.setToolTipText("Click to add");
		btnAddNumber.setBounds(233, 108, 113, 23);
		frame.getContentPane().add(btnAddNumber);
		
		
		
	}
}
