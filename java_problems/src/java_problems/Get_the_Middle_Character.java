package java_problems;

public class Get_the_Middle_Character {
	
	public static  String getMiddle(String word) {
		int wordLenght=word.length();
		String letters[]=word.split("");
		String output="";
		if(wordLenght%2==1) {
			output=letters[((wordLenght+1)/2)-1];
		}else {
			output=letters[(wordLenght/2)-1]+letters[wordLenght/2];
		}
		return output;
	  }
	
	public static void main(String[] args) {
		System.out.println(getMiddle("sambt"));
	}

}
