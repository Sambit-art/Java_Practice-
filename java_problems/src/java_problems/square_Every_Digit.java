package java_problems;


class SquareDigit {

	  public int squareDigits(int n) {
		String rowInp=String.valueOf(n);
		String[] digits = rowInp.split("(?<=.)");
		String output = "";
		for(String  a: digits) {
			int num=Integer.parseInt(a);
			int item = num*num;
			output=output+String.valueOf(item);
		}
	    return Integer.parseInt(output);
	  }

	}

public class square_Every_Digit {

	
	public static void main(String[] args) {
		
		System.out.println(new SquareDigit().squareDigits(9119));
		
	}

}
