package swing_tut;

import java.awt.Button;
import java.awt.Color;

public class MyButton extends Button{
	private static final long serialVersionUID = 1L;

	public MyButton(String string, int x, int y, int width, int height) {
		super.setBackground(Color.RED);
		super.setLabel(string);
		super.setBounds(x,y,width,height);
	}

}
