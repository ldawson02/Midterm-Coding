package com.cisc181.core;

import java.util.Date;

// PersonException extends Exception
// Can handle DOB exception or phone number exception
public class PersonException extends Exception{
	
	private Date DOB;
	private String phone_number;
	
	public PersonException(Date DOB){
		this.DOB = DOB;
		System.out.println(DOB + " is not a valid date of birth.");
	}

	public PersonException(String phone_number){
		this.phone_number = phone_number;
		System.out.println(phone_number + " is not in the following proper format: '(###)-###-####'");
	}
}
