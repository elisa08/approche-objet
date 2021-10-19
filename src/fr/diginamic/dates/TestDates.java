package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt= new Date();
		
		SimpleDateFormat form= new SimpleDateFormat("dd /MM /yyyy");
		
		System.out.println(form.format(dt));
		
		Date dt2= new Date(116, 4, 19, 23,59,30);

		SimpleDateFormat form2= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(form2.format(dt2));
		
		Date dt3= new Date(121,9,18,14,45,45);
		
		System.out.println(form2.format(dt3));
	}

}
