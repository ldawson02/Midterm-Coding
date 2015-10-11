package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	/* The class Section has 4 private attributes:
	 * 	CourseID, SemesterID, SectionID, and RoomID
	 * 
	 * These 4 attributes define a section
	 * 
	 * There are public getters for each attribute, but only
	 * a setter for RoomID as the room number is the only 
	 * non-UUID
	 * 
	 */
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	private Section(){
		this.SectionID = UUID.randomUUID();
	}
	
	public Section(UUID CourseID, UUID SemesterID, int RoomID){
		this();
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.RoomID = RoomID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

}
