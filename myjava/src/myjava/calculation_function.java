package myjava;

import java.util.Scanner;

public class calculation_function {
	public static void main(String[] args) {
		System.out.println("Welcome to calculation module");
		Scanner keyboardinput=new Scanner(System.in);
		System.out.println("Enter First Number");
		String num1=keyboardinput.nextLine();
		System.out.println("Enter Second Number");
		String num2=keyboardinput.nextLine();
		System.out.println(power(num1, num2));
	}
	public static Integer addnum(Integer num1,Integer num2) {
		return num1+num2;
	}
	public static Integer substractnum (Integer num1,Integer num2) {
		return num1-num2;
	}
	public static Integer power(String num1,String num2) {
		return (int) Math.pow(Integer.parseInt(num1), Integer.parseInt(num2));
	}
}
