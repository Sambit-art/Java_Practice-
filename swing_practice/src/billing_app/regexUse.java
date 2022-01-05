package billing_app;
import java.util.regex.*;
public class regexUse {

	private String val="";
	private String match="";
	public String getVal() {
		Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(val);
        while(m.find()) {
        	match=m.group();
        }
        return match;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	
}
