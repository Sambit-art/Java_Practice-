package myjava;

class calc{
	int num1,num2,result;
	String item[]=new String[2];
	item[0]="python";
	item[1]="java";
	
//	this is a default constracter
	calc(){
		num1=12;
		num2=15;
	}
	
	public void calculate(){
		result=num1+num2;
		System.out.println(result);
	}
	
	public String sayname(String name){
		return name;
	}
	
}

public class classtut {
	public static void main(String args[]) {
		calc abcnumcal=new calc();
		abcnumcal.calculate();
		System.out.println(abcnumcal.sayname("gahsdgha"));
	}
}
