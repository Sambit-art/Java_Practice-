

public class custom_exception {

	public static void main(String[] args) throws sambitException {
		
		String password="ayz3";
		
		
		if(password.length()<8) {
			throw new sambitException("password must be 8 char long");
			
		}
	}
	

}
