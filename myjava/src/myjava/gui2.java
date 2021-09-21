package myjava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gui2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui2 frame = new gui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	
	public void initgui(){
		String senddata="this is data send from main window";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSecondLavel = new JLabel("SECOND LAVEL");
		lblSecondLavel.setBounds(174, 64, 145, 14);
		contentPane.add(lblSecondLavel);
		
		JButton btnGoBack = new JButton("GO gui3");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg=textField.getText();
				gui3 gogui3= new gui3(msg);
				gogui3.setVisible(true);
				dispose();
				
			}
		});
		btnGoBack.setBounds(174, 120, 89, 23);
		contentPane.add(btnGoBack);
		
		textField = new JTextField();
		textField.setBounds(174, 187, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	public gui2() {
		initgui();
	}
	
	public gui2(String para){
		initgui();
	}
	protected void prevgui() {
		// TODO Auto-generated method stub
		
	}
}
