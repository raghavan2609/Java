package works;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static void main(String[] args) {
		String stringDate = "18-10-2019 11:34:37"; 
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
		Date date = null; 
		try {
			date=formatter.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		System.out.println(date); 
		} 
	}

