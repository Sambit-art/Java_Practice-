package billing_app;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelTwo extends JPanel {
	private JTextField textField;

	
	public panelTwo() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 53, 197, 202);
		add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"sadsdasd"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JLabel lblYourOrderAre = new JLabel("Your orders are");
		lblYourOrderAre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYourOrderAre.setBounds(50, 29, 146, 14);
		add(lblYourOrderAre);
		
		JLabel lblEstimateBill = new JLabel("Estimate Bill");
		lblEstimateBill.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEstimateBill.setBounds(280, 147, 120, 14);
		add(lblEstimateBill);
		
		JLabel label = new JLabel("00");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(329, 199, 46, 14);
		add(label);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerName.setBounds(266, 22, 135, 30);
		add(lblCustomerName);
		
		textField = new JTextField();
		textField.setBounds(280, 63, 120, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrint.setBounds(296, 252, 89, 23);
		add(btnPrint);

	}
}
