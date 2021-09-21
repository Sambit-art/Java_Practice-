import java.util.regex.*;
public class regextest {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".d");
		Matcher matcher=pattern.matcher("ad");
		boolean bl=matcher.matches();
		System.out.println(bl);
	}

}
