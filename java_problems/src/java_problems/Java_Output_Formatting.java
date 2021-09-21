package java_problems;

import java.util.Scanner;

public class Java_Output_Formatting {
	public static void main(String[] args) {
		String result="";
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String num=String.format("%03d", x);
           result=result+s1;
            int strLength=s1.length();
            int requiiredSpaces=15-strLength;
            for (int j = 0; j < requiiredSpaces; j++) {
				result=result+" ";
			}
            if (i<2) {
            	result=result+num+"\n";
			}else {
				result=result+num;
			}
        }
        System.out.println(result);
        System.out.println("================================");

}
}
