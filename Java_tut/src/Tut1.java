class Aprac{
	int roll,age;
	String name;
	
	public Aprac(int roll,String name,int age) {
		this.roll=roll;
		this.name=name;
		this.age=age;
	}

	public Aprac() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Aprac [roll=" + roll + ", age=" + age + ", name=" + name + "]";
	}
	
	public void test(Aprac r1) {
		System.out.println(r1.toString());
	}
	
}

public class Tut1 {

	public static void main(String[] args) {
		
		Aprac ap= new Aprac(142, "Sambit", 21);
		String data=new Aprac(142, "Bony", 21).toString();
		System.out.println(data);
		new Aprac().test(ap);;
	
	}
}
