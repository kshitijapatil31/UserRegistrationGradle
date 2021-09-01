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
	public void giveFirstName_whenNameNotEnter_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("Ksh");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenspecialChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("K$h");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenbetweencaps_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("KshiTija");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenNumber_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("Ksh31Tija");
		Assert.assertEquals(false, result);
	}
	/**lastname**/
	@Test
	public void giveLastName_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Patil");
		Assert.assertEquals(true, result);
	}
	@Test
	public void giveLastName_whenShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Pa");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterNumber_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Patil31");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterCapsBetween_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("PaTil31");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterSpaceBetween_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("PaT il31");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterSpecialChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Pa@il");
		Assert.assertEquals(false, result);
	}
	/**Email**/
    @Test
	public void giveEmail_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateEmail("abc.xyz@bridgelabz.co.in");
		Assert.assertEquals(true, result);
	}
    /**Mobile**/
	@Test
	public void giveMobile_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 9919819801");
		Assert.assertTrue(result);
	}
	@Test
	public void giveMobile_whenShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 99198");
		Assert.assertFalse(result);
	}
	@Test
	public void giveMobile_whenSpclChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 99@9801198");
		Assert.assertFalse(result);
	}
	@Test
	public void giveMobile_whenToLong_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 9909801198456");
		Assert.assertFalse(result);
	}
	/**PASSWORD**/
	@Test
	public void givePassword_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("Morningstar@31");
		Assert.assertTrue(result);
	}
	@Test
	public void givePassword_whenNOCaps_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morningstar@31");
		Assert.assertFalse(result);
	}
	@Test
	public void givePassword_whenNOShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morning");
		Assert.assertFalse(result);
	}
	@Test
	public void givePassword_whenNOSpclChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morningstar31");
		Assert.assertFalse(result);
	}
	@Test
	public void givePassword_whenNONumber_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morningstar@");
		Assert.assertFalse(result);
	}
}
