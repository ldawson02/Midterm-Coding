package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static ArrayList<Staff> staff = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonException{
		// Generate and set Birthdays for Staff
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		Calendar cal4 = Calendar.getInstance();
		Calendar cal5 = Calendar.getInstance();
		Calendar hiredate = Calendar.getInstance();
		cal1.set(1950,6,6); cal2.set(1960,4,1); cal3.set(1955,9,28); cal4.set(1962,7,14); cal5.set(1968,8,2); hiredate.set(1990,7,14);
		
		// Create staff members
		Staff s1 = new Staff("Severus", "S.", "Snape", cal1.getTime(), "123 Some St.", "(123)-456-7890", "ssnap@hogwarts.edu", "Mon. 7-9PM", 3, 120000, hiredate.getTime(),eTitle.MR);
		Staff s2 = new Staff("Minerva", "G.", "McGonagall", cal2.getTime(), "123 Some St.", "(123)-456-7890", "mmcgonagall@hogwarts.edu", "Wed. 1-4PM", 2, 150000, hiredate.getTime(),eTitle.MS);
		Staff s3 = new Staff("Rubeus", "Q.", "Hagrid", cal3.getTime(), "123 Some St.", "(123)-456-7890", "rhagrid@hogwarts.edu", "Tues. 3-5PM", 3, 100000, hiredate.getTime(),eTitle.MR);
		Staff s4 = new Staff("Pomona", "E.", "Sprout", cal4.getTime(), "123 Some St.", "(123)-456-7890", "psprout@hogwarts.edu", "Wed. 8-11AM", 3, 115000, hiredate.getTime(),eTitle.MRS);
		Staff s5 = new Staff("Remus", "L.", "Lupin", cal5.getTime(), "123 Some St.", "(123)-456-7890", "ssnap@hogwarts.edu", "Mon. 12-3PM", 3, 110000, hiredate.getTime(),eTitle.MR);

		// Add staff members to an ArrayList
		staff.add(s1); staff.add(s2); staff.add(s3); staff.add(s4); staff.add(s5); 
	}
	
	@Test
	// Use getter methods to calculate average salary in code, and compare to manual 
	// calculations
	public void SalaryTest() {
		double aveSalary = 0;
		for (Staff s : staff){
			aveSalary += s.getSalary();
		}
		aveSalary = aveSalary/5.0;
		assertTrue(Math.abs((aveSalary) - 119000.0) <.01);
	}
	
	@Test(expected = PersonException.class)
	// Test to make sure DOB PersonException thrown
	public void DOBExceptionTest() throws PersonException{
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1860,4,1);
		Calendar hiredate = Calendar.getInstance();
		hiredate.set(1990,7,14);
		Staff s2 = new Staff("Minerva", "G.", "McGonagall", cal2.getTime(), "123 Some St.", "(123)-456-7890", "mmcgonagall@hogwarts.edu", "Wed. 1-4PM", 2, 150000, hiredate.getTime(),eTitle.MS);
		staff.add(1, s2);
	}
	
	@Test(expected = PersonException.class)
	// Test to make sure phone # PersonException is thrown
	public void PhoneExceptionTest() throws PersonException{
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1950,6,6);
		Calendar hiredate = Calendar.getInstance();
		hiredate.set(1990,7,14);
		Staff s1 = new Staff("Severus", "S.", "Snape", cal1.getTime(), "123 Some St.", "(123)-456-789", "ssnap@hogwarts.edu", "Mon. 7-9PM", 3, 120000, hiredate.getTime(),eTitle.MR);		
		staff.add(1, s1);
	}
	

}
