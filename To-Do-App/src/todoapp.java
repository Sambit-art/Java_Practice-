import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JSeparator;



public class todoapp {

	private JFrame frame;
	private JTextField getItem;

	/**
	 * Launch the application.
	 */
	
	public void updateList() {
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					todoapp window = new todoapp();
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
	public todoapp() {
		initialize();
		
	}
	
	@SuppressWarnings("unchecked")
	private void reloadApp(JList item,List <String> listitem) {
		
			item.setModel(new AbstractListModel() {
				Object[] values = listitem.toArray();
				public int getSize() {
					return values.length;
				}
				public Object getElementAt(int index) {
					return values[index];
				}
			});
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setSelectionBackground(Color.RED);
		list.setBackground(Color.LIGHT_GRAY);
		list.setBounds(new Rectangle(10, 10, 10, 10));
		list.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		List <String> l1= new ArrayList<String>();
		
		
		
		list.setModel(new AbstractListModel() {
			Object[] values = l1.toArray();
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(23, 11, 198, 320);
		frame.getContentPane().add(list);
		
		JButton removeItemButton = new JButton("Remove Item");
		removeItemButton.setFocusable(false);
		removeItemButton.setBackground(Color.RED);
		removeItemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String itemToRemove= (String) list.getSelectedValue();
				l1.remove(itemToRemove);
				reloadApp(list,l1);
			}
		});
		
		removeItemButton.setBounds(255, 40, 162, 23);
		frame.getContentPane().add(removeItemButton);
		
		getItem = new JTextField();
		getItem.setBounds(255, 196, 162, 20);
		frame.getContentPane().add(getItem);
		getItem.setColumns(10);
		
		JButton addItemButton_1 = new JButton("Add Item");
		addItemButton_1.setBackground(Color.GREEN);
		
		addItemButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String itemToAdd=getItem.getText();
				l1.add(itemToAdd);
				getItem.setText("");
				reloadApp(list,l1);
			}
		});
		addItemButton_1.setBounds(255, 248, 162, 23);
		frame.getContentPane().add(addItemButton_1);
		
		
	}
}
