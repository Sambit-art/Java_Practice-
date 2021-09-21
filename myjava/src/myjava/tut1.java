package myjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class tut1 {
	public static void main(String [] args){
		geturl();
		
	}
	public static String sayname(){
		return "helllo sambit";
	}
	public static void geturl (){
		 try {
			 String readLine="";
			 URL urlForGetRequest = new URL("http://localhost:3000/user/alluser");
			 HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
			 conection.setRequestMethod("GET");
//			 conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
			 int responseCode = conection.getResponseCode();
			 System.out.println(responseCode);
			 if (responseCode == HttpURLConnection.HTTP_OK) {
			        BufferedReader in = new BufferedReader(
			            new InputStreamReader(conection.getInputStream()));
			        StringBuffer response = new StringBuffer();
			        while ((readLine = in .readLine()) != null) {
			            response.append(readLine);
			        } in .close();
			        System.out.println(response);
			    } else {
			        System.out.println("GET NOT WORKED");
			    }

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
