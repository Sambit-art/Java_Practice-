package color_code_converter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;
	private JTextField getRgb;
	private JTextField getHex;
	private String digitcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	public  String getDigitValue(int intCode) {
		switch (intCode) {
		case 10:
			digitcode="A";
			break;
		case 11:
			digitcode="B";
			break;
		case 12:
			digitcode="C";
			break;
		case 13:
			digitcode="D";
			break;
		case 14:
			digitcode="E";
			break;
		case 15:
			digitcode="F";
			break;
		default:
			digitcode=String.valueOf(intCode);
		}
		return digitcode;
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblColorCodeConverter = new JLabel("Color Code Converter");
		lblColorCodeConverter.setForeground(Color.RED);
		lblColorCodeConverter.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblColorCodeConverter.setBounds(112, 36, 257, 31);
		frame.getContentPane().add(lblColorCodeConverter);
		
		JLabel lblRgbCode = new JLabel("RGB Code");
		lblRgbCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRgbCode.setBounds(76, 119, 124, 31);
		frame.getContentPane().add(lblRgbCode);
		
		getRgb = new JTextField();
		getRgb.setFont(new Font("Tahoma", Font.BOLD, 16));
		getRgb.setBounds(210, 126, 134, 20);
		getRgb.setText("220,20,60");
		frame.getContentPane().add(getRgb);
		getRgb.setColumns(10);
		
		JLabel lblHexCode = new JLabel("HEX Code");
		lblHexCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHexCode.setBounds(76, 190, 124, 31);
		frame.getContentPane().add(lblHexCode);
		
		getHex = new JTextField();
		getHex.setFont(new Font("Tahoma", Font.BOLD, 16));
		getHex.setColumns(10);
		getHex.setBounds(210, 197, 134, 20);
		frame.getContentPane().add(getHex);
		
		JButton btnConvert = new JButton("Convert");
		
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int getRgbLength=getRgb.getText().length();
				int getHexLength=getHex.getText().length();
				
				if (getRgbLength>0) {
					
					String rgbCode=getRgb.getText();
					String[] code=rgbCode.split(",");
					int codeIndex=0;
					String [] createCode=new String[6];
					String getDigitCode="";
					String outputCode="";
					for(int i=0;i<3;i++) {
						int intCode=Integer.parseInt(code[i])/16;
						getDigitCode=getDigitValue(intCode);
						
						createCode[codeIndex]=getDigitCode;
						double reminder=Integer.parseInt(code[i])-16*intCode;
						createCode[codeIndex+1]=getDigitValue((int)reminder);
						codeIndex+=2;
					}
					
					
					for (int j = 0; j < createCode.length; j++) {
						outputCode=outputCode+createCode[j];
					}
					getHex.setText(outputCode);
				} else {
					System.out.println(getHexLength);
				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConvert.setBounds(210, 285, 113, 31);
		frame.getContentPane().add(btnConvert);
	}
}
