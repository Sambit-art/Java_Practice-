package mongodb_manager;
import com.mongodb.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import org.bson.Document;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.Insets;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.*;;
public class index {

	private JFrame frmMongodbManager;
	MongoClient mongodb;
	MongoDatabase database;
	MongoIterable<String> collection;
	MongoCursor<Document>  dbObject;
	MongoCollection<Document> myCollection;
	ArrayList <String>  setcollection;
	BasicDBObject query;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.frmMongodbManager.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		

	
	
	/**
	 * Create the application.
	 */
	public index() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frmMongodbManager = new JFrame();
		frmMongodbManager.setResizable(false);
		frmMongodbManager.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\folder_type_mongodb_icon_129879.png"));
		frmMongodbManager.setTitle("MongoDb Manager");
		frmMongodbManager.setBounds(100, 100, 699, 705);
		frmMongodbManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMongodbManager.getContentPane().setLayout(null);
		
		JLabel lblDatabaseUrl = new JLabel("Database Url ->              Localhost:27017");
		lblDatabaseUrl.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblDatabaseUrl.setBounds(25, 35, 533, 20);
		frmMongodbManager.getContentPane().add(lblDatabaseUrl);
		
		JLabel lblCollectionName_2 = new JLabel("Collection Name");
		lblCollectionName_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblCollectionName_2.setBounds(398, 87, 114, 20);
		frmMongodbManager.getContentPane().add(lblCollectionName_2);
		
		JTextArea outputField = new JTextArea();
		outputField.setFont(new Font("Monospaced", Font.BOLD, 18));
		outputField.setMargin(new Insets(10, 10, 10, 10));
		outputField.setSelectionColor(Color.PINK);
		outputField.setLineWrap(true);
		outputField.setWrapStyleWord(true);
		outputField.setBounds(0, 320, 684, 340);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 89, 114, 20);
		@SuppressWarnings("rawtypes")
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String setCollection=comboBox_1.getSelectedItem().toString();
				outputField.setText(setCollection);
				myCollection=database.getCollection(setCollection);
				dbObject= myCollection.find().iterator();
				String res="";
				while (dbObject.hasNext()) {
		        res+=dbObject.next().toString();
		        res+="\n\n";
		    }
				System.out.print(dbObject);
				outputField.setText(res);
			}
		});
		comboBox_1.setBounds(543, 89, 114, 20);
		
		
		comboBox.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(comboBox.getSelectedItem());
				outputField.setText("You Select Collection "+comboBox.getSelectedItem());
				database=mongodb.getDatabase(comboBox.getSelectedItem().toString() );
				collection= database.listCollectionNames();
				setcollection= new ArrayList<String>();
				setcollection.clear();
				collection.forEach( (String x) -> {
					setcollection.add(x);
			      });
				comboBox_1.setModel(new DefaultComboBoxModel<String>(setcollection.toArray(new String[0])));
			}
		});
		
		
		
		
		JLabel lblCollectionName = new JLabel("Database Name");
		lblCollectionName.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblCollectionName.setBounds(25, 87, 114, 20);
		frmMongodbManager.getContentPane().add(lblCollectionName);
		
		mongodb=new MongoClient("localhost",27017);
		
		
		JButton btnNewButton = new JButton("Load Database");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings({ "deprecation", "unchecked" })
			public void actionPerformed(ActionEvent arg0) {
				List<String> db =mongodb.getDatabaseNames();
				ArrayList <String>  setlist= new ArrayList<String>();
				for (String item : db) {
					setlist.add(item);
				}
				System.out.println(setlist);
				comboBox.setModel(new DefaultComboBoxModel<String>(setlist.toArray(new String[0])));
				outputField.setText(db.toString());
			}
		});
		btnNewButton.setBounds(543, 36, 114, 23);
		frmMongodbManager.getContentPane().add(btnNewButton);
		frmMongodbManager.getContentPane().add(comboBox);
		
		
		
		frmMongodbManager.getContentPane().add(comboBox_1);
		
	
		
		@SuppressWarnings("rawtypes")
		JComboBox Queryselecter = new JComboBox();
		String queryList[]= {"Find", "Insert", "Delete"};
		Queryselecter.setModel(new DefaultComboBoxModel(queryList));
		Queryselecter.setBounds(36, 203, 114, 20);
		frmMongodbManager.getContentPane().add(Queryselecter);
		
		JLabel lblSelectQueryType = new JLabel("Select Query Type");
		lblSelectQueryType.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblSelectQueryType.setBounds(25, 159, 137, 20);
		frmMongodbManager.getContentPane().add(lblSelectQueryType);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 146, 705, 2);
		frmMongodbManager.getContentPane().add(separator);
		
		JTextArea queryField = new JTextArea();
		queryField.setFont(new Font("Monospaced", Font.BOLD, 18));
		queryField.setText("{\r\n" + 
				"\"name\":\"sambit2\"\r\n" + 
				",\r\n" + 
				"\"userid\":\"aaa\"\r\n" + 
				"}");
		queryField.setMargin(new Insets(5, 15, 5, 15));
		queryField.setBorder(UIManager.getBorder("TextField.border"));
		queryField.setWrapStyleWord(true);
		queryField.setSelectionColor(Color.PINK);
		queryField.setLineWrap(true);
		queryField.setAutoscrolls(false);
		queryField.setBounds(227, 146, 430, 159);
		
		JScrollPane scrollPane = new JScrollPane(queryField);
		
		scrollPane.setBounds(205, 159, 456, 128);
		frmMongodbManager.getContentPane().add(scrollPane);
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-21, 307, 705, 2);
		frmMongodbManager.getContentPane().add(separator_1);
		
		JButton btnSubmitquery = new JButton("submitQuery");
		btnSubmitquery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String queryText=queryField.getText();
//					queryText=queryText.substring(1, queryText.length()-1);
					JSONParser jp=new JSONParser();
					JSONObject jsonObject;
						try {
							jsonObject = (JSONObject) jp.parse(queryText);
							outputField.setText(jsonObject.toJSONString());
							
							switch (Queryselecter.getSelectedItem().toString()) {
							case "Find":
							{
								String key=jsonObject.keySet().toString();
					            String filed=jsonObject.values().toString();
					            
					            FindIterable<Document> res = myCollection.find(Filters.eq(key.substring(1, key.length()-1), filed.substring(1,filed.length()-1)));
								String output = "";
								for(Document doc : res) {
									 output+= doc.toString();
									 output+="\n\n";
								}
								
								outputField.setText(output);
								
								System.out.println(output);
								break;
							}
							
							case "Insert":{
						myCollection.insertOne(Document.parse(jsonObject.toJSONString()));
						System.out.println("success");
						outputField.setText("Successfully Insert One Record");
							break;
							}
							
							case "Delete" : {
								myCollection.deleteOne(Document.parse(jsonObject.toJSONString()));
								outputField.setText("Successfully Deleted One Record");
								break;
							}
							
							default:
								outputField.setText("Query Params Failed");
							}
							
				            
				            
						} catch (ParseException e) {
							outputField.setText(e.toString());
						}
						
					
		}});
		btnSubmitquery.setBounds(36, 253, 114, 23);
		frmMongodbManager.getContentPane().add(btnSubmitquery);
		
		JScrollPane scrollPane_1 = new JScrollPane(outputField);
		scrollPane_1.setBounds(0, 320, 684, 340);
		frmMongodbManager.getContentPane().add(scrollPane_1);
		
		
			
	}
}
