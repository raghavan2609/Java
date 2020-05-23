package works;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaMobileNumberValidation {
	 public static boolean isValid(String s) 
	    { 
	        // The given argument to compile() method  
	        // is regular expression. With the help of  
	        // regular expression we can validate mobile 
	        // number.  
	        // 1) Begins with 0 or 91 
	        // 2) Then contains 7 or 8 or 9. 
	        // 3) Then contains 9 digits 
	        ///Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	        Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$");
	        // Pattern class contains matcher() method 
	        // to find matching between given number  
	        // and regular expression 
	        Matcher m = p.matcher(s); 
	        return (m.find() && m.group().equals(s)); 
	    } 
	    public static void main(String[] args) {
	        String s = "09095459108";
	        if (isValid(s))  
	            System.out.println("Valid Number");         
	        else 
	            System.out.println("Invalid Number");         
	    } 
}
