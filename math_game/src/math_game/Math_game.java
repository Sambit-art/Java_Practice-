package math_game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Math_game {

	private JFrame frame;
	private JTextField ansInput;
	private JLabel lblQuestion;
	private JLabel questionOutput;
	private JLabel lblAnswer;
	private JLabel ansOutput;
	private JButton submitButton;
	private JButton newMath;
	
	
	
	public static String[] nums= {"1","2","3","4","5","6","7","8","9"};
	public static String[] operaters= {"+","-","*","/"};
	public int result;
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public static String randomInt() {
		int char1=new Random().nextInt(nums.length);
		int char2=new Random().nextInt(nums.length);
		return nums[char1]+nums[char2];
		
	}
	
	public static String getOpearter() {
		int char3=new Random().nextInt(operaters.length);
		return operaters[char3];
		
	}
	
	
	public void getExpression() {
		int num1=Integer.parseInt(randomInt());
		int num2=Integer.parseInt(randomInt());
		String operater=getOpearter();
		questionOutput.setText(num1 + "   "+operater+"   "+num2);
		switch (operater) {
		case "+":
			setResult(num1+num2);
			break;
		case "-":
			setResult(num1-num2);
			break;
		case "*":
			setResult(num1*num2);
			break;
		case "/":
			setResult(num1/num2);
			break;
		default:
			break;
		}
	}
	
	
	public static void main(String[] args) {
		randomInt();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math_game window = new Math_game();
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
	public Math_game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 540, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuestion.setBounds(62, 66, 72, 25);
		frame.getContentPane().add(lblQuestion);
		
		questionOutput = new JLabel("");
		questionOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		questionOutput.setBounds(180, 66, 188, 25);
		frame.getContentPane().add(questionOutput
				);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnswer.setBounds(62, 134, 72, 25);
		frame.getContentPane().add(lblAnswer);
		
		ansInput = new JTextField();
		ansInput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ansInput.setBounds(180, 138, 97, 21);
		frame.getContentPane().add(ansInput);
		ansInput.setColumns(10);
		
		ansOutput = new JLabel("");
		ansOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ansOutput.setBounds(122, 242, 159, 30);
		frame.getContentPane().add(ansOutput);
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String input = ansInput.getText();
				if(Integer.parseInt(input)==getResult()) {
					ansOutput.setText("correct ("+getResult()+")");
					getExpression();
					ansInput.setText("");
				}else {
					ansOutput.setText("wrong ("+getResult()+")");
				}
			}
		});
		submitButton.setBounds(402, 137, 89, 23);
		frame.getContentPane().add(submitButton);
		
		newMath = new JButton("new");
		newMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getExpression();
			}
		});
		newMath.setBounds(402, 69, 89, 23);
		frame.getContentPane().add(newMath);
	}
}
