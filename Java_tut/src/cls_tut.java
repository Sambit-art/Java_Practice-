class Emp{
	String name;
	int userid;
	static String lang;
	
	static {
		lang="javascript";
		System.out.println("static run");
	}
//	constructer
	public Emp() {
		System.out.println("constructer run");
	}
	public Emp(int userid,String name) {     //constructer overloading
		this.userid=userid;
		this.name=name;
	}
	public void sayHello() {
		System.out.println(userid+ "  :    "+name+"    :    "+lang );
	}
	public void sayHello(String lang) {     //method overloading 
		System.out.println(userid+ "  :    "+name+"    :    "+lang );
	}
}


public class cls_tut {

	public static void main(String[] args) {
		
		Emp neha=new Emp(50,"neha");
		neha.sayHello("py");
		Emp sambit=new Emp(12,"sambit"); 
//		Emp.lang="py";
		sambit.sayHello();
		Emp arjun = new Emp(54,"arjun");
		arjun.sayHello();
		

	}

}
