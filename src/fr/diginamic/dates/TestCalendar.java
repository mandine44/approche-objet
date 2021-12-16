package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 04, 19, 23, 59, 30);
		Date date = cal.getTime();

		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur.format(date));

		Locale france = Locale.FRENCH;
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy MMMM EEEEE HH:mm:ss", france);
		System.out.println(formateur2.format(date));

		Locale chine = Locale.CHINESE;
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy MMMM EEEEE HH:mm:ss", chine);
		System.out.println(formateur3.format(date));
	}

}
