package swing_practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm2 extends JFrame {
	public frm2() {
	}

	private static JPanel contentPane1;
	public static JFrame jf2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jf2=new JFrame();
					jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					jf2.setBounds(100, 100, 450, 300);
					contentPane1 = new JPanel();
					contentPane1.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
					contentPane1.setPreferredSize(new Dimension(100,100));
					contentPane1.setBackground(Color.RED);
					
					jf2.getContentPane().add(contentPane1,BorderLayout.WEST);
					JButton btn1=new JButton("back");
					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							contentPane1.add(btn1);
							contentPane1.revalidate();
							contentPane1.repaint();
							frm fm1=new frm();
							fm1.setVisible(true);
							
						}
					});
					contentPane1.add(btn1);
					
					
					jf2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
