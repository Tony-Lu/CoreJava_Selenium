package JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day {

	public static void main(String[] args) {


		Date d = new Date();		
		System.out.println(d.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sh= new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sh.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		

	}

}
