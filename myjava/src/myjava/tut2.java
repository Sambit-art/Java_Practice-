package myjava;

import java.util.Scanner;

public class tut2 {
	public static void main(String[] args){
//		System.out.println("hello world");
//		int getstring =addnum(10,30);
//		System.out.println(getstring);
//		System.out.println(stringtodouble("12.52"));
//		System.out.println(strtoint("50"));
		System.out.println("Enter Your Name\n");
		Scanner keyboardinput=new Scanner(System.in);
		String username=keyboardinput.nextLine();
		System.out.println("Enter Your Gender\n");
		String usergender=keyboardinput.nextLine();
		System.out.println(getdetails(username, usergender));
	}
	public static String getdetails(String name,String gender1) {
		if (gender1.equals("male")) {
			return "\n"+name+ ",he is welcome to java";
		}else if (gender1.equals("female")) {
			return "\n"+name+ ",she is welcome to java";
		}else {
			return "You Enter an undefined gender";
		}
		
	}
	
	public static String sayname(){
		return "this is return string";
	}
	public static int addnum(int num1,int num2){
		return num1+num2;
	}
	public static Double stringtodouble(String num1) {
		Double mydouble=Double.parseDouble(num1);
		return mydouble;
	}
	public static Integer strtoint(String strnum) {
		return Integer.parseInt(strnum);
	}
	
}
