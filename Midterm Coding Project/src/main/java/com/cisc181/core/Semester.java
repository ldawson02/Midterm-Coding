package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	/* The class Semester has 3 private attributes:
	 * 	SemesterID, StartDate, EndDate
	 * 
	 * These 3 attributes define a Semester
	 */
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	private Semester(){
		this.SemesterID = UUID.randomUUID();
	}
	
	public Semester(Date StartDate, Date EndDate){
		this();
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}
	
}
