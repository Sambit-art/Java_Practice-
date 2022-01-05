package java_sql_tut;
import java.sql.*; 
public class sql_tut {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
    static final String DB_URL = "jdbc:mysql://LocalHost:3306/sql_project"; 
    static String result="";
    static final String USER = "root";
    static final String PASS = "";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs;
    public  sql_tut() {

        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from users;";
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                int value1 = rs.getInt("userid");
                String value2 = rs.getString("name");
                String value3 = rs.getString("password");
                 result+=value1+"  | "+value2+"  |  "+value3+"\n";
                 

            }
//            System.out.println(result);
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
    //  handle sql exception
            e.printStackTrace();
        }catch (Exception e) {
    // TODO: handle exception for class.forName
            e.printStackTrace();
        }finally{  
    //closing the resources..STEP 7
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        
        

	}
    
    
	public static void main(String[] args) {
		sql_tut aa=new sql_tut();
	
	}
		
	public String getData() {
		return result;
	}
	
	public void insertQuery(String name,String password) {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			stmt = conn.createStatement();
			String sql="INSERT INTO users (name, password) VALUES ( ' "+ name + " ' ,'  " + password +" '  );";
//			
			Statement s = conn.prepareStatement(sql);
			s.execute(sql);
			
			 rs.close();
	         stmt.close();
	         conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
