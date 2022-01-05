class Firsta{
	public Firsta() {
		System.out.println("a constructer running");
	}
	public Firsta(String name) {
		System.out.println(name);
	}
	public void sp() {
		System.out.println("this is sp");
	}
	
}

class Firstb extends Firsta{
	
	public Firstb() {
		super.sp();
		System.out.println("b constructer running");
	}
}

public class practice_basic {

	public static void main(String[] args) {
		
		Firstb fs= new Firstb();
		

	}

}
