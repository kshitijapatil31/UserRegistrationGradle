package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistrationLambda {

	public static void main(String[] args) {

		String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{5,8}";
		String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
		String EMAIL = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" + "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

		String MOBILE = "^[+91]{3}\\s{0,1}[0-9]{10}";

		String PASSWORD = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

		// firstName
		ILambdaFuction firstNameValidate = (input) -> {

			Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
			if (pattern.matcher(input).matches())
				return true;

			return false;
		};

		// lastName
		ILambdaFuction lastNameValidate = (input) -> {

			Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
			if (pattern.matcher(input).matches())
				return true;

			return false;
		};

		// Email
		ILambdaFuction emailValidate = (input) -> {

			Pattern pattern = Pattern.compile(EMAIL);
			if (pattern.matcher(input).matches())
				return true;

			return false;
		};

		// MoBile
		ILambdaFuction mobileNoValidate = (input) -> {

			Pattern pattern = Pattern.compile(MOBILE);
			if (pattern.matcher(input).matches())
				return true;

			return false;
		};
		// Password
		ILambdaFuction passwordValidate = (input) -> {

			Pattern pattern = Pattern.compile(PASSWORD);
			if (pattern.matcher(input).matches())
				return true;

			return false;
		};
		System.out.println("when firstname is proper :" + firstNameValidate.validate("Kshitija"));
		System.out.println("when first letter is not capital :" + firstNameValidate.validate("kshitija"));
		System.out.println("when firstname is short :" + firstNameValidate.validate("Ks"));
		System.out.println("when firstname has special character :" + firstNameValidate.validate("Ksh@tija"));
		System.out.println("when firstname has number :" + firstNameValidate.validate("Kshitija31"));
		System.out.println("when firstname is empty :" + lastNameValidate.validate(""));
		System.out.println("/*************/");
		System.out.println("when lastname is proper :" + lastNameValidate.validate("Patil"));
		System.out.println("when first letter is not capital :" + lastNameValidate.validate("patil"));
		System.out.println("when lastname is short :" + lastNameValidate.validate("pa"));
		System.out.println("when lastname has special character :" + lastNameValidate.validate("Patil@"));
		System.out.println("when lastname has number :" + lastNameValidate.validate("Patil31"));
		System.out.println("when firstname is empty :" + lastNameValidate.validate(""));
		System.out.println("/*************/");
		System.out.println("when Email is proper :" + emailValidate.validate("abc.xyz@Bridgelabz.co.in"));
		System.out.println("when email doesn't have spcl char :" + lastNameValidate.validate("abc.xyzBridgelabz.co.in"));
		System.out.println("when email doesnot have TLD :" + lastNameValidate.validate("abc,xyz@Bridgelabz"));
		System.out.println("when firstname is empty :" + lastNameValidate.validate(""));
		System.out.println("/*************/");
		System.out.println("when Mobile No is proper :" + emailValidate.validate("+91 9919819801"));
		System.out.println("when Mobile No have spcl char :" + emailValidate.validate("+91 991&&819801"));
		System.out.println("when mobile have character :" + emailValidate.validate("+91 991&&819801"));
		System.out.println("when mobile is to short :" + emailValidate.validate("+91 991"));
		System.out.println("when mobile is empty :" + emailValidate.validate(""));
		System.out.println("/*************/");
		System.out.println("when Password  is proper :" + passwordValidate.validate("Morningstar@31"));
		System.out.println("When first letter is not capital"+passwordValidate.validate("morningstar@31"));
		System.out.println("when Password  doen't have spcl char :" + passwordValidate.validate("Morningstar31"));
		System.out.println("when Password doesn't have number :" + passwordValidate.validate("Morningstar"));
		System.out.println("when Password is to short :" + passwordValidate.validate("Morn"));
		System.out.println("when Password is empty :" + passwordValidate.validate(""));
	}
}
