package works;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		/*String currentDate = sfd.format(date);
		System.out.println(currentDate);*/
		String date1 = "04/12/2019";
		String asdsa = "2020-01-01 12:22:22";
		SimpleDateFormat sfd1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date sdsadsda = null;
		try {
			sdsadsda = sfd1.parse(asdsa);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdsadsda);
//		String finalDate = sfd.format(sdsadsda);
//		System.out.println(finalDate);
	}
}
