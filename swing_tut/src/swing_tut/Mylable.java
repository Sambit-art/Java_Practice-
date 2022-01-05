package swing_tut;

import java.awt.Color;
import java.awt.Label;

class Mylabel extends Label{
	private static final long serialVersionUID = 1L;

	public Mylabel(String Label,int x,int y, int width,int height,Color color){
		super.setText(Label);
		super.setForeground(color);
		super.setBounds(x,y,width,height);
	}
	
}