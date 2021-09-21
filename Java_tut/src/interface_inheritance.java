interface A{
	void write();
}

@FunctionalInterface
interface B{
	void read();
	default void speak() {
		System.out.println("i am speak");
	}
}

class Imp implements A,B{
	@Override
	public void write() {
		System.out.println("i am write");
		
	}
	@Override
	public void read() {
		System.out.println("i am read");
	}
}

public class interface_inheritance {

	public static void main(String[] args) {
		
		Imp aa=new Imp();
		aa.write();
		aa.read();
		aa.speak();
		
//		A aa= ()->System.out.println("i am lambda");
//		aa.write();
	}

}
