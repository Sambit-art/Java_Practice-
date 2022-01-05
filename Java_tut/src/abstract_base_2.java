class Math{
	public void sum(Number a,Number b) {
		System.out.println(a);
		
	}
	
	public static void abc() {
		System.out.println(Integer.parseInt("545"));
		System.out.println(Integer.toBinaryString(95));
	}
}


public class abstract_base_2 {

	public static void main(String[] args) {
		
		Math aa=new Math();
		short a=25;
		double b=27.5;
		
		aa.sum(a, b);
		Math.abc();
		
	}

}
