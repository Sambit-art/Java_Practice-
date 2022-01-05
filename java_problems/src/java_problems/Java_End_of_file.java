package java_problems;

import java.util.Scanner;

public class Java_End_of_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int lineNumber=0;
		while (scanner.hasNext()) {
			lineNumber+=1;
			String line=scanner.nextLine();
			System.out.println(lineNumber+" "+line);
			
		}
	}

}
