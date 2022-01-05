/**
 * This is for practice java swing code
 * dated-17-12-2021
 */
package swing_tut;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import swing_tut.MyButton;
import swing_tut.Mylabel;

public class nullLayout {

	
	
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setBounds(300,300,800,500);
		frame.setLayout(null);
		frame.setResizable(false);
//		MyButton btn1=new MyButton("button 1",100,100,100,20);
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("hello world");
//				
//			}
//		});
//		frame.add(btn1);
//		frame.add(new MyButton("button 2", 200, 200, 100,30));
//		frame.add(new Mylabel("welcome", 400, 200, 100,30,Color.BLUE));
//		frame.add(new Mylabel("welcome", 600, 200, 100,30,Color.BLUE));

		JPanel jPanel=new JPanel();
		jPanel.setBounds(100,100,600,250);
		jPanel.setBackground(Color.PINK);
		jPanel.setLayout(null);
		MyButton btn1=new MyButton("btn1", 20, 20, 100, 30);
		jPanel.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Label nLabel=new Mylabel("pressed", 40, 50, 50, 30, Color.RED);
				jPanel.add(nLabel);
				
			}
		});
		jPanel.add(new MyButton("button 2", 200, 200, 100,30));
		jPanel.add(new Mylabel("welcome", 400, 200, 100,30,Color.BLUE));
		frame.add(jPanel);
		frame.setVisible(true);
	}

}
