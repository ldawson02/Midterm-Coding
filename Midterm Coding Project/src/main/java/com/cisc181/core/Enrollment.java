package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	/*The class Enrollment has 4 private attributes:
	 * 	SectionID, StudentID, EnrollmentID, Grade
	 * 
	 * These 4 attributes define Enrollment (in a section of a course)
	 * 
	 * There are getters for each attribute, and a setter for Grade
	 * 
	 * There is a two-arg constructor that uses the SectionID and StudentID as parameters
	 * 
	 * There is a private no-arg constructor
	 * 
	 */
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	
	private Enrollment(){
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public Enrollment(UUID sectionID, UUID studentID) {
		this();
		SectionID = sectionID;
		StudentID = studentID;
	}
}
