package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_PATTERN="[A-Z]{1}[a-z]{2,9}";
	private static final String LAST_NAME_PATTERN="[A-Z]{1}[a-z]{2,9}";
	private static final String EMAIL="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
	                                   "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	
	
	public boolean validateFirstName(String firstName){
		Pattern pattern =Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	}
	public boolean validateLastName(String lastName){
		Pattern pattern =Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(lastName).matches();
	}
	public boolean validateEmail(String email){
		Pattern pattern =Pattern.compile(EMAIL);
		return pattern.matcher(email).matches();
	}
}
