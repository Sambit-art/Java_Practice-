class Sum{
	
	int val1,val2,resultval;
	public void claculate(){
		resultval=val1+val2;
		System.out.println(resultval);
	}
}



public class Tut1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		double num2=10;
		int num3=(int) 10.00;
		float num4= 10.20f;
		short num5=100;
		byte num6=100;
		String fn = "Sambit ";
		String  ln="Bhattacharyya";
		System.out.println(fn.lastIndexOf("S"));
		System.out.println(num6);
		System.out.println(Sum(num6, num5));
		
		
		Sum sum1=new Sum();
		System.out.println(sum1);
	}
	
	public static int Sum(int n1, int n2) {
		int result=n1+n2;
		return (short)result;
	}
	

}
