package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
	public static void main(String[] args) {
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2016, 5, 19, 23, 59, 30);

		Date dt2 = calendar2.getTime();
		SimpleDateFormat form2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(form2.format(dt2));
		
		Calendar calendar = Calendar.getInstance();

		Date dt = calendar.getTime();

		SimpleDateFormat form = new SimpleDateFormat("dd /MM /yyyy");

		System.out.println(form.format(dt));
		
		SimpleDateFormat form3 = new SimpleDateFormat("EEEEE dd MMMM yyyy",Locale.FRANCE);

		System.out.println(form3.format(dt));

		SimpleDateFormat form4 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.GERMANY);

		System.out.println(form4.format(dt));
		
		SimpleDateFormat form5 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.CHINESE);

		System.out.println(form5.format(dt));
		
		
		SimpleDateFormat form6 = new SimpleDateFormat("EEEEE dd MMMM yyyy", new Locale("ru"));

		System.out.println(form6.format(dt));
		
		
	}
}
