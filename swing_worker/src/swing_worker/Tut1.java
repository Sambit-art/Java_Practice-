package swing_worker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class Tut1 {

	private JFrame frame;
	public JLabel statusVar;
	public JLabel perVer;
	public JProgressBar progressBar;
	static Tut1 window;
	public int LOOP=20;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Tut1();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void start() {
		SwingWorker<Boolean,Integer> sw= new SwingWorker<Boolean, Integer>(){

			@Override
			protected Boolean doInBackground() throws Exception {
				
				for(int i=0;i<=LOOP;i++) {
					Thread.sleep(100);
					System.out.println(i);
					publish(i);
				};
				
				return true;
			}

			
			
			@Override
			protected void process(List<Integer> chunks) {
				int value = chunks.get(chunks.size()-1);
				perVer.setText((value)+"%");
				progressBar.setValue(value);
			}



			@Override
			protected void done() {
				try {
					Boolean status=get();
					statusVar.setText("complete with status "+status);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		sw.execute();
		
	}
	
	public Tut1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStatus = new JLabel("status");
		lblStatus.setBounds(92, 65, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblPercentComplete = new JLabel("Percent complete");
		lblPercentComplete.setBounds(71, 142, 140, 14);
		frame.getContentPane().add(lblPercentComplete);
		
		statusVar = new JLabel("");
		statusVar.setBounds(213, 65, 227, 14);
		frame.getContentPane().add(statusVar);
		
		perVer = new JLabel("0%");
		perVer.setBounds(221, 142, 46, 14);
		frame.getContentPane().add(perVer);
		
		JButton btnSubmit = new JButton("Start");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 window.start();
			}
		});
		btnSubmit.setBounds(213, 218, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(65, 278, 389, 14);
		progressBar.setMaximum(LOOP);
		progressBar.setMinimum(0);
		progressBar.setValue(0);
		frame.getContentPane().add(progressBar);
		
	}
}
