package com.bridgelabz.userregistration.operation;

import org.junit.Test;

import com.bridgelabz.userregistration.UserRegistration;

import org.junit.Assert;

public class UserRegistrationTest {

	
	@Test
	public void giveFirstName_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("Kshitija");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void giveLastName_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Patil");
		Assert.assertEquals(true, result);
	}
    @Test
	public void giveEmail_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateEmail("abc.xyz@bridgelabz.co.in");
		Assert.assertEquals(true, result);
	}
	@Test
	public void giveMobile_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 9919819801");
		Assert.assertTrue(result);
	}
}
