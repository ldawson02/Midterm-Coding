package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	/* Class Course has 4 private attributes:
	 * CourseID, CourseName, GradePoints, Major
	 * 
	 * These four attributes describe a course
	 * 
	 * Public getters for each attribute.
	 * Public setters for grade points and major.
	 */
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	private Course(){
		this.CourseID = UUID.randomUUID();
	}
	
	public Course(String CourseName, int GradePoints){
		this();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}
	
	
	
}
