package test;

import java.util.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {
	
	
	@ParameterizedTest
	@ValueSource(ints = {2004, 2008, 2012, 2016, 2000})
	public void Should_return_true(int year) {
		Calendar cal = new Calendar(year);
		assertTrue(cal.isLeapYear());
	}

	
	@ParameterizedTest
	@ValueSource(ints = {2005, 2021, 2019, 1999, 1998})
	public void Should_return_false(int year) {
		Calendar cal1 = new Calendar(year);
		assertFalse(cal1.isLeapYear());
	}

	
	@ParameterizedTest
	@ValueSource(ints = {2001, 1995, 2020, 1996, 1992})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar gregCal = (GregorianCalendar)GregorianCalendar.getInstance();
		boolean isLeapYear = gregCal.isLeapYear(year);
		if(isLeapYear == true) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

	
	@ParameterizedTest
	@ValueSource(ints = {-199, -2095, Integer.MAX_VALUE})
	public void boundary_test(int year) {
		Calendar cal2 = new Calendar(year);
		assertFalse(cal2.isLeapYear());
	}
	

}
