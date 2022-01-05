package java_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Kata {
	  public static String highAndLow(String numbers) {
	    String[] strNum=numbers.split(" ");
	    
	    
	    Collection<Integer> nums=new ArrayList<Integer>();
	    for (int i = 0; i < strNum.length; i++) {
			nums.add(Integer.parseInt(strNum[i]));
		}
	    
	    Object[] numsArr=nums.toArray();
	    Arrays.sort(numsArr);
	    int highest=(int) numsArr[numsArr.length-1];
	    int lowest=(int) numsArr[0];
	    
	    System.out.println(lowest);
	    return String.valueOf(highest)+" "+String.valueOf(lowest);
	  }
	}

public class Highest_and_Lowest {

	public static void main(String[] args) {
		System.out.println(Kata.highAndLow("1 2 -3 4 5"));
		
	}

}
