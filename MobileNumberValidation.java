package works;

import java.util.regex.Matcher;
import java.util.regex.Pattern; 
  
class MobileNumberValidation { 
	public static boolean isValidE123(String s) 
	{ 
		Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[6789]\\d{9}$");  
		Matcher m = p.matcher(s); 
		return (m.find() && m.group().equals(s)); 
	} 
  
    public static void main(String[] args) 
    { 
        String s = "459108";
        if (isValidE123(s))  
            System.out.println("Valid Number");         
        else 
            System.out.println("Invalid Number");         
    } 
} 
