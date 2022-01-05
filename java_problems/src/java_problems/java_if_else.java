package java_problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class java_if_else {

	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    scanner.close();
	    if (N%2==1 || (N%2==0 && 6<=N && N<=20)) {
	    	System.out.println(" Weird");
	    }else {
	    	System.out.println("Not Weird");
	    }
	    
	}

}
