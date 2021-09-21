package billing_app;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class tut1 {

	private JFrame frame;
	private JPanel t1,t2,t3,mainPanel,secondPanel;
	private JTabbedPane tabbedPane;
	private JList coffieList;
	private JList snacksList;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnAddItem;
	private JButton btnRemoveItem;
	private JButton btnSubmit;
	private JLabel getValue;
	List <String> wishList;
	String getSelectedCoffie;
	String getSelectedSnacks;
	private JPanel bottomPanel;
	static Bill bill;
	static Price price;
	static createPdf cPdf;
	private JLabel lblTesteIt;
	private JSlider slider ;
	static regexUse regexUse;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		bill= new Bill();
		price=new Price();
		cPdf=new createPdf();
		regexUse=new regexUse();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tut1 window = new tut1();
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
	public tut1() {
		wishList= new ArrayList<String>();
		initialize();
	}

	public void reloadList(JList item,List <String> listitem) {
		
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
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 767, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		mainPanel.setBounds(10, 78, 741, 439);
		bottomPanel = new JPanel();
		bottomPanel.setBounds(10, 367, 721, 35);
		JButton btnClick = new JButton("click");
		btnClick.setBounds(555, 119, 89, 23);
		frame.getContentPane().setLayout(null);
		mainPanel.setLayout(null);
		getValue = new JLabel("00");
		getValue.setBounds(694, 11, 27, 23);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 495, 358);
		
		t1=new JPanel();
		t2=new JPanel();
		t3=new JPanel();
		t2.setLayout(null);
		t1.setLayout(null);
		
		coffieList = new JList();
		coffieList.setBorder(UIManager.getBorder("Button.border"));
		coffieList.setFont(new Font("Tahoma", Font.BOLD, 16));
		coffieList.setSelectionBackground(Color.GREEN);
		coffieList.setBackground(Color.WHITE);
		coffieList.setBounds(new Rectangle(43, 10, 10, 10));
		coffieList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		coffieList.setBounds(20, 104, 153, 277);
		coffieList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Arabica-Arabica  150/-", "Black-coffee   120/-", "Latte    100/-","Cappuccino    80/-","Americano    130/-","Espresso    70/-","Doppio    90/-"};
			
		});
		JScrollPane scrollableTextArea1 = new JScrollPane(coffieList);  
		scrollableTextArea1.setBounds(0, 5, 490, 314);
		scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
		scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	   t1.add(scrollableTextArea1);
	   
	   
	   snacksList = new JList();
	   snacksList.setBorder(UIManager.getBorder("Button.border"));
	   snacksList.setFont(new Font("Tahoma", Font.BOLD, 16));
	   snacksList.setSelectionBackground(Color.GREEN);
	   snacksList.setBackground(Color.WHITE);
	   snacksList.setBounds(new Rectangle(43, 10, 10, 10));
	   snacksList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   snacksList.setBounds(20, 104, 153, 277);
	   snacksList.setModel(new AbstractListModel() {
	   	String[] values = new String[] {"Paneer-tikka    125/-", "Handvo    54/-", "Corn-cutlet    40/-", "Corn-patties   90/-", "Pav-bhaji   50/-"};
	   	public int getSize() {
	   		return values.length;
	   	}
	   	public Object getElementAt(int index) {
	   		return values[index];
	   	}
	   });
		JScrollPane scrollableTextArea2 = new JScrollPane(snacksList);  
		scrollableTextArea2.setBounds(0, 5, 490, 314);
		scrollableTextArea2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
		scrollableTextArea2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	   t2.add(scrollableTextArea2);
	   
		tabbedPane.add("coffie",t1);
		tabbedPane.add("Snacks",t2);
		mainPanel.add(tabbedPane);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(515, 31, 226, 338);
		mainPanel.add(scrollPane);
		
		list = new JList();
		
		scrollPane.setViewportView(list);
		
		btnAddItem = new JButton("Add Item To List");
		btnAddItem.setBounds(10, 11, 111, 23);
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int value;
					int getOrderItem;
					switch (tabbedPane.getSelectedIndex()) {
					case 0:
						getOrderItem=slider.getValue();
						getSelectedCoffie=coffieList.getSelectedValue().toString();
						regexUse.setVal(getSelectedCoffie+"   x  "+String.valueOf(getOrderItem));
						bill.inc(price.setPrice(getSelectedCoffie),getOrderItem);
						value=bill.val;
						getValue.setText(String.valueOf(value));
						wishList.add(getSelectedCoffie+" x "+getOrderItem);
						reloadList(list,wishList);
						slider.setValue(0);
						break;
					case 1:
						getOrderItem=slider.getValue();
						getSelectedSnacks=snacksList.getSelectedValue().toString();
						regexUse.setVal(getSelectedSnacks+"   x  "+String.valueOf(getOrderItem));
						bill.inc(price.setPrice(getSelectedSnacks),getOrderItem);
						value=bill.val;
						getValue.setText(String.valueOf(value));
						wishList.add(getSelectedSnacks+" x "+getOrderItem);
						reloadList(list,wishList);
						slider.setValue(0);	
						break;
					case 2:
						System.out.println("rice");
						break;

					default:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bottomPanel.setLayout(null);
		bottomPanel.add(btnAddItem);
		
		mainPanel.add(bottomPanel);
		
		btnSubmit = new JButton("Submit Order");
		btnSubmit.setBounds(497, 11, 111, 23);
		bottomPanel.add(btnSubmit);
		
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				secondPanel = new JPanel();
				secondPanel.setBounds(0, 78, 741, 413);
				secondPanel.setLayout(null);
				
				
				JScrollPane scrollPane2 = new JScrollPane();
				scrollPane2.setBounds(33, 53, 197, 202);
				
				
				JList list2 = new JList();
				list2.setModel(new AbstractListModel() {
					Object[] values = wishList.toArray();
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				scrollPane2.setViewportView(list2);
				
				JLabel lblYourOrderAre = new JLabel("Your orders are");
				lblYourOrderAre.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblYourOrderAre.setBounds(50, 29, 146, 14);
				secondPanel.add(lblYourOrderAre);
				
				JLabel lblEstimateBill = new JLabel("Estimate Bill");
				lblEstimateBill.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblEstimateBill.setBounds(292, 98, 120, 14);
				secondPanel.add(lblEstimateBill);
				int price=bill.val;
				JLabel label = new JLabel(String.valueOf(price));
				label.setFont(new Font("Tahoma", Font.BOLD, 18));
				label.setBounds(330, 152, 46, 14);
				secondPanel.add(label);
				secondPanel.add(scrollPane2);
				JLabel lblCustomerName = new JLabel("Customer Name");
				lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblCustomerName.setBounds(266, 22, 135, 30);
				secondPanel.add(lblCustomerName);
				
				JTextField textField = new JTextField();
				textField.setBounds(280, 63, 120, 20);
				secondPanel.add(textField);
				textField.setColumns(10);
				JButton btnPrint = new JButton("Print");
				btnPrint.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnPrint.setBounds(296, 252, 89, 23);
				btnPrint.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ArrayList<String> outputData=new ArrayList<String>();
						String output="";
						output="Customer Name:- "+textField.getText();
						outputData.add(output);
						output="Yours Order Are---- ";
						outputData.add(output);
						Object[] items = wishList.toArray();
						for(Object item : items) {
							outputData.add(item.toString());
						}
						outputData.add("---------------------------");
						output="Total value = "+String.valueOf(price)+"/-";
						outputData.add(output);
						cPdf.createPdf(outputData.toArray());
						System.out.println(output);
					}
				});
				secondPanel.add(btnPrint);
				
				
				mainPanel.add(secondPanel);
				mainPanel.revalidate();
				mainPanel.repaint();
			}
		});
		btnSubmit.setBounds(475, 11, 126, 23);
		bottomPanel.add(btnSubmit);
		bottomPanel.add(getValue);
		mainPanel.add(bottomPanel);
		
		JLabel lblTotal = new JLabel("Total =");
		lblTotal.setBounds(648, 15, 46, 14);
		bottomPanel.add(lblTotal);
		
		JLabel lblSelectNumberOf = new JLabel("Select Number Of Order");
		lblSelectNumberOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectNumberOf.setBounds(260, 14, 166, 14);
		bottomPanel.add(lblSelectNumberOf);
		frame.getContentPane().add(mainPanel);
		
		btnRemoveItem = new JButton("Remove Item Form List");
		btnRemoveItem.setBounds(20, 413, 188, 23);
		mainPanel.add(btnRemoveItem);
		
		slider = new JSlider(JSlider.HORIZONTAL,1,10,1);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setBounds(239, 401, 233, 35);
		mainPanel.add(slider);
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String selectedItem=list.getSelectedValue().toString();
					wishList.remove(selectedItem);
					reloadList(list,wishList);
					regexUse.setVal(selectedItem);
					bill.dec(price.setPrice(selectedItem),Integer.parseInt(regexUse.getVal()));
					getValue.setText(String.valueOf(bill.val));
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		lblTesteIt = new JLabel("Teste It");
		lblTesteIt.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 40));
		lblTesteIt.setBounds(286, 11, 198, 68);
		frame.getContentPane().add(lblTesteIt);
		
		
	}
}
