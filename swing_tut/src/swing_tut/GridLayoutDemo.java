package swing_tut;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class GridLayoutDemo {
	public static void main(String [] args) {
		JFrame frame=new JFrame();
//		frame.setBounds(300,300,800,500);
		frame.setSize(300, 400);
		frame.setLayout(new GridLayout(2,3,5,5));
		frame.add(new Button("first"));
		frame.add(new Button("second"));
		frame.add(new Button("second"));
		frame.add(new Button("second"));
		frame.add(new Button("first"));
		frame.add(new Button("second"));
		frame.add(new Button("second"));
		frame.add(new Button("second"));
		frame.setVisible(true);
	}
}
