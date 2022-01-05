package mongodb_manager;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class threading_practice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					threading_practice window = new threading_practice();
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
	public threading_practice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 643, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
