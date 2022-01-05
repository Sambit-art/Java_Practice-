package myjava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class gui3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui3 frame = new gui3();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGui = new JLabel("gui 3");
		lblGui.setBounds(183, 91, 46, 14);
		contentPane.add(lblGui);
		
		
		
		
		
		JButton btnGoGui = new JButton("go gui2");
		btnGoGui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gui2 gogui2=new gui2();
				gogui2.setVisible(true);
				dispose();
			}
		});
		btnGoGui.setBounds(188, 150, 89, 23);
		contentPane.add(btnGoGui);
		
		

	}
	
	
	public gui3() {
			initgui();
			
			}
	public gui3(String para){
		initgui();
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(299, 48, 46, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(para);
		System.out.println(para);
	}
}
