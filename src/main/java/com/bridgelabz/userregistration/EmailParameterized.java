package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class EmailParameterized {

	private static  String EMAIL="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
            "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	
	public boolean validateEmail(String email) {
		Pattern pattern =Pattern.compile(EMAIL);
		return pattern.matcher(email).matches();
	}
}
