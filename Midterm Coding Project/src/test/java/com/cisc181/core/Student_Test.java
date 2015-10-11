package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Semester> semesters = new ArrayList<Semester>();
	private static ArrayList<Section> sections = new ArrayList<Section>();
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() throws PersonException{
		
		// Create 3 Courses and add them to the ArrayList courses
		Course c1 = new Course("Intro to Comp Sci", 3);
		Course c2 = new Course("Mechanics", 4);
		Course c3 = new Course("Intro to Econ", 3);
		courses.add(c1); courses.add(c2); courses.add(c3);
		
		// Create 2 Semesters and add them to the ArrayList semesters
		// Generate the start and end dates for 2 semesters
		Calendar start1 = Calendar.getInstance();
		Calendar end1 = Calendar.getInstance();
		Calendar start2 = Calendar.getInstance();
		Calendar end2 = Calendar.getInstance();
		start1.set(2015,8,28); end1.set(2015, 12, 19); start2.set(2016,  2, 14); end2.set(2016, 5,28);
		
		Semester s1 = new Semester(start1.getTime(), end1.getTime());
		Semester s2 = new Semester(start2.getTime(), end2.getTime());
		
		semesters.add(s1); semesters.add(s2);
		
		// Generate 6 sections, one of each course per semester
		int[] room = new int[]{100,101,102,200,201,202};
		int count = 0;
		for (Semester s : semesters){
			for (Course c : courses){
				Section S = new Section(c.getCourseID(),s.getSemesterID(),room[count]);
				sections.add(S);
			}
		}
		
		// Create 10 Student Records and add them to an ArrayList
		// Generate 10 birthdays
		Calendar bd1 = Calendar.getInstance();
		Calendar bd2 = Calendar.getInstance();
		Calendar bd3 = Calendar.getInstance();
		Calendar bd4 = Calendar.getInstance();
		Calendar bd5 = Calendar.getInstance();
		Calendar bd6 = Calendar.getInstance();
		Calendar bd7 = Calendar.getInstance();
		Calendar bd8 = Calendar.getInstance();
		Calendar bd9 = Calendar.getInstance();
		Calendar bd10 = Calendar.getInstance();
		bd1.set(1980, 7,28); bd2.set(1981, 1, 17); bd3.set(1979, 11,22); 
		bd4.set(1980,12,20); bd5.set(1981, 5,8); bd6.set(1978, 10,30);
		bd7.set(1979,5,13); bd8.set(1980, 3,18); bd9.set(1979,9,10); bd10.set(1981, 6,12);
		
		Student st1 = new Student("Harry", "James", "Potter", bd1.getTime(), eMajor.BUSINESS, "123 Some St.","(123)-456-7890", "hpotter@hogwarts.edu");
		Student st2 = new Student("Hermione", "Jean", "Granger", bd2.getTime(), eMajor.CHEM, "123 Some St.","(123)-456-7890", "hgranger@hogwarts.edu");
		Student st3 = new Student("Ron", "Bilius", "Weasley", bd3.getTime(), eMajor.PHYSICS, "123 Some St.","(123)-456-7890", "rweasley@hogwarts.edu");
		Student st4 = new Student("Neville", "Frank", "Longbottom", bd4.getTime(), eMajor.COMPSI, "123 Some St.","(123)-456-7890", "nlongbottom@hogwarts.edu");
		Student st5 = new Student("Cho", "L", "Chang", bd5.getTime(), eMajor.BUSINESS, "123 Some St.","(123)-456-7890", "cchang@hogwarts.edu");
		Student st6 = new Student("Dean", "S", "Thomas", bd6.getTime(), eMajor.PHYSICS, "123 Some St.","(123)-456-7890", "dthomas@hogwarts.edu");
		Student st7 = new Student("Seamus", "James", "Finnegan", bd7.getTime(), eMajor.CHEM, "123 Some St.","(123)-456-7890", "sfinnegan@hogwarts.edu");
		Student st8 = new Student("Luna", "Ester", "Lovegood", bd8.getTime(), eMajor.NURSING, "123 Some St.","(123)-456-7890", "llovegood@hogwarts.edu");
		Student st9 = new Student("Parvati", "H", "Patel", bd9.getTime(), eMajor.CHEM, "123 Some St.","(123)-456-7890", "ppatel@hogwarts.edu");
		Student st10 = new Student("Draco", "Lucius", "Malfoy", bd10.getTime(), eMajor.NURSING, "123 Some St.","(123)-456-7890", "dmalfoy@hogwarts.edu");

		students.add(st1); students.add(st2); students.add(st3); students.add(st4); students.add(st5); 
		students.add(st6); students.add(st7); students.add(st8); students.add(st9); students.add(st10); 
		
	}
	
	@Test
	public void test() throws PersonException{
		
		double[] grade = new double[]{
				3.0, 4.0, 3.0, 2.0, 3.0, 4.0,  // Set grades for student1, GPA = 3.20 
				4.0, 3.0, 4.0, 4.0, 4.0, 4.0,  // Set grades for student2, GPA = 3.80
				2.0, 3.0, 4.0, 3.0, 3.0, 3.0,  // Set grades for student3, GPA = 3.00
				2.0, 3.0, 2.0, 3.0, 4.0, 4.0,  // Set grades for student4, GPA = 3.05
				3.0, 2.0, 4.0, 3.0, 2.0, 1.0,  // Set grades for student5, GPA = 2.45
				2.0, 2.0, 3.0, 2.0, 4.0, 3.0,  // Set grades for student6, GPA = 2.70
				3.0, 2.0, 4.0, 3.0, 2.0, 3.0,  // Set grades for student7, GPA = 2.75
				4.0, 3.0, 3.0, 2.0, 3.0, 2.0,  // Set grades for student8, GPA = 2.85
				4.0, 3.0, 3.0, 3.0, 4.0, 4.0,  // Set grades for student9, GPA = 3.50
				3.0, 3.0, 2.0, 4.0, 3.0, 4.0};// Set grades for student10, GPA = 3.15
		
		// Create an ArrayList to hold each student's GPA
		ArrayList<Double> StGPA = new ArrayList<Double>();
		// Create an ArrayList to hold each course's average grade
		ArrayList<Double> CourseAve = new ArrayList<Double>();
		CourseAve.add(0.0); CourseAve.add(0.0); CourseAve.add(0.0);
		int count = 0;
		for (Student S : students){
			double Points = 0;
			double Credits = 0;
			int innerCt = 0;
			for (Semester s : semesters){
				int courseCt = 0;
				for (Course c : courses){
					//Enroll the student in the course
					Enrollment e = new Enrollment(sections.get(innerCt).getSectionID(),S.getStudentID());
					e.setGrade(grade[count]);
					
					// Extract the grade points they receive with their grade
					Points += e.getGrade()*c.getGradePoints();
					// Tally the total credit hours
					Credits += c.getGradePoints();
					
					// Keep a tally of the course's grades given
					// Will divide by number of students at the end
					double current = CourseAve.get(courseCt);
					CourseAve.set(courseCt, current + e.getGrade());
					courseCt++;
					innerCt++;
					count++;
				}
			}
			// Calculate the GPA for one student and add to ArrayList of student GPAs
			StGPA.add(Points/Credits);
		}
		
		// Compare students GPAs calculated with code vs. manually
		assertTrue(Math.abs(StGPA.get(0) - 3.20) < .01);
		assertTrue(Math.abs(StGPA.get(1) - 3.80) < .01);
		assertTrue(Math.abs(StGPA.get(2) - 3.00) < .01);
		assertTrue(Math.abs(StGPA.get(3) - 3.05) < .01);
		assertTrue(Math.abs(StGPA.get(4) - 2.45) < .01);
		assertTrue(Math.abs(StGPA.get(5) - 2.70) < .01);
		assertTrue(Math.abs(StGPA.get(6) - 2.75) < .01);
		assertTrue(Math.abs(StGPA.get(7) - 2.85) < .01);
		assertTrue(Math.abs(StGPA.get(8) - 3.50) < .01);
		assertTrue(Math.abs(StGPA.get(9) - 3.15) < .01);
		
		// Compare Course averages calculated with code vs. manually
		assertTrue(Math.abs(CourseAve.get(0)/20.0 - 2.95) < .01);
		assertTrue(Math.abs(CourseAve.get(1)/20.0 - 3.00) < .01);
		assertTrue(Math.abs(CourseAve.get(2)/20.0 - 3.20) < .01);
		
	}
	
	@Test
	public void testMajor(){
		// Change the major of a student, then test to make sure it was changed
		Student s = students.get(3);
		s.setMajor(eMajor.BUSINESS);
		
		assertEquals(s.getMajor(), eMajor.BUSINESS);
	}

}
