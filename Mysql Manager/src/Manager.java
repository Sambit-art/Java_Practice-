
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class Manager {
	
	public static String databaseUrl="jdbc:mysql://localhost:3306/";
	public static String username="root";
	public static String password="";
	public static String database;
	public static Statement stmt;
	public static ResultSet rSet;
	public String table;
	public static Connection connection;
	public static boolean connect() {
		try {
			connection= DriverManager.getConnection(databaseUrl,username,password);
			return true;
		
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static Connection connect(String databasename) {
		String newDatabaseUrl=databaseUrl+databasename;
		try {
			connection= DriverManager.getConnection(newDatabaseUrl,username,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static ArrayList<String> getTableName(String databasename) {
		databaseUrl=databaseUrl+databasename;
		ArrayList<String> tableList=new ArrayList<>();
		try {
			connection= DriverManager.getConnection(databaseUrl,username,password);
			stmt=connection.createStatement();
			rSet=stmt.executeQuery("SHOW TABLES");
			while(rSet.next()) {
				tableList.add(rSet.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tableList;
	}
	
	public static ArrayList<String> getDatabaseList() {
		connect();
		DatabaseMetaData databaseMetaData = null;
		ArrayList<String> list= new ArrayList<>(); 
		try {
			databaseMetaData = (DatabaseMetaData) connection.getMetaData();
			rSet=databaseMetaData.getCatalogs();
			while(rSet.next()) {
				String dbName=rSet.getString(1);
				list.add(dbName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public static void getRecord(String database,String query) {
		try {
			connection= Manager.connect(database);
			stmt=connection.createStatement();
			rSet=stmt.executeQuery("SELECT * FROM products");
			while(rSet.next()) {
				System.out.println(rSet.getString(3));
				}
		} catch (Exception e) {
			
		}
	}
	
public static void main(String[] args) {
//		ArrayList<String> list=Manager.getDatabaseList();
//		for(String aString :list) {
//			System.out.println(aString);
//		}
		
//		for(String table:Manager.getTableName("ecom")) {
//			System.out.println(table);
//		}
//		System.out.println(databaseUrl);
	Manager.getRecord("ecom", "SELECT * FROM users");
	}
}
