package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date(2016, 04, 19);

		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur.format(date));

	}

}
