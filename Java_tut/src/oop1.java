import java.util.Scanner;

class Calculater{
	int resultval;
	public int addition(int val1,int val2){
		return resultval = val1+val2;
	}
	public int substraction(int val1,int val2){
		return resultval = val1-val2;
	}
	public int multiply(int val1,int val2){
		return resultval = val1*val2;
	}
	public void division(int val1,int val2){
		Double num1,num2;
		switch (val2) {
		case 0:
			 num2=(double) val1;
			 num1=(double) val2;
			break;
		default:
			num1=(double) val1;
			num2=(double) val2;
			break;
		}
		System.out.println(num1/num2);
	}
}


public class oop1 {

	private static final char[] Double = null;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int input1=sc.nextInt();
		System.out.println("Enter Second Number");
		int input2=sc.nextInt();
		Calculater sum1=new Calculater();
		int data=sum1.addition(input1,input2);
		System.out.println(data);
		
		Calculater sum2=new Calculater();
		sum2.division(input1,input2);
		
		System.out.println("Enter Any Key To Exit ");
		int input3=sc.nextInt();
	}

}
