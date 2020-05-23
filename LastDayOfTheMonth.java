import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LastDayOfTheMonth {
	public static void main(String[] args) throws Exception {
		System.out.println(getLastDayOfMonth("01-05-2019"));
	}
	
	static String getLastDayOfMonth(String dates) throws Exception {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	    Date date = sdf.parse(dates);
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.MONTH, 1);
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    calendar.add(Calendar.DATE, -1);
	    Date lastDayOfMonth = calendar.getTime();
	    return sdf.format(lastDayOfMonth);
	}

}
